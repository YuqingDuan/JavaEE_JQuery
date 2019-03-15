<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/15/2019
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Address Update Page</title>

        <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>

        <%--<script type="text/javascript" src="js/city.js"></script>--%>

        <script type="text/javascript" src="js/city_json.js"></script>
    </head>
    <body>
        province:
        <select id="province" name="province">
            <option value="">-choose-</option>
            <option value="1">GuangZhou</option>
            <option value="2">ShanXi</option>
            <option value="3">SiChuan</option>
        </select>

        city:
        <select id="city" name="city">
            <option value="">-choose-</option>
        </select>
    </body>
</html>
