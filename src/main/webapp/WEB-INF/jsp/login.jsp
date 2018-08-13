<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2017/12/20
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录</title>
    <link href="cssdl/style.css" rel="stylesheet" type="text/css" />
    <script src="JS/jquery-3.2.1.js" ></script>
    <script src="/jszc/register.js"></script>

</head>

<body>
<div id="web">
    <p style="height:180px;"></p>
    <p align="center"><img src="images/logzi.png" /></p>
    <p style="height:40px;"></p>
    <div class="login">
        <div class="banner">
            <iframe id="frame_banner" src="sban/banner.html" height="218" width="100%"  allowtransparency="true" title="test"  scrolling="no" frameborder="0"></iframe>
        </div>
        <div class="logmain">
            <h1>&nbsp;</h1>
            <div class="logdv">
                <span class="logzi">账 号：</span>
                <input name="account" type="text" id="account" class="ipt" />
            </div>
            <div class="logdv">
                <span class="logzi">密 码：</span>
                <input name="secret" type="password" id="secret" class="ipt" />
            </div>
            <div class="logdv">
                <p class="logzi">&nbsp;</p>
                <a href="#" class="more">忘记密码</a>
                <select name="cars" id="selectuser">
                    <option value="员工">员工</option>
                    <option value="管理员">管理员</option>
                </select>
            </div>
            <div class="logdv" id="Log" style="height:40px;">
                <p class="logzi">&nbsp;</p>
                <input name="button" type="button" class="btnbg" value="点击登录" id="submit" onclick="Login()"/>
            </div>
            <div>
                <a href="register" class="more">注册</a>
            </div>
        </div>
    </div>
    <p style="height:100px;"></p>
    <p align="center">.</p>
</div>
</body>
</html>

