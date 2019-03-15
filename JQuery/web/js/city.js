// xml方式
$(function () {
    // 找到省份的元素
    $("#province").change(function () {
        // 一旦省份元素里面的值发生了改变，那么就去请求该省份的城市数据
        var pid = $(this).val();

        // 向服务器发送post请求
        $.post("CityServlet", {pid: pid}, function (data, status) {
            // alert("回来数据了:" + data);
            /*
            * <list>
                  <city>
                    <id>1</id>
                    <cname>shenzhen</cname>
                    <pid>1</pid>
                  </city>
                  <city>
                    <id>2</id>
                    <cname>dongguan</cname>
                    <pid>1</pid>
                  </city>
                  <city>
                    <id>3</id>
                    <cname>zhongshan</cname>
                    <pid>1</pid>
                  </city>
                  <city>
                    <id>4</id>
                    <cname>guangzhou</cname>
                    <pid>1</pid>
                  </city>
                  <city>
                    <id>5</id>
                    <cname>huizhou</cname>
                    <pid>1</pid>
                  </city>
                  <city>
                    <id>6</id>
                    <cname>foshan</cname>
                    <pid>1</pid>
                  </city>
              </list>
            */

            // 先清空以前的值
            $("#city").html("<option value=''>-choose-</option>");

            // 遍历：
            // 从data数据里面找出所有的city， 然后遍历所有的city
            $(data).find("city").each(function () {
                // 遍历一个city，就执行一次function方法
                // 遍历出来的每一个city，取它的孩子。 id , cname
                var id = $(this).children("id").text();
                var cname = $(this).children("cname").text();

                // 给页面相应元素赋响应的值append
                $("#city").append("<option value='" + id + "'>" + cname + "</option>")
            });
        }, "xml");
    });
});