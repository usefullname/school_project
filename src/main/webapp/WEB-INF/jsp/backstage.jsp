<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2017/12/20
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>XX办公室耗材管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/adminStyle.css" rel="stylesheet" type="text/css" />

    <title>办公室耗材管理系统</title>
    <script type="text/javascript" src="JS/jquery-3.2.1.js"></script>
    <script src="jszc/register.js"></script>
    <script type="text/javascript">
        $(document).ready(
            function() {
                $(".div2").click(
                    function() {
                        $(this).next("div").slideToggle("slow").siblings(
                            ".div3:visible").slideUp("slow");
                    });
            });
        function openurl(url) {
            var rframe = parent.document.getElementById("rightFrame");
            rframe.src = url;
        }
    </script>
    <style>
        body {
            margin: 0;
            font-family: 微软雅黑;
            /*background-image: url(images/.jpg);*/
            background-repeat: no-repeat;
            background-size: cover;
            background-attachment: fixed;
            background-color: #DDDDDD

        }

        .top1 {
            position: absolute;
            top: 0px;
            width: 100%;
            height: 20px;
            text-align: center;
            color: #FFFFFF;
            font-size: 17px;
            font-height: 20px;
            font-family: 楷体;
            background-color: #888888
        }

        .title {
            float:left;
            margin:-32px 20px;
            font-size: 40px;
            color: #FFFFFF;
            font-height: 55px;
            font-family: 隶书;
        }

        .top2 {
            position: absolute;
            top: 20px;
            width: 100%;
            height: 77px;
            text-align: center;
            color: #ccffff;
            background-color: #888888
        }

        .left {
            position: absolute;
            left: 0px;
            top: 97px;
            width: 200px;
            height: 85%;
            border-right: 1px solid #9370DB;
            color: #000000;
            font-size: 20px;
            text-align: center;
            background-color: #B3B3B3
        }

        .right {
            position: absolute;
            left: 200px;
            top:97px;
            width: 85.2%;
            height: 85%;
            border-top: 0px solid #484860;
            font-size: 14px;
            text-align: center;
        }

        .end {
            position: absolute;
            bottom: 0px;
            width: 100%;
            height: 30px;
            text-align: center;
            color: #556B2F;
            font-size: 17px;
            font-height: 20px;
            font-family: 楷体;
            background-color: #C0C0C0
        }

        .div1 {
            text-align: center;
            width: 200px;
            padding-top: 10px;
        }

        .div2 {
            height: 40px;
            line-height: 40px;
            cursor: pointer;
            font-size: 18px;
            position: relative;
            border-bottom: #ccc 0px dotted;
        }

        .ckgl {
            position: absolute;
            height: 20px;
            width: 20px;
            left: 40px;
            top: 10px;
            background: url(/images/1.png);
        }

        .yhgl {
            position: absolute;
            height: 20px;
            width: 20px;
            left: 40px;
            top: 10px;
            background: url(/images/4.png);
        }

        .sqgl {
            position: absolute;
            height: 20px;
            width: 20px;
            left: 40px;
            top: 10px;
            background: url(/images/8.png);
        }

        .tcht {
            position: absolute;
            height: 20px;
            width: 20px;
            left: 40px;
            top: 10px;
            background: url(/images/2.png);
        }

        .div3 {
            display: none;
            cursor: pointer;
            font-size: 15px;
        }

        .div3 ul {
            margin: 0;
            padding: 0;
        }

        .div3 li {
            height: 30px;
            line-height: 30px;
            list-style: none;
            border-bottom: #ccc 1px dotted;
            text-align: center;
        }

        .a {
            text-decoration: none;
            color: #000000;
            font-size: 15px;
        }

        .a1 {
            text-decoration: none;
            color: #000000;
            font-size: 18px;
        }
    </style>
</head>
<body>

<div class="top1">
    <marquee scrollAmount="4" width="300">办公室耗材管理系统</marquee>
</div>
<div class="top2">
    <!--<div class="logo">-->
    <!--<img src="images/admin_logo.png" title="在哪儿" />-->
    <!--</div>-->
    <div class="title" >
        <h3></h3>
    </div>
    <div class="fr top-link">
        <a href="admin_list.html" target="mainCont" title="DeathGhost"><i
                class="adminIcon"></i><span>管理员：<%= session.getAttribute("username").toString()%></span></a>
    </div>
</div>

<div class="left">
    <div class="div1">
        <div class="left_top">
            <img src="images/bbb_01.jpg"/><img src="images/bbb_02.jpg"
                                               id="2"/><img src="images/bbb_03.jpg"/><img
                src="images/bbb_04.jpg"/>
        </div>
        <div class="div2">
            <div class="ckgl"></div>
            仓库管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('/storeQuery');">材料</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('RuKu');">入库统计</a></li>
            </ul>
        </div>
        <div class="div2">
            <div class="yhgl"></div>
            用户管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('/UserQuery');">用户管理</a></li>
            </ul>
        </div>
        <div class="div2">
            <div class="sqgl"></div>
            申请管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('/request');">申请列表</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('finish');">完成审批记录</a></li>
            </ul>
        </div>
    </div>
    <a class="a1" onclick="exit()"><div class="div2">
        <div class="tcht"></div>
        退出后台
    </div></a>
</div>

<div class="right">
    <iframe id="rightFrame" name="rightFrame" width="100%" height="100%"
            scrolling="auto" marginheight="0" marginwidth="0" align="center"
            style="border: 0px solid #CCC; margin: 0; padding: 0;"></iframe>
</div>
</body>
</html>
