<%--
  Created by IntelliJ IDEA.
  User: mqw
  Date: 2022/3/20
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">go to ecjtu</a><br/>
<from method="post">
    Name :<input type="text" name="name"><br/>
    Id :<input type="text" name="id"><br/>
    <input type="submit" value="send data to server"/>
</from>
</body>
</html>
<%@include file="footer.jsp"%>
