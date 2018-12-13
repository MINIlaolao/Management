<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/13
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加人员</title>
    <style type="text/css">
    .divForm{
    position: absolute;/*绝对定位*/
    width: 300px;
    height: 200px;
    text-align: center;/*(让div中的内容居中)*/
    top: 50%;
    left: 50%;
    margin-top: -200px;
    margin-left: -150px;
    }
    </style>
</head>
<body>
<h5 align="center">添加人员信息</h5>
<div class="divForm">
    <form action="/dealToAdd" method="post">
        <h5 align="center">人员编号 <input type="text" name="addEmployeeId"></h5>
        <h5 align="center">人员姓名 <input type="text" name="addEmployeeName"></h5>
        <h5 align="center">人员年龄 <input type="text" name="addEmployeeAge"></h5>
        <h5 align="center">人员收入 <input type="text" name="addEmployeeIncome"></h5>
        <h5 align="center">人员部门 <input type="text" name="addEmployeeDepart"></h5>
        <h5 align="center">人员职务 <input type="text" name="addEmployeePosition"></h5>
        <H5 align="center"><input type="submit" value="确定新增"></H5>
    </form>
</div>
</body>
</html>
