<%--
  Created by IntelliJ IDEA.
  User: sziit
  Date: 2018/12/13
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>部门</title>
</head>
<body>

        <form action="/insertDepartment" method="post">
            <input type="submit" value="添加部门">
        </form>

    <table border="2px">
            <tr>
                <th>部门编号</th>
                <th>部门名称</th>
            </tr>

                <c:forEach items="${depart}" var="d">
                    <tr>
                        <td>${d.departId}</td>
                        <td>${d.departName}</td>
                        <td><a href="/updateById?departId=${d.departId}&departName=${d.departName}">更新</a></td>
                        <td><a href="/deleteById?departId=${d.departId}">删除</a></td>
                    </tr>
                </c:forEach>
    </table>
        <form action="selectDepartment.jsp" method="post">
            <input type="submit" value="返回查询页面">
        </form>
</body>
</html>
