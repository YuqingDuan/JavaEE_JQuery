<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/14/2019
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table style="width: 100%">
    <c:forEach items="${list}" var="kwBean">
        <tr>
            <td>${kwBean.kw}</td>
        </tr>
    </c:forEach>
</table>
