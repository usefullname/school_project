<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2017/12/31
  Time: 13:11
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
    <script type="text/javascript" src="JS/bootstrap.js"></script>
    <script type="text/javascript" src="JS/ckform.js"></script>
    <script type="text/javascript" src="JS/common.js"></script>
    <script src="JS/jquery-3.2.1.js" ></script>
    <script type="text/javascript" src="JS/jquerypicture.js"></script>
    <script src="JS/Add.js"></script>

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
<body><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="#777777"><strong>添加材料：</strong></font>
<form action="#" method="post" class="definewidth m20" enctype="multipart/form-data">
    <table style="margin-left:10px;margin-top:3px;">
        <tr>
            <td>材制：</td>
            <td><input type="text" name="cmade" style="width:400px;" id="cmade" placeholder='请输入材质名称'/></td>
        </tr>
        <tr>
            <td>材料名称：</td>
            <td><input type="text" name="cname" style="width:400px;" id="cname" placeholder='请输入材料名称'/></td>
        </tr>
        <tr>
            <td>材料数量：</td>
            <td><input type="text" name="cnumber" style="width:400px;" id="cnumber" placeholder='请输入材料数量'/></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button style="margin-left:5px;" class="btn btn-primary" type="button" onclick="CAdd()">保存</button>
                <button type="button" class="btn btn-success" name="backid" id="backid"><a href="/storeQuery"> 返回列表</a></button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>


