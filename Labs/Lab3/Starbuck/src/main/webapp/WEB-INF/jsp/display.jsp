<%--
  Created by IntelliJ IDEA.
  User: BaoLong
  Date: 3/1/2020
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display</title>
</head>
<body>


    Starbuck's   ${roast.toUpperCase()}  Roast Coffees:

        <table>
            <c:forEach var = "i" begin = "0" end = "${advice.size() - 1}">
                <c:if test="${i%2 == 0}">
                    <tr style="background-color:cyan">
                </c:if>
                <c:if test="${i%2 != 0}">
                    <tr style="background-color:yellow">
                </c:if>
                <td> ${advice.get(i)} </td></tr>
            </c:forEach>
        </table>
</body>
</html>
