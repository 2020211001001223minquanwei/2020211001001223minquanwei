<%--
  Created by IntelliJ IDEA.
  User: mqw
  Date: 2022/5/11
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.minquanwei.Person" %>
<%@ page import="com.minquanwei.Dog" %>
<html>
<head>
    <title>Demo 2 - week 11</title>
</head>
<body>
<%
    //create object
    Person person = new Person();
    person.setName("Tom");
    Dog dog = new Dog();
    dog.setName("Tommy");
    person.setDog(dog);
    //set attribute in any one scope
    request.setAttribute("PersonAtt",person);
%>
<h2> get person's dog name using java code</h2>
<%
    Person person1 = (Person) pageContext.findAttribute("PersonAtt");
    Dog dog1 = person1.getDog();
    out.println(person1.getName()+"'s Dog name is "+dog1.getName());
%>
<h2> get person's dog name using EL code</h2>
${PersonAtt.name}'s Dog name is ${PersonAtt.dog.name}
</body>
</html>
