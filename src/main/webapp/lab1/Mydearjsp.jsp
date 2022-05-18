<%--
  Created by IntelliJ IDEA.
  User: mqw
  Date: 2022/5/18
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Using java code to get value:</h2>
name:<%=request.getParameter("name")%><br>
submit:<%=request.getParameter("send")%><br>
class:<%=request.getParameter("classname")%><br>
id:<%=request.getParameter("id")%><br>
</body>
</html
