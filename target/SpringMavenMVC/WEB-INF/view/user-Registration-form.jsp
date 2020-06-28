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
<form:form action="user" modelAttribute="user">
FirstName : <form input="text" path="firstName" required placeholder="Enter firstName"/>
    <br><br>
    LastName : <form input="text" path="lastName" required placeholder="Enter your last name" />

    UserName:<form input="text" path="username" required placeholder="Enter username" />

    Password:<form input="password" path="password" required placeholder="Enter your password"/>
    <input type="submit" value="Register"
</form:form>
</body>
</html>
