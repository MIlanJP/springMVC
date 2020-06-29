<%--
  Created by IntelliJ IDEA.
  User: KYOOLBABAA
  Date: 29-06-2020
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <style>
        .errormessage{
            color: #ffffff;
            font-family:cursive;
            font-size:20px;
            position:absolute;
            top:200px;
            left:50%;
        }
    </style>
</head>
<body>
<%@ include file="user-Registration-form.jsp"%>
<div class="errormessage">
    Username already Taken
</div>
</body>
</html>
