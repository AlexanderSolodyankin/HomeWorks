<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Сотрудник</title>
</head>
<body>

<h2>Сотрудник</h2>
<input type="button" class="floated" onclick="location.href='/employees'" value="На главную">
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
        <th>Фамилия</th>
        <th>Отдел</th>
        <th>Начальник отдела</th>
        <th>Должность</th>
        <th>Принят на работу</th>
        <th>Окончание адаптации</th>
        <th>Статус</th>

    </tr>
    <c:set var="employee" value="${employee}"></c:set>
    <tr>
        <td>${employee.firstName}</td>
        <td>${employee.lastName}</td>
        <td>${employee.department.name}</td>
        <td>${employee.department.supervisor}</td>
        <td>${employee.position}</td>
        <td>${employee.employmentDate}</td>
        <td>${employee.endOfAdaptation}</td>
        <td>${employee.status}</td>
    </tr>
</table>
<h2></h2>
<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <input type="button" class="floated" onclick="location.href='/employees/${employee.id}/edit'" value="Редактировать">
</c:if>
<input type="button" class="floated" onclick="location.href='/employees/${employee.id}/upload'" value="Прикрепить файл">

<h2>Беседы</h2>
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
        <th>Беседа</th>
        <th>Дата</th>
        <th>Пользователь</th>
        <th>Отзыв</th>
        <th></th>
    </tr>
    <c:forEach var="interview" items="${interviews}">
        <tr>
            <td>${interview.name}</td>
            <td>${interview.date}</td>
            <td>${interview.user.name}</td>
            <td>${interview.description}</td>
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

</table>
<h2>Файлы</h2>
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
        <th></th>

    </tr>
    <c:forEach var="file" items="${files}">
        <tr>
            <td>${file.fileName}</td>
            <td><input type="button" class="floated" onclick="location.href='/employees/${employee.id}/${file.id}'"
                       value="Скачать файл"></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>