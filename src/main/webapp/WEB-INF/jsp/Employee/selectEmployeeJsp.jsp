<%--
  Created by IntelliJ IDEA.
  User: laoqixin
  Date: 2018/12/13
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<head>
    <title>查找人员</title>
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

<div class="divForm" align="center">
    <h5>查找人员信息</h5>
    <form action="/dealselectEmployee" method="post">
        <h5>人员编号 <input type="text" name="selectEmployeeId"></h5>
            <button type="submit" class="btn btn-default btn-lg">
                <span class="glyphicon">确定查找</span>
            </button>
    </form>
    <button type="button" class="btn btn-default btn-lg">
        <span class="glyphicon"></span>
        <a href="/ToshowEmployeeList" type="bottom">返回员工信息界面</a>
    </button>
</div>
</body>
</html>
