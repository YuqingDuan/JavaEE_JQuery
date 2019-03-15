// 在文档准备就绪的时候，对某一个元素进行onkeyup事件监听
/*
$(document).ready(function(){

})
*/

$(function () {
    $("#kw").keyup(function () {
        // 获取输入框的值
        var kw = $(this).val();

        if (kw == "") {
            $("#div01").hide();
        } else {
            // 请求数据
            $.post("SearchServlet", {kw: kw}, function (data, status) {
                $("#div01").show();
                // 接收list.jsp返回的huml代码<table></table>, 这里不能用val()和text()
                $("#div01").html(data);
            })
        }
    })
});