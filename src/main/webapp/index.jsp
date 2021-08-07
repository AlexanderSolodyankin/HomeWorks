<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<body>
<h2>Hello World!</h2>

<form action="page/register.jsp">
<button> Регистрация </button>
</form>

<form action="page/authorization.jsp">
    <button> Войти </button>
</form>

<form action="${pageContext.request.contextPath}/outinfo" method="post">
    <input type="text" name="email" value="Введите Емейл для вывода всей информации по ниму"
    style="width: 400px;">
    <input type="submit" name="infoout" value="Вывести данный попыток">

</form>


</body>
</html>
