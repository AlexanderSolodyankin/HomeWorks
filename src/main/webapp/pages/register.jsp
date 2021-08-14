<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
    <style>
    form{
    text-align-last: center;
    }
    textarea{
        margin: 0px;
    width: 344px;
    height: 291px;
    }

    </style>
</head>

<body>
<h1> Режим регистарции</h1>

<form action="${pageContext.request.contextPath}/register" method="post">
    <input type="text" name="login" placeholder="Введите логин">
    <br>
    <input type="password" name="password" placeholder="Введите пароль">
    <br>
    <input type="email" name="email" placeholder="Введите почту">
    <br>
    <label for="date">Дата рождения: </label>
    <input type="date" id="date" name="date"/>
    <br>
    <input type="radio" name="gender" value="man"> Мужской
    <input type="radio" name="gender" value="woman"> Женский
    <br>
    <textarea name="text" placeholder="Напешите коротко о себе"></textarea>
    <br>
    <input type="submit">
</form>

</body>
</html>