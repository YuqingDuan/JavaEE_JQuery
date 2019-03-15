<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/14/2019
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Demo 01</title>

        <%--外链式写法引入JQuery的js库--%>
        <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>

        <%--编写js代码--%>
        <script type="text/javascript">
            function load() {
                // 底层是get请求回来时用text赋值
                $("#input001").load("Demo001Servlet", function (responseTxt, statusTxt, xhr) {
                    /*
                    可选的 callback 参数规定当 load() 方法完成后所要允许的回调函数。回调函数可以设置不同的参数：
                    responseTxt - 包含调用成功时的结果内容
                    statusTXT - 包含调用的状态
                    xhr - 包含 XMLHttpRequest 对象
                    */
                    // alert(responseTxt);
                    $("#input001").val(responseTxt);
                })
            }
        </script>
    </head>
    <body>
        <%--a标签中href=""默认跳转到当前页面, 即当前页面会刷新一下, 所以用a标签我们看不到实验结果--%>
        <%--<h3><a href="" onclick="load()">test load function in JQuery</a></h3>--%>
        <input type="button" onclick="load()" value="test load function in JQuery">
        <input type="text" id="input001">
    </body>
</html>
