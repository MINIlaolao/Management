<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/12
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H1 align="center">人员管理系统</H1><br>
<form method="post" action="/signOn">
    <h4 align="center">管理员ID  <input type="text" name="userId"></h4>
    <h4 align="center">管理员密码  <input type="password" name="userPassword"></h4>
    <h4 align="center"><input type="submit" value="登陆"></h4>
    <h4 align="center">${msg}</h4>
</form>
</body>
</html>
