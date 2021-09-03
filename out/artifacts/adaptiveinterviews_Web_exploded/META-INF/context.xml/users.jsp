<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Пользователи</title>
</head>
<body>

<h2>Пользователи</h2>
<input type="button" class="floated" onclick="location.href='/employees'" value="На главную">
<input type="button" class="floated" onclick="location.href='/interviews'" value="Беседы">
<input type="button" class="floated" onclick="location.href='/departments'" value="Отделы">
<input type="button" class="floated" onclick="location.href='/logout'" value="Выйти из системы">
<h2></h2>
<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <input type="button" class="floated" onclick="location.href='/users/new/add'" value="Добавить пользователя">
</c:if>
<input type="button" class="floated" onclick="location.href='/users/edit'" value="Редактировать свой профиль">
<h2></h2>
<table>
    <style type="text/css">
        TABLE {
            border-collapse: collapse;
        }

        TD, TH {
            padding: 3px;
            border: 1px solid black;
        }

        TH {
            background: #b0e0e6;
        }
    </style>
    <tr>
        <th>Имя</th>
        <th>Email</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.name}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>