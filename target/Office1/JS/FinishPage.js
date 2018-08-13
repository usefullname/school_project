var stname;
var booktime = "";
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
            url: '/finishList',
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
                {field: 'sno' ,width:"25px;",title: '材料编号'},

                {field: 'ssn' ,width:"25px;",title: '申请订单号'},

                {field: 'uuname' ,width:"50px;",title: '申请人姓名'},

                {field: 'uudepartment' ,width:"100px;",title: '申请人部门'},

                {field: 'ustype' ,width:"100px;",title: '材质'},

                {field: 'usname' ,width:"100px;",title: '材料名称'},

                {field: 'usnumber',width:"50px;", title: '材料数量'},

                {field: 'uaname' ,width:"50px;",title: '审批管理员'},

                {field: 'utime',width:"25px;", title: '申请时间（2018）'}

            ]
        })
    }
}
var bstpTable = new BstpTable($("#table"));
bstpTable.inint({});