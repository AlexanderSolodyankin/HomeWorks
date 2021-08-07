<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<body>
<h1>
    Регистрация
</h1>

<form action="${pageContext.request.contextPath}/register" method="post">
    <input type="text" name="login">
    <input type="email" name="email">
    <input type="password"  name="password">
    <input type="submit" name="submit" value="Registration">
</form>
</body>

</html>