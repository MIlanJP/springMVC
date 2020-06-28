<%--
  Created by IntelliJ IDEA.
  User: KYOOLBABAA
  Date: 28-06-2020
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .error {
            color: red;
            font-family: cursive;
        }
    </style>
    <title>User Login Form</title>
</head>
<body>
<%--@elvariable id="user" type="text"--%>
<form:form action="processform" modelAttribute="user">
FirstName : <form:input path="firstName"  placeholder="Enter firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>
    LastName : <form:input path="lastName"  placeholder="Enter your last name" />
    <form:errors path="lastName" cssClass="error"/>

    <br><br>
    UserName:<form:input  path="username"/>
    <br><br>z
    Country:
    <form:select path="country">
    <form:options items="${user.countryOptions}"/>
    </form:select>

    Hobbies:


    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
