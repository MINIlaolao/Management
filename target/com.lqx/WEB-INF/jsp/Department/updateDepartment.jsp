<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/17
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新部门</title>
</head>
<body>
<form action="/dealUpdateById">
    部门编号:${updateDepartId}
    <input type="hidden" name="departById" value=${updateDepartId}><br><br>
    部门名称:<input type="text" name="departName">
    <input type="submit" value="确认修改">
</form>
</body>
</html>
