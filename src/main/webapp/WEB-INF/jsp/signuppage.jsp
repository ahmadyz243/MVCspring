<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Rayan system
  Date: 9/19/2022
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup Page</title>
</head>
<body>

    <form:form action="submitForm" modelAttribute="user">
        username: <form:input path="username"/><br>
        password: <form:password path="password"/><br>
        <input type="submit" value="submit">
    </form:form>

</body>
</html>
