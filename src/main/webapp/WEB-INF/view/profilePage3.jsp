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


</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: KYOOLBABAA
  Date: 22-06-2020
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <style>
        body{
            background-color: #18ff00;
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
            border-color:#ff4800;
            border-radius:25px;
        }

    </style>
</head>
<body>
<h1>Welcome To ProFile Page
    ${param.username}
</h1>
<a href="logout">Logout</a>
</body>
</html>
