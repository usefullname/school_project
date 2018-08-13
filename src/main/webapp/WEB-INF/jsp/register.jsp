<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2017/12/23
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <!-- 重置文件 -->
    <link rel="stylesheet" href="csszc/normalize.css"/>
    <link rel="stylesheet" href="csszc/style.css"/>
    <title>注册</title>
</head>
<body>
<div class="reg_div">
    <p>注册</p>
    <ul class="reg_ul">
        <li>
            <span>用户名：</span>
            <input type="text" name="" value="" placeholder="真实姓名" class="reg_user" id="account"/>
            <span class="tip user_hint"></span>
        </li>
        <li>
            <span>密码：</span>
            <input type="password" name="" value="" placeholder="6-16位密码" class="reg_password" id="secret"/>
            <span class="tip password_hint"></span>
        </li>
        <li>
            <span>确认密码：</span>
            <input type="password" name="" value="" placeholder="确认密码" class="reg_confirm" id="secret2"/>
            <span class="tip confirm_hint"></span>
        </li>
        <li>
            <button type="button" name="button" class="red_button" onclick="Register()"/>注册</button>
        </li>
        <li>
            <a class="red_button" href="/">返回</a>
        </li>
    </ul>
</div>

<script type="text/javascript" src="jszc/jquery.min.js"></script>
<script src="/jszc/register.js"></script>

</body>
</html>

