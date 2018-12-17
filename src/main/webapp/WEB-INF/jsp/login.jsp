<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--<%--%>
    <%--String path = request.getContextPath();--%>
    <%--String basePath = request.getScheme() + "://"--%>
            <%--+ request.getServerName() + ":" + request.getServerPort()--%>
            <%--+ path + "/";--%>
<%--%>--%>
<!DOCTYPE HTML>
<html>
<head>
    <title>人员管理后台系统</title>
    <%--<link href="<%=basePath %>css/style.css" rel="stylesheet" type="text/css" media="all" />--%>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!-- -->
    <script>var __links = document.querySelectorAll('a');function __linkClick(e) { parent.window.postMessage(this.href, '*');} ;for (var i = 0, l = __links.length; i < l; i++) {if ( __links[i].getAttribute('data-t') == '_blank' ) { __links[i].addEventListener('click', __linkClick, false);}}</script>

    <%--<script type= "text/javascript" src= "<%=basePath %>js/jquery.min.js"></script >--%>
    <link href="${pageContext.request.contextPath}/js/jquery.min.js" rel="stylesheet" type="text/css"/>
    <script>$(document).ready(function(c) {
        $('.alert-close').on('click', function(c){
            $('.message').fadeOut('slow', function(c){
                $('.message').remove();
            });
        });
    });
    </script>
</head>
<body style="background: url(${pageContext.request.contextPath}/images/bg.jpg)">
<!-- contact-form -->
<div class="message warning">
    <div class="inset">
        <div class="login-head">
            <h1>人员管理系统</h1>
            <div class="alert-close"> </div>
        </div>
        <form action="/signOn" method="post">
            <li>
                <input type="text" name="userId" class="text" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'UserId';}"><a href="#" class=" icon user"></a>
            </li>
            <div class="clear"> </div>
            <li>
                <input type="password" name="userPassword" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"> <a href="#" class="icon lock"></a>
            </li>
            <div class="clear"> </div>
            <div class="submit">
                <input type="submit"  value="登录" >

                <div class="clear">  </div>
            </div>

        </form>
        <h1>${msg}</h1>
    </div>
</div>
</div>
<div class="clear"> </div>


</body>
</html>