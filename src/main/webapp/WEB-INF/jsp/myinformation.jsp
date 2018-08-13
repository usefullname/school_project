<%--
  Created by IntelliJ IDEA.
  User: Mr‘Guo
  Date: 2018/1/6
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<form  id="uploadForm" name="uploadForm"
       enctype="multipart/form-data">
    <input name="messageContent" value="多个参数的情况下">
    <label>文件</label> <input type="file" name="file">
    <button class="btn" type="button" id="doSave">提交</button>
</form>
<a href="/person">返回</a>
</body>
<script src="/JS/jquery-3.2.1.js"></script>
<script src="https://cdn.bootcss.com/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.form/4.2.2/jquery.form.js"></script>
<script>
    $(function() {
        $("#doSave")
            .click(
                function() {
                    $("#uploadForm")
                        .ajaxSubmit(
                            {
                                type : 'post',
                                url : "/tmpInfo/method2.do",

//data:  //注意只要是写在表单里面的，都不需要加这个属性。在controller中可以根据@RequestParam String str获取到属性值。
                                contentType : "application/x-www-form-urlencoded; charset=utf-8",
                                success: function(data) {
//接受到的data还只是一个字符串，需要转成json对象
                                    var obj = JSON.parse(data);
                                    if(obj.flag==true){
                                        alert("上传成功");
                                    }else{
                                        alert("error");
                                    }
                                },
                                error: function (data)//服务器响应失败处理函数
                                {
                                    alert("出错");
                                }
                            });
                });
    });</script>
</html>