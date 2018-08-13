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
            url: '/storehouseList',
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
                {field: 'sno' ,width:"100px;",title: '编号'},

                {field: 'sname' ,width:"150px;",title: '名称'},

                {field: 'snumber',width:"100px;", title: '数量'},

                {field: 'scategory',width:"200px;", title: '材质'}

            ]
        })
    }
}
var bstpTable = new BstpTable($("#table"));
bstpTable.inint({});