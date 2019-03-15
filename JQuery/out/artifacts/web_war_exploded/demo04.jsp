<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/14/2019
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>google</title>

        <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>

        <script type="text/javascript" src="js/google.js"></script>
    </head>
    <body>
        <center>
            <h2>Google</h2>
            <input type="text" name="kw" id="kw" style="width: 600px; height: 50px; font-size: 20px;">
            <input type="button" value="search" style="height: 50px; width: 100px;">

            <div id="div01"
                 style="position: relative; left: -54px; width: 600px; height: 200px; border: 1px solid blue; display: none">
            </div>
        </center>
    </body>
</html>
