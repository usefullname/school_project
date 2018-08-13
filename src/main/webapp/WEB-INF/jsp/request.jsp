<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2017/12/31
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="Css/style.css" />
    <script type="text/javascript" src="JS/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="JS/bootstrap.js"></script>
    <script type="text/javascript" src="JS/ckform.js"></script>
    <script type="text/javascript" src="JS/common.js"></script>
    <script src="JS/Submit.js"></script>

    <style type="text/css">
        body {font-size: 20px;
            padding-bottom: 40px;
            background-color:#e9e7ef;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<%--<form class="form-inline definewidth m20" action="#" method="get">--%>
    <%--<font color="#777777"><strong>申请搜索：</strong></font>--%>
    <%--<input type="text" name="menuname" id="menuname"class="abc input-default" placeholder="" value=""/>--%>
    <%--<button type="submit" class="btn btn-primary">查询</button>--%>
<%--</form>--%>
<%--<table class="table table-bordered table-hover definewidth m10">--%>
    <%--<thead>--%>
    <%--<tr>--%>
        <%--<th>真实姓名</th>--%>
        <%--<th>所在部门</th>--%>
        <%--<th>申请详情</th>--%>
        <%--<th>申请时间</th>--%>
        <%--<th>批准</th>--%>
        <%--<th>管理员</th>--%>
    <%--</tr>--%>
    <%--</thead>--%>
    <%--<tr>--%>
        <%--<td>${ssubmit.ssname}</td>--%>
        <%--<td>${ssubmit.ssdepartment}</td>--%>
        <%--<td>${ssubmit.ssstype},${ssubmit.sssname},${ssubmit.sssnumber}</td>--%>
        <%--<td>2018.${ssubmit.sstime}</td>--%>
        <%--<td><button type="button" onclick="OK()">准许</button>      <button type="button" onclick="NO()">拒绝</button></td>--%>
        <%--<td></td>--%>

    <%--</tr>--%>


<%--</table>--%>

<div class="container" style="width: 100%;margin-top: 15px;margin-left: 50px;">
    <div class="row" style="width: 100%;">
        <!-- 表格 -->
        <div class="col-xs-12">
            <table id="table" class="table table-striped table-bordered table-hover"></table>
        </div>
    </div>
</div>

</body>

<link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table-locale-all.js"></script>

<script src="/JS/requestpage.js"></script>
</html>
