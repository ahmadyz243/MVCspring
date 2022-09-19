<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>View Page</title>
</head>
<body>
<p>${message}</p>
<p>your username = ${user.username}</p>
<p>your password = ${user.password}</p>
</body>
</html>
