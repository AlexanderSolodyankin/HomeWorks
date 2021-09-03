<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Отделы</title>
</head>
<body>

<h2>Отделы</h2>
<input type="button" class="floated" onclick="location.href='/employees'" value="На главную">
<input type="button" class="floated" onclick="location.href='/interviews'" value="Беседы">
<input type="button" class="floated" onclick="location.href='/users'" value="Пользователи">
<input type="button" class="floated" onclick="location.href='/logout'" value="Выйти из системы">
<h2></h2>
<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <input type="button" class="floated" onclick="location.href='/departments/add'" value="Добавить отдел">
</c:if>

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
        <th>Название</th>
        <th>Руководитель</th>
        <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
            <th></th>
        </c:if>
    </tr>
    <c:forEach var="department" items="${departments}">
        <tr>
            <td>${department.name}</td>
            <td>${department.supervisor}</td>
            <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
                <td><input type="button" onclick="location.href='departments/${department.id}/edit'"
                           value="Редактировать"></td>
            </c:if>
        </tr>
    </c:forEach>
</table>


</body>
</html>