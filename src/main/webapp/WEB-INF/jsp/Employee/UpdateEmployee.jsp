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
<body>
<div class="divForm">
    <h1 class="text-center">人员信息更改页面</h1>
    <hr/>
    <br/>

    <form class="form-inline text-center" action="/dealupdateEmployee" method="post">
        <h5 align="center">员工编号 ${updateEmployeeId}</h5>
        <div class="form-group form-inline">
            <label></label>
            <input type="hidden" name="updateByEmployeeId" class="form-control" value=${updateEmployeeId}>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员姓名：</label>
            <input type="text" name="updateEmployeeName" class="form-control" value=${updateEmployeeName}>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员年龄：</label>
            <input type="text" name="updateEmployeeAge" class="form-control" value=${updateEmployeeAge}>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员收入：</label>
            <input type="text" name="updateEmployeeIncome" class="form-control" value=${updateEmployeeIncome}>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员部门：</label>
            <input type="text" name="updateEmployeeDepart" class="form-control" value=${updateEmployeeDepart}>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>人员职务：</label>
            <input type="text" name="updateEmployeePostion" class="form-control" value=${updateEmployeePosition}>
        </div>
        <br/>
        <br/>
        <br/>
        <input type="submit" class="btn btn-info text-center" value="确定修改"/>
        <input type="reset" class="btn btn-info text-center"/>

    </form>
</div>
<%--<p align="center">${updateStaffError}</p>--%>
</body>
</html>