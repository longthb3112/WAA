 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(resources/main.css);</style>
</head>
<body>

<div id="global">

<form:form modelAttribute="product" action="product" method="post">
    <fieldset>
        <legend>Add a product</legend>

        <p>
            <label for="category">Category </label>
            <form:select id="category" path="category.id">
                <form:option value="0" label="--Select Category"/>
                <form:options items="${categories}" itemLabel="name" itemValue= "id"/>
            </form:select>

        </p>
         
        <p>
            <label for="name"><spring:message code="product.name" /></label>
            <form:input path="name" id="name"/>
        </p>
        <p>
            <label for="description"><spring:message code="product.description" /></label>
            <form:input path="description" id="description"/>
        </p>
        <p>
            <label for="price"><spring:message code="product.price" /> </label>
            <form:input path="price" id="price"/>
        </p>
        <p id="buttons">
            <form:button id="submit" value="Add Product" >Add Product</form:button>
        </p>
    </fieldset>
    </form:form>
</div>
</body>
</html>
