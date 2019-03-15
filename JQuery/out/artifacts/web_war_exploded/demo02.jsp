<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/14/2019
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Demo 02</title>

        <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>

        <script type="text/javascript">
            function get() {
                /*
                text() - 设置或返回所选元素的文本内容
                html() - 设置或返回所选元素的内容（包括 HTML 标记）
                val() - 设置或返回表单字段的值
                */
                // div 标签中没有value属性所以这里不能用.val()的方式赋值
                $.get("Demo001Servlet?name=yuqing&age=26", function (data, status) {
                    // $("#div001").html(data);
                    $("#div001").text(data);
                });
            }
        </script>
    </head>
    <body>
        <input type="button" onclick="get()" value="test request(get) in JQuery">
        <div id="div001" style="width: 100px; height: 100px; border: 1px solid blue">

        </div>
    </body>
</html>
