<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<form action="/dealupdateEmployee" method="post">
    <h5 align="center">员工编号 ${updateEmployeeId}</h5>
    <%--name的属性要和controller里面值一致 不然匹配不了数据--%>
    <input type="hidden" value="${updateEmployeeId}" name =updateByEmployeeId>
    <h5 align="center">员工姓名 <input type="text" name="updateEmployeeName" value=${updateEmployeeName}></h5>
    <h5 align="center">员工年龄 <input type="text" name="updateEmployeeAge" value=${updateEmployeeAge}></h5>
    <h5 align="center">员工收入 <input type="text" name="updateEmployeeIncome" value=${updateEmployeeIncome}></h5>
    <h5 align="center">员工部门 <input type="text" name="updateEmployeeDepart" value=${updateEmployeeDepart}></h5>
    <h5 align="center">员工职位 <input type="text" name="updateEmployeePostion" value=${updateEmployeePosition}></h5>
    <H5 align="center"><input type="submit" value="确定修改"></H5>
</form>
<%--<p align="center">${updateStaffError}</p>--%>
</body>
</html>