function SSubmit() {
    $.ajax({
        url: "/Submit/Sq",
        type: "post",
        data: {"ssname": $("#ssname").val(),
            "uudepartment": $("#uudepartment").val(),
            "sssname": $("#sssname").val(),
            "ssstype": $("#ssstype").val(),
            "sssnumber": $("#sssnumber").val(),
            "sstime": $("#sstime").val(),},
        success: function (data) {
            console.log(data);
            if (data === "ok") {
                alert("已经申请，我们会尽快处理");
            }
            else if(data === "no1") {
                alert("材料库材料，我们会尽快收购");
            }
            else if(data === "no2"){
                alert("仓库材料不足");
            }
            else if(data ==="no3"){
                alert("用户未注册");
            }
            else{
                alert("登录人员与申请人员不一致");
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    })
}
