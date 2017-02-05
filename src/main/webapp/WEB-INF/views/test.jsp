<%--
  Created by IntelliJ IDEA.
  User: Shawearn
  Date: 2016/12/30
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/common/tagLibs.jsp" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1>Hello ${requestScope.user.userName}!</h1>
<table>
    <tr>
        <td>ID</td>
        <td>${requestScope.user.id}</td>
    </tr>
    <tr>
        <td>用户名</td>
        <td>${requestScope.user.userName}</td>
    </tr>
    <tr>
        <td>密码</td>
        <td>${requestScope.user.password}</td>
    </tr>
    <tr>
        <td>年龄</td>
        <td>${requestScope.user.age}</td>
    </tr>
</table>
</body>
</html>
