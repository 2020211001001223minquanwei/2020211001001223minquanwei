<%--
  Created by IntelliJ IDEA.
  User: mqw
  Date: 2022/3/20
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/./header.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/register">
    username<input type="text" name="username"/><br/>
    password<input type="password" name="password"/><br/>
    Email<input type="text" name="email"/><br/>
    Gender:<input type="radio" name="gender" value="male"/>Male <input type="radio" name="gender" value="female"/>Female <br/>
    Date of birth<input type="text name=" name="birthDate"/><br/>
    <input type="submit" value="Register"/>
</body>
</html>
<%@include file="/./footer.jsp"%>