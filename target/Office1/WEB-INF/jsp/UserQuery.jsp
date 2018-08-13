<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2017/12/31
  Time: 14:00
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
    <script src="selectperson.js"></script>

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
    <%--<font color="#777777"><strong>用户姓名：</strong></font>--%>
    <%--<input type="text" name="menuname" id="menuname"class="abc input-default" placeholder="" value=""/>&nbsp;&nbsp;--%>
    <%--<button type="button" class="btn btn-primary" onclick="selectperson()">查询</button>--%>
<%--</form>--%>
<%--&lt;%&ndash;<table class="table table-bordered table-hover definewidth m10">&ndash;%&gt;--%>
    <%--<thead>--%>
    <%--<tr>--%>
        <%--<th>真实姓名</th>--%>
        <%--<th>密码</th>--%>
        <%--<th>工号</th>--%>
    <%--</tr>--%>
    <%--</thead>--%>
    <%--<tr>--%>
        <%--<td>${vip.vname}</td>--%>
        <%--<td>${vip.vpass}</td>--%>
        <%--<td>${vip.vno}</td>--%>

    <%--</tr>--%>


<%--</table>--%>
<div class="container" style="width: 100%;margin-top: 15px; margin-left: 50px;" >
    <div class="row" style="width: 100%;">
        <!-- 表格 -->
        <div class="col-xs-12">
            <table id="table" class="table table-striped table-bordered table-hover"></table>
        </div>
    </div>
</div>



&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button"  id="addnew">
    <a href="UserDelete">注销员工</a></button>

</body>
        <!-- 分页插件 -->
<link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table-locale-all.js"></script>
<script src="JS/Userpage.js"></script>
</html>