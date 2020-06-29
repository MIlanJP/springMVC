<%--
  Created by IntelliJ IDEA.
  User: KYOOLBABAA
  Date: 28-06-2020
  Time: 00:54
  To change this template use File | Settings | File Templates.
--%>

<%-- Created by IntelliJ IDEA. --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <style type="text/css">
        body{
            background-color: #ffe700;
            /*background-image:url('C:\Users\KYOOLBABAA\Desktop\New folder\LoginForm\WebContent\Phsyco.jpg');*/
            background-size:cover;
        }

        h1{
            background-color:coral;
            height:50px;
            width:300px;
            position:absolute;
            padding:15px;
            line-height:2;
            color: white;
            margin-top:60px;
            margin-left:10%;
            text-align:center;
            padding-bottom:15px;
            border:2px solid;
            font-style:oblique;
            font-family: sans-serif;
            border-width:5px;
            border-color:#ff4800;
            border-radius:25px;
        }

        .user{
            color:#00ffdd;
            font-family:cursive;
            font-size:20px;
            position:absolute;
            top:170px;
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
        .successmessage{
            color:#00ffdd;
            font-family:cursive;
            font-size:20px;
            position:absolute;
            top:200px;
            left:50%;
        }




    </style>
</head>
<body>

<%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

    if(session.getAttribute("username")!=null)
    {
        response.sendRedirect("ProFilePage.jsp");
    }
%>
<form action="login" method="post">
    <h1>Login</h1>
    <div class="user" >
        Username:<input type="text" name="username"><br>
        Password:<input type="password" name="pass"><br>
        <button type="submit">Login</button>
        <a href="redirectToRegisterPage">Click here to register</a>
    </div>>
</form>
</body>
</html>

