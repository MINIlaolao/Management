<%--
  Created by IntelliJ IDEA.
  User: 黄鑫
  Date: 2018/12/14
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加部门</title>
</head>
<body>
    <form action="/insertDepartment" method="post">
        部门编号:<input type="text" name="departId">
        部门名称:<input type="text" name="departName">
        <br><br>
        <br><br>
        <input type="submit" value="添加部门">
    </form>
</body>
</html>
