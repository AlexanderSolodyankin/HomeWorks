<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Сотрудники</title>
    <style type="text/css">
        .error {
            color: red;
        }

        .blue {
            color: #d9eef7;
            border: solid 1px #0076a3;
            background: #0095cd;
            background: -webkit-gradient(linear, left top, left bottom, from(#00adee), to(#0078a5));
            background: -moz-linear-gradient(top, #00adee, #0078a5);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#00adee', endColorstr='#0078a5');
        }
    </style>
</head>
<body>

<h2>Сотрудники</h2>
<input type="button" class="floated" onclick="location.href='/interviews'" value="Беседы">
<input type="button" class="floated" onclick="location.href='/departments'" value="Отделы">
<input type="button" class="floated" onclick="location.href='/users'" value="Пользователи">
<input type="button" class="floated" onclick="location.href='/logout'" value="Выйти из системы">
<h2></h2>
<input type="button" class="floated" onclick="location.href='/employees?adaptation=yes'" value="В адаптации">
<input type="button" class="floated" onclick="location.href='/employees?all=yes'" value="Все сотрудники">
<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <input type="button" class="floated" onclick="location.href='/employees/add'" value="Новый сотрудник">
</c:if>
<h2></h2>
<form action="/employees" method="GET">
    Фамилия: <input type="text" name="findLastName"/>
    <input type="submit" value="Найти"/>
</form>

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
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Отдел</th>
        <th>Должность</th>
        <th>Дата приема</th>
        <th>Окончание адаптации</th>
        <th>Статус</th>
        <th>Беседы</th>
        <th></th>
    </tr>
    <tr>
        <c:forEach var="employee" items="${employees}">
    <tr style="background-color:
    <c:choose>
    <c:when test="${employee.status == 'Уволен'}">
            lightsalmon
    </c:when>
    <c:when test="${employee.status == 'Проходит адаптацию'}">
            LightYellow
    </c:when>
    <c:otherwise>
            PaleGreen
    </c:otherwise>
            </c:choose>">

        <td>${employee.lastName}</td>
        <td>${employee.firstName}</td>
        <td>${employee.department.name}</td>
        <td>${employee.position}</td>
        <td>${employee.employmentDate}</td>
        <td>${employee.endOfAdaptation}</td>
        <td>${employee.status}</td>
        <td>${fn:length(employee.interviews.toArray())}</td>
        <td><input type="button" onclick="location.href='/employees/${employee.id}'" value="Открыть"></td>
    </tr>
    </c:forEach>
    </tr>
</table>

</body>

</html>


