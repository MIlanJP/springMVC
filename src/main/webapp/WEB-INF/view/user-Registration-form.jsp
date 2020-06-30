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
    <style type="text/css">
        body{
            background-color: #fff005;
            /*background-image:url('C:\Users\KYOOLBABAA\Desktop\New folder\LoginForm\WebContent\Phsyco.jpg');*/
            background-size:cover;
        }

        h1{
            background-color: #f64b07;
            height:50px;
            width:300px;
            position:absolute;
            padding:15px;
            line-height:2;
            color: white;
            margin-top:30px;
            margin-left:10%;
            text-align:center;
            padding-bottom:15px;
            border:2px solid;
            font-style:oblique;
            font-family: sans-serif;
            border-width:5px;
            border-color: #01ff5c;
            border-radius:25px;
        }

        .user{
            color:#00ffdd;
            font-family:cursive;
            font-size:20px;
            position:absolute;
            top:130px;
            left:13%;
        }
        input[type=text]:focus{
            width:300px;
            height:50px;
        }
        input[type=password]:focus{
            width:300px;
            height:50px;
        }
        .error{
            color: #ffffff;
            font-family:cursive;
            font-size:20px;
        }

        .message{
            color: #00ffcc;
            font-family:cursive;
            font-size:20px;
            position:absolute;
            top:200px;
            left:50%;
        }

    </style>
    <title>User Registration form</title>
</head>
<body>
<%--@elvariable id="user" type="text"--%>
<h1>Register</h1>
<form:form action="gotoLoginPage" modelAttribute="user" >
<div class="user">
FirstName : <form:input path="firstName"  placeholder="Enter firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    LastName : <form:input path="lastName"  placeholder="Enter your last name" />
    <form:errors path="lastName" cssClass="error"/>

    <br>
    Email :<form:input path="email" placeholder="Enter your email"/>
    <form.errors path="email" cssClass="error"/>
    <br>

    ContactNo:<form:input path="contactNo" placeholder="Enter your contact"/>
    <form:errors path="contactNo" cssClass="error"/>
    <br>
    UserName:<form:input  path="username"/>
    <br>

    <input type="password" name="pass" placeholder="Enter the password" required="true">

    <input type="submit" value="Register"/>
    <a href="redirectToLoginPage">Click Here To login</a>
</div>

    <% if(request.getAttribute("eMessage")!=null){%>
    <div class="message">
        <%=request.getAttribute("eMessage")%>
<%--        <%session.invalidate();%>--%>
    </div>
    <%}%>

</form:form>


</body>
</html>
