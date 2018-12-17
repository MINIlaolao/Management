<%--
Created by IntelliJ IDEA.
User: 黄鑫
Date: 2018/12/17
Time: 8:25
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<html>
<head>
    <meta charset="utf-8">
    <title>人员部门管理</title>
    <style type="text/css">


        #all{
            width: 100%;
            height: 700px;
        }
        #header{
            margin:auto;
            width: 100%;
            height: 13%;
            background-color: gray;
            color: white;
        }
        #menu{
            width: 15%;
            height: 87%;
            margin: auto;
            float: left;
        }
        #bodier{
            width: 85%;
            height: 87%;
            margin: auto;
            float: left;
            font-size: 80%;

        }
    </style>
</head>
<body>
    <div id="all">
        <div id="header">人员部门管理</div>
        <div id="menu">

        </div>
        <div id="bodier">

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
                    <th><button type="button" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-trash"></span> 删除
                    </button></th>
                    <th><button type="button" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-wrench"></span> 更改
                    </button></th>

                </tr>
                </thead>
                <tbody align="center">
                <c:forEach items="${EmployeeList}" var="Employeelist">
                <tr>
                    <td>${Employeelist.empId}</td>
                    <td>${Employeelist.empName}</td>
                    <td>${Employeelist.empAge}</td>
                    <td>${Employeelist.empIncome}</td>
                    <td>${Employeelist.empDepart}</td>
                    <td>${Employeelist.empPosition}</td>
                    <td><a href="/deleteEmployee?empId=${Employeelist.empId}"> <button type="button" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-trash"></span>
                    </button></a></td>
                    <td><a href="/updateEmployee?empId=${Employeelist.empId}&empName=${Employeelist.empName}&empAge=${Employeelist.empAge}&empIncome=${Employeelist.empIncome}&empDepart=${Employeelist.empDepart}&empPosition=${Employeelist.empPosition}">
                        <button type="button" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-wrench"></span>
                    </button></a></td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
            <a href="/showToAdd"><button type="button" class="btn btn-default btn-lg">
            <span class="glyphicon glyphicon-plus"></span> 添加员工
            </button></a>
             <a href="/selectEmployee"><button type="button" class="btn btn-default btn-lg">
            <span class="glyphicon glyphicon-plus"></span> 查询员工
            </button></a>

        </div>
    </div>
</body>
</html>
