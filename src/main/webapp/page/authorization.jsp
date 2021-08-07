<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<body>
<h1>Авторизация </h1>

<form action="${pageContext.request.contextPath}/come" method="post">
    <input type="email" name="email" value="Введите почту">
    <input type="password" name="password" value="Введите пароль">
    <input type="submit" name="button" value="Войти">
</form>
</body>
</html>