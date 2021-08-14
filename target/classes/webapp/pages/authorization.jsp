<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
    <style>
    form{
    text-align-last: center;
    }
</style>
</head>

<body>
<h1> Режим автоизации </h1>

<form action="${pageContext.request.contextPath}/authorize" method="post">
    <input type="email" name="email" placeholder="Введите почту">
    <br>
    <input type="password" name="password" placeholder="Введите пороль">
    <br>
    <input type="submit" name="button" value="Войти">
</form>

</body>
</html>