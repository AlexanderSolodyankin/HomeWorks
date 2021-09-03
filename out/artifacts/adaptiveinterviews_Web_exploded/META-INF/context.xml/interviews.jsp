<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>Беседы</title>
</head>
<body>

<h2>Беседы</h2>
<input type="button" class="floated" onclick="location.href='/employees'" value="На главную">
<input type="button" class="floated" onclick="location.href='/departments'" value="Отделы">
<input type="button" class="floated" onclick="location.href='/users'" value="Пользователи">
<input type="button" class="floated" onclick="location.href='/logout'" value="Выйти из системы">
<h2></h2>
<input type="button" class="floated" onclick="location.href='/interviews'" value="Предстоящие">
<input type="button" class="floated" onclick="location.href='/interviews?review=no'" value="Без отзыва">
<input type="button" class="floated" onclick="location.href='/interviews?all=yes'" value="Все беседы">
<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <input type="button" class="floated" onclick="location.href='/interviews/add'" value="Новая беседа">
</c:if>
<h2></h2>
<form action="/interviews" style="display:inline;" method="GET">
    Фамилия: <input type="text" name="lastName"/>
    <input type="submit" value="Найти"/>
</form>
<form action="/interviews" style="display:inline;" method="GET">
    Дата: <input type="date" name="findDate"/>
    <input type="submit" value="Найти"/></form>
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
        <th>Дата</th>
        <th>Название</th>
        <th>Сотрудник</th>
        <th>Пользователь</th>
        <th>Отзыв</th>
        <th></th>
    </tr>
    <c:forEach var="interview" items="${interviews}">
        <tr style="background-color:${empty interview.description ? 'lightsalmon' : 'PaleGreen'}">
            <td>${interview.date}</td>
            <td>${interview.name}</td>
            <td>${interview.employee.firstName} ${interview.employee.lastName}</td>
            <td>${interview.user.name}</td>
            <td><c:out value="${empty interview.description ? 'НЕТ' : 'ЕСТЬ'}"/></td>
            <td><c:if test="${empty interview.description}">
                <input type="button" onclick="location.href='/interviews/${interview.id}/edit'" value="Оставить отзыв">
            </c:if>
                <c:if test="${not empty interview.description}">
                    <input type="button" onclick="location.href='/interviews/${interview.id}/edit'"
                           value="Редактировать">
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>