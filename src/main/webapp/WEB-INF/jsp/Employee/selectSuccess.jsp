<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/13
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询员工信息成功</title>
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
    <table>
        <tr>
            <td>员工编号</td>
            <td>员工姓名</td>
            <td>员工年龄</td>
            <td>员工收入</td>
            <td>员工部门</td>
            <td>员工职务</td>
        </tr>
            <tr>
                <td align = "center">${selectEmployeeMsg.empId}</td>
                <td align = "center">${selectEmployeeMsg.empName}</td>
                <td align = "center">${selectEmployeeMsg.empAge}</td>
                <td align = "center">${selectEmployeeMsg.empIncome}</td>
                <td align = "center">${selectEmployeeMsg.empDepart}</td>
                <td align = "center">${selectEmployeeMsg.empPosition}</td>
            </tr>
    </table>
    <a href="/ToshowEmployeeList" type="bottom">返回员工信息界面</a>
    <a href="/selectEmployee" type="bottom">继续查询</a>
</div>
</body>
</html>
