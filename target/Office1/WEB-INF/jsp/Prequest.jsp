<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2018/1/2
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <!-- 重置文件 -->
    <link rel="stylesheet" href="csszc/normalize.css"/>
    <link rel="stylesheet" href="csszc/style.css"/>
    <title>申请表</title>
</head>
<body>
<div class="reg_div">
    <p>申请表单</p>
    <ul class="reg_ul">
        <li>
            <span>申请者：</span>
            <input type="text" name="" value="" placeholder="申请者"  id="ssname"/>
        </li>
        <li>
            <span>申请部门：</span>
            <input type="text" name="" value="" placeholder="申请部门"  id="uudepartment"/>
        </li>
        <li>
            <span>材料名称：</span>
            <input type="text" name="" value="" placeholder="申请材料名称"  id="sssname"/>
        </li>
        <li>
            <span>材料材质：</span>
            <input type="text" name="" value="" placeholder="申请材料材质"  id="ssstype"/>
        </li>
        <li>
            <span>材料数量：</span>
            <input type="text" name="" value="" placeholder="申请材料数量"  id="sssnumber"/>
        </li>
        <li>
            <span>申请时间：</span>
            <input type="text" name="" value="" placeholder="申请时间 月.日（如1.3）"  id="sstime"/>
        </li>
        <li>
            <button type="button" name="button" class="red_button" onclick="SSubmit()">提交</button>
        </li>
        <li>
            <a class="red_button" href="/person">返回</a>
        </li>
    </ul>
</div>

<script type="text/javascript" src="jszc/jquery.min.js"></script>
<script src="/JS/Submit.js"></script>

</body>
</html>

