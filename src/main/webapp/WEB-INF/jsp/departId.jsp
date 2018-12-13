<%--
  Created by IntelliJ IDEA.
  User: sziit
  Date: 2018/12/13
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>departID</title>
</head>
<body>
        部门编号：${depart_id.departId}<br>
        部门名称：${depart_id.departName}<br>
    <form action="selectDepartment.jsp" method="post">
        <input type="submit" value="返回查询页面">
    </form>
</body>
</html>
