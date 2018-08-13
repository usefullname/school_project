var permit = ["通过","拒绝"];
var sort="spnum asc";

//分页
class BstpTable {

    constructor(obj) {
        this.obj = obj;
    }

    inint() {
        //---先销毁表格 ---
        this.obj.bootstrapTable('destroy');
        //---初始化表格,动态从服务器加载数据---
        this.obj.bootstrapTable({
            //【发出请求的基础信息】
            url: '/submitList',
            method: 'get',
            contentType: "application/x-www-form-urlencoded",
            queryParamsType: '',
            queryParams: function queryParams(params) {
                var param = {
                    pagenumber: params.pageNumber,
                    pagesize: params.pageSize
                };
                return param;
            },

            //【其它设置】
            locale: 'zh-CN',//中文支持
            pagination: true,//是否开启分页（*）
            pageNumber: 1,//初始化加载第一页，默认第一页
            pageSize: 10,//每页的记录行数（*）
            pageList: [10],//可供选择的每页的行数（*）
            sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
            showRefresh: false,//刷新按钮
            sortable: true,      //是否启用排序
            sortOrder: "asc",     //排序方式
            search:true,

            height:510 ,//table的高度
            //【设置列】
            columns: [
                {field: 'ssn' ,width:"25px;",title: '编号'},

                {field: 'ano' ,width:"150px;",title: '进行（准许/拒绝）管理员的编号'},

                {field: 'vno' ,width:"50px;",title: '申请人工号'},

                {field: 'ssname' ,width:"100px;",title: '申请人名字'},

                {field: 'ssdepartment' ,width:"50px;",title: '所在部门'},

                {field: 'sssname' ,width:"50px;",title: '材料名称'},

                {field: 'ssstype',width:"50px;", title: '材质'},

                {field: 'sssnumber' ,width:"25px;",title: '数量'},

                {field: 'sstime',width:"50px;", title: '申请时间（2018）',sortable:true},

                {
                    field: 'ssn', title: '',
                    formatter: function (value, row, index) {
                        return '<a class="btn btn-info" onclick="okyes(\'' + value + '\')">准许</a>';
                    }
                },

                {
                    field: 'ssn', title: '',
                    formatter: function (value, row, index) {
                        return '<a class="btn btn-info" onclick="refuse(\'' + value + '\')">拒绝</a>';
                    }
                }
            ]
        })
    }
}
var bstpTable = new BstpTable($("#table"));
bstpTable.inint({});
function okyes(ssn){
    $.ajax({
        url:"/Submit/Permit",
        type:"post",
        data:{"ssn":ssn},
        success:function(data){
            console.log(data);
            if(data==="ok"){
                alert("已准许");
                bstpTable.inint({});
            }
            else if(data==="no1"){
                alert("该人员已被裁员");
                bstpTable.inint({});
            }
            else if(data === "no2"){
             alert("材料数量已经不够");
                bstpTable.inint({});
            }
            else {
                alert("已经进行准许或否决操作");
                bstpTable.inint({});
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

function refuse(ssn){
    $.ajax({
        url:"/Submit/refuse",
        type:"post",
        data:{"ssn":ssn},
        success:function(data){
            console.log(data);
            if(data==="ok"){
                alert("已拒绝");
                bstpTable.inint({});
            }
            else {
                alert("已经进行准许或否决操作");
                bstpTable.inint({});
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}