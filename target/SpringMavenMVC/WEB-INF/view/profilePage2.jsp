<%--
  Created by IntelliJ IDEA.
  User: KYOOLBABAA
  Date: 28-06-2020
  Time: 01:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile Page</title>
</head>
<body>
<br>
<br>
<h1>Welcome To ProFile Page
<%= request.getParameter("uname")%>
Printing message ${param.uname} ${message}</h1>

</body>
</html>
