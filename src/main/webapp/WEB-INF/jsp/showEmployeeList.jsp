<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/13
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.laoqixin.bean.Employee" %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工信息界面</title>
    <style type="text/css">
        .divForm {
            position: absolute; /*绝对定位*/
            width: 600px;
            height: 400px;
            text-align: center; /*(让div中的内容居中)*/
            top: 50%;
            left: 50%;
            margin-top: -200px;
            margin-left: -150px;
        }
    </style>
</head>
<body>
<div class="divForm">
    <a href="/showToAdd">添加员工</a>
    <table>
        <tr>
            <td>员工编号</td>
            <td>员工姓名</td>
            <td>员工年龄</td>
            <td>员工收入</td>
            <td>员工部门</td>
            <td>员工职务</td>
            <td>删除</td>
            <td>更改</td>
            <td><a href="/selectEmployee">查询员工</a></td>
        </tr>
        <c:forEach items="${EmployeeList}" var="employee" varStatus="vs">
            <tr>

                <%--<td>--%>
                    <%--<s:property value="#vs.index+1"/>--%>
                <%--</td>--%>
                <td align = "center">${employee.empId}</td>
                <td align = "center">${employee.empName}</td>
                <td align = "center">${employee.empAge}</td>
                <td align = "center">${employee.empIncome}</td>
                <td align = "center">${employee.empDepart}</td>
                <td align = "center">${employee.empPosition}</td>
                <td><a href="/deleteEmployee?empId=${employee.empId}">删除</a></td>
                <td><a href="/updateEmployee?empId=${employee.empId}&empName=${employee.empName}&empAge=${employee.empAge}&empIncome=${employee.empIncome}&empDepart=${employee.empDepart}&empPosition=${employee.empPosition}">更改</a></td>
                <%--<td align = "center"><html:department pdeptid="${employee.PDeptid}">--%>

                <%--</html:department></td> <!-- 自定义标签 -->--%>
            </tr>
        </c:forEach>
    </table>
    <botton><a href="" </botton>

    <%--&lt;%&ndash; TODO &ndash;%&gt;--%>
    <%--<c:choose>--%>
        <%--<c:when test="${ifFirstPage == true}">--%>

        <%--</c:when>--%>
        <%--<c:when test="${ifFirstPage == false}">--%>
            <%--<a href="/showDetails?pageNum=${pageNum -1}">上一页</a>--%>
        <%--</c:when>--%>
        <%--<c:otherwise>--%>

        <%--</c:otherwise>--%>
    <%--</c:choose>--%>

    <%--<P>当前第${pageNum}页，共有${allPageNum}页</P>--%>

    <%--<c:choose>--%>
        <%--<c:when test="${ifLastPage == true}">--%>

        <%--</c:when>--%>
        <%--<c:when test="${ifLastPage == false}">--%>
            <%--<a href="/showDetails?pageNum=${pageNum+1}">下一页</a>--%>
        <%--</c:when>--%>
        <%--<c:otherwise>--%>

        <%--</c:otherwise>--%>
    <%--</c:choose>--%>

</div>
</body>
</html>
