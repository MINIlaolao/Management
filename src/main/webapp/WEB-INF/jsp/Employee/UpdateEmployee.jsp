<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<link rel="stylesheet" href="<%=basePath %>/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath %>/bootstrap/bootstrap.min.js">
<link rel="stylesheet" href="<%=basePath %>/js/jquery.min.js">
<body>
<%--<form action="/dealupdateEmployee" method="post">--%>
    <%--<h5 align="center">员工编号 ${updateEmployeeId}</h5>--%>
    <%--&lt;%&ndash;name的属性要和controller里面值一致 不然匹配不了数据&ndash;%&gt;--%>
    <%--<input type="hidden" value="${updateEmployeeId}" name =updateByEmployeeId>--%>
    <%--<h5 align="center">员工姓名 <input type="text" name="updateEmployeeName" value=${updateEmployeeName}></h5>--%>
    <%--<h5 align="center">员工年龄 <input type="text" name="updateEmployeeAge" value=${updateEmployeeAge}></h5>--%>
    <%--<h5 align="center">员工收入 <input type="text" name="updateEmployeeIncome" value=${updateEmployeeIncome}></h5>--%>
    <%--<h5 align="center">员工部门 <input type="text" name="updateEmployeeDepart" value=${updateEmployeeDepart}></h5>--%>
    <%--<h5 align="center">员工职位 <input type="text" name="updateEmployeePostion" value=${updateEmployeePosition}></h5>--%>
    <%--<H5 align="center"><input type="submit" value="确定修改"></H5>--%>
<%--</form>--%>
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