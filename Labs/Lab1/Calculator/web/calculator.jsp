<%--
  Created by IntelliJ IDEA.
  User: BaoLong
  Date: 2/16/2020
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action='calc2' method='post'>
    <input type = 'text' size = '2' name = 'add1'   /> +
    <input type = 'text' size = '2' name = 'add2'   /> =
    <input type = 'text' size = '4' name = 'sum'     readonly  /> <br/>
    <input type = 'text' size = '2' name = 'mult1'  /> *
    <input type = 'text' size = '2' name = 'mult2'  /> =
    <input type = 'text' size = '4' name = 'product'  readonly  /><br/>
    <input type = 'submit' value = 'Submit'/>
</form>
</body>
</html>
