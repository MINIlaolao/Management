<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/13
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>

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
    <table class="table table-striped table-bordered table-hover table-condensed">
        <thead>
        <tr>
            <th><button type="button" class="btn btn-default btn-lg">
                <span class="glyphicon glyphicon-tag"></span> 员工编号
            </button>
            </th>
            <th><button type="button" class="btn btn-default btn-lg">
                <span class="glyphicon glyphicon-user"></span> 员工姓名
            </button>
            </th>
            <th>
                <button type="button" class="btn btn-default btn-lg">
                    <span class="glyphicon glyphicon-tags"></span> 员工年龄
                </button></th>
            <th>
                <button type="button" class="btn btn-default btn-lg">
                    <span class="glyphicon glyphicon-usd"></span> 员工收入
                </button></th>
            <th><button type="button" class="btn btn-default btn-lg">
                <span class="glyphicon glyphicon-bookmark"></span> 员工部门
            </button></th>
            <th><button type="button" class="btn btn-default btn-lg">
                <span class="glyphicon glyphicon-lock"></span> 员工职务
            </button></th>
        </tr>
        </thead>
        <tbody align="center">
        <tr>
                <td>${selectEmployeeMsg.empId}</td>
                <td>${selectEmployeeMsg.empName}</td>
                <td>${selectEmployeeMsg.empAge}</td>
                <td>${selectEmployeeMsg.empIncome}</td>
                <td>${selectEmployeeMsg.empDepart}</td>
                <td>${selectEmployeeMsg.empPosition}</td>
        </tr>
    </table>
    <button type="button" class="btn btn-default btn-info text-center">
        <span class="glyphicon glyphicon-chevron-left"></span>
        <a href="/ToshowEmployeeList" type="bottom">返回员工信息界面</a>
    </button>
    <button type="button" class="btn btn-default btn-info text-center">
        <span class="glyphicon glyphicon-refresh"></span>
        <a href="/selectEmployee" type="bottom">继续查询</a>
    </button>
</div>
</body>
</html>
