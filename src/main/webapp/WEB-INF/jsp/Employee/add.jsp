<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/13
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
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
<div class="divForm">
    <h1 class="text-center">人员信息添加页面</h1>
    <hr/>
    <br/>
    <form class="form-inline text-center" action="/dealToAdd" method="post">
        <div class="form-group form-inline">
            <label>人员编号：</label>
            <input type="text" name="addEmployeeId" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员姓名：</label>
            <input type="text" name="addEmployeeName" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员年龄：</label>
            <input type="text" name="addEmployeeAge" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员收入：</label>
            <input type="text" name="addEmployeeIncome" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员部门：</label>
            <input type="text" name="addEmployeeDepart" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员职务：</label>
            <input type="text" name="addEmployeePosition" class="form-control"/>
        </div>
        <br/>
        <br/>
        <br/>
        <input type="submit" class="btn btn-info text-center"/>
        <input type="reset" class="btn btn-info text-center"/>
        <a href="/ToshowEmployeeList" type="bottom">返回员工信息界面</a>
    </form>
</div>
</body>
</html>
