function Login(){
    $.ajax({
        url:"/login/userlogin",
        type:"post",
        data:{account:$("#account").val(), secret:$("#secret").val(),select:$("#selectuser").val()},
        success:function(data){
            console.log(data);
            if(data==="no")//登录失败
                window.location.href="/";
            else if(data==="person"){
                window.location.href="/person";
            }
            else if(data === "no2"){
                alert("没有该管理");
                window.location.href="/";
            }
            else if(data === "no3"){
                alert("没有该员工");
                window.location.href="/";
            }
            else{
                window.location.href="/backstage";
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

function Register(){
    $.ajax({
        url:"/login/userregister",
        type:"post",
        data:{account:$("#account").val(), secret:$("#secret").val(),secret2:$("#secret2").val()},
        success:function(data){
            console.log(data);
            if(data=="no") {//登录失败
                alert("用户已注册");
                window.location.href = "/register";
            }
            else if(data === "no2"){
                alert("密码不一致");
                window.location.href = "/register";
            }
            else if(data === "no3"){
                alert("密码长度不能低于6");
                window.location.href = "/register";
            }
            else if(data === "no4"){
                alert("用户名不能为空");
            }
            else {
                window.location.href="/";
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

function Updatepass() {
    $.ajax({
        url: "/login/userupdate",
        type: "post",
        data: {account: $("#account").val(), password: $("#password").val(), secret: $("#secret").val(),secret2: $("#secret2").val()},
        success: function (data) {
            console.log(data);
            if (data == "no2") {//登录失败
                alert("密码不一致");
                window.location.href = "/fix";
            }
            else if(data === "no1"){
                alert("原密码不正确");
                window.location.href = "/fix";
            }
            else if(data === "no3"){
                alert("密码长度不能低于6");
                window.location.href = "/fix";
            }
            else {
                alert("修改成功");
                window.location.href = "/";
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

function exit(){
    $.ajax({
        url:"/login/exit",
        type:"post",
        success:function(data){
            console.log(data);
            if(data==="ok") {
                window.location.href=("/person");
            }
            else {
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

