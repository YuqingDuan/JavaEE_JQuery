// json方式
$(function () {
    // 找到省份的元素
    $("#province").change(function () {
        // 一旦省份元素里面的值发生了改变，那么就去请求该省份的城市数据
        var pid = $(this).val();

        // 向服务器发送post请求
        $.post("CityJsonServlet", {pid: pid}, function (data, status) {
            // alert("回来数据了:" + json);

            /*
            * [
            * {"cname":"shenzhen","id":1,"pid":1},
            * {"cname":"dongguan","id":2,"pid":1},
            * {"cname":"zhongshan","id":3,"pid":1},
            * {"cname":"guangzhou","id":4,"pid":1},
            * {"cname":"huizhou","id":5,"pid":1},
            * {"cname":"foshan","id":6,"pid":1}
            * ]
            * */
            // 先清空
            $("#city").html("<option value=''>-choose-</option>");
            // 遍历：
            // 从json数据里面找出所有的city， 然后遍历所有的city
            $(data).each(function (index, element) {
                // 遍历出来的每一个city，取它的孩子。 id , cname
                // 给页面相应元素赋响应的值append
                $("#city").append("<option value='" + element.id + "'>" + element.cname + "</option>");
            });
        }, "json");
    });
});