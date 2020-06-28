<%--
  Created by IntelliJ IDEA.
  User: KYOOLBABAA
  Date: 28-06-2020
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login Form</title>
</head>
<body>
<%--@elvariable id="user" type="text"--%>
<form:form action="processform" modelAttribute="user">
FirstName : <form:input path="firstName" required="true" placeholder="Enter firstName"/>
    <br><br>
    LastName : <form:input path="lastName" required="true" placeholder="Enter your last name" />
    <br><br>
    UserName:<form:input  path="username"/>
    <br><br>z
    Country:
    <form:select path="country">
    <form:options items="${user.countryOptions}"/>
    </form:select>
    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
