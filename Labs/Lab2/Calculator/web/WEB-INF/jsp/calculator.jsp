<%--
  Created by IntelliJ IDEA.
  User: BaoLong
  Date: 2/16/2020
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<div>
    <c:if test="${errors != null}">

        <p id="errors">
            Error(s)!
        <ul>
            <c:forEach var="error" items="${errors}">
                <li>${error}</li>
            </c:forEach>
        </ul>
    </c:if>
</div>
<form action='calculator_save' method='post'>
    <fieldset>
        <legend>Plus two number</legend>
        <input type="text" size = '2' id="add1" name="add1" value="${form.add1}"> +
        <input type="text" size = '2' id="add2" name="add2" value="${form.add2}"> =
        <input type="text" size = '4' id="sum" name="sum" value="${form.sum}" readonly>
        <input type = 'submit' value = 'Submit'/>
    </fieldset>
    <br/>
</form>
</body>
</html>
