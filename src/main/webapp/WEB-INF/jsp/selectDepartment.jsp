<%--
  Created by IntelliJ IDEA.
  User: sziit
  Date: 2018/12/13
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门查询页面</title>
</head>
<body>
    <form action="/showDepartmentById" method="post">
            部 门 ID:<input type="text" name="departId">
                <input type="submit" value="查询">
    </form>
<br>
<br>
<br>
    <form action="/showDepartment" method="post">
        <input type="submit" value="查询所有">
    </form>
</body>
</html>
