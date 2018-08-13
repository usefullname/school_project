function CAdd() {
    $.ajax({
        url:"/Add/CAdd",
        type:"post",
        data:{"cmade":$("#cmade").val(), "cname":$("#cname").val(),"cnumber":$("#cnumber").val()},
        success:function(data){
            console.log(data);
            if(data==="ok2"){
                alert("材料增加");
            }
            else if(data==="no") {
                alert("新增材料");
            }
            else if(data==="nom"){
                alert("新增材料2");
            }
            else if(data ==="no2"){
                alert("请填写全部信息");
            }
            else {
                alert("增加成功");
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

function CUpdate() {
    $.ajax({
        url:"/Add/CUpdate",
        type:"post",
        data:{"cmade":$("#cmade").val(), "cname":$("#cname").val(),"cnumber":$("#cnumber").val(), "thisno":$("#thisno").val()},
        success:function(data){
            console.log(data);
            if(data==="ok1"){
                alert("修改成功");
            }
            else if(data==="no1") {
                alert("找不到该材料");
            }
            else if(data==="no2"){
                alert("请输入编号");
            }
            else if(data ==="no3"){
                alert("已有该材料,且材料编号不对应");
            }
            else {
                alert("请填写数量");
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

function CDelete() {
    $.ajax({
        url:"/Add/CDelete",
        type:"post",
        data:{"cmade":$("#cmade").val(), "cname":$("#cname").val()},
        success:function(data){
            console.log(data);
            if(data==="ok"){
                alert("已删除");
            }
            else if(data==="no2"){
                alert("请填写信息完全");
            }
            else {
                alert("没有该材料");
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}

// function CUpdate() {
//     $.ajax({
//         url:"/Add/CUpdate",
//         type:"post",
//         data:{"cmade":$("#cmade").val(), "cname":$("#cname").val(),"cnumber":$("#cnumber").val()},
//         success:function(data){
//             console.log(data);
//             if(data==="ok1"){
//                 alert("修改成功");
//             }
//             else if(data==="no1") {
//                 alert("找不到该材料");
//             }
//             else if(data==="no2"){
//                 alert("请单独修改或确定是否有修改");
//             }
//             else {
//                 alert("目前无该材料");
//             }
//         },
//         error: function(XMLHttpRequest, textStatus, errorThrown) {
//             alert(XMLHttpRequest.status);
//             alert(XMLHttpRequest.readyState);
//             alert(textStatus);
//         }
//     });
// }

function UDelete() {
    $.ajax({
        url:"/Add/UDelete",
        type:"post",
        data:{"uid":$("#uid").val()},
        success:function(data){
            console.log(data);
            if(data==="ok"){
                alert("已删除");
            }
            else if(data ==="no2"){
                alert("请输入员工号");
            }
            else {
                alert("没有该员工");
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });
}