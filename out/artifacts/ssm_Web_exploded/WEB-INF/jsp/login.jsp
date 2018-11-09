<%--
  Created by IntelliJ IDEA.
  User: caox
  Date: 2018/11/10
  Time: 2:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--使用Spring MVC的表单标签库--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登录</title>
</head>
<%--------------------------------%>
<body>
<%--commandName属性指示表单所关联的对象的名称--%>
<form:form modelAttribute="user" action="/user/login" method="post">
    <fieldset>
        <legend>登录</legend>
        <p>
            <label for="nm">用户名:</label>
                <%--用path属性指明这个字段对应关联对象的哪个属性--%>
            <form:input id="nm" path="name"/>
        </p>
        <p>
            <label for="pwd">密码:</label>
            <form:input id="pwd" path="password"/>
        </p>
        <p>
            <input type="submit" value="登录">
        </p>
    </fieldset>
</form:form>
</body>
</html>
