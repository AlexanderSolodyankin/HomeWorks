<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<body>
<h2 style="text-align: center;"> Домашняя работа номер 43 !!!!</h2>

<div style="text-align: center;">
<form action="${pageContext.request.contextPath}/userset" method="post">

    <input type="text" name="login" value="Введите логин">
    <br>
    <input type="password" name="password" value="Введите пароль">
    <br>
    <input type="email" name="email" value="Введите почту">
    <br>
    <input type="radio" name="gender" value="Man"> Мужчина
    <input type="radio" name="gender" value="Woman"> Женщина
    <br>
    <input type="submit" value="Внести информацию в базу данных">
</form>
</div>

</body>
</html>
