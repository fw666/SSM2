<%--
  Created by IntelliJ IDEA.
  User: 12
  Date: 2019/11/11
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/user/selectUser">select user</a>
    <br><br>
    <a href="/user/selectUserById?id=1">select userById</a>
    <br><br>
    <form action="/user/insertUser" method="post">

        <input type="text" name="id" value="4">
        <br>
        <input type="text" name="name" value="fw">
        <br>
        <input type="text" name="age" value="14">
        <br>
        <input type="text" name="city" value="beijing">
        <br>
        <input type="text" name="money" value="45.0">
        <br><input type="submit" value="submit">
    </form>
</body>
</html>
