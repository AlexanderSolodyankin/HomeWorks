<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <style type="text/css">
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h3>Сотрудник</h3>
<form:form method="POST"
           action="update" modelAttribute="employeeForm">
    <table>
        <tr>
            <td><form:label path="firstName">Имя*</form:label></td>
            <td><form:input path="firstName" type="text"/></td>
            <td><form:errors path="firstName" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Фамилия*</form:label></td>
            <td><form:input path="lastName" type="text"/></td>
            <td><form:errors path="lastName" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="employmentDate">Дата приема*</form:label></td>
            <td><form:input path="employmentDate" type="date"/></td>
            <td><form:errors path="date1" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="endOfAdaptation">Конец адаптации*</form:label></td>
            <td><form:input path="endOfAdaptation" type="date"/></td>
            <td><form:errors path="date2" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="department">Отдел*</form:label></td>
            <td><form:select path="department">
                <form:options items="${departments}" itemValue="name" itemLabel="name"></form:options>
            </form:select></td>
            <td><form:errors path="department" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="position">Должность*</form:label></td>
            <td><form:input path="position" type="text"/></td>
            <td><form:errors path="position" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="status">Статус*</form:label></td>
            <td><form:select path="status">

                <form:option value="Проходит адаптацию"/>
                <form:option value="Адаптация завершена"/>
                <form:option value="Уволен"/>
                <form:option value="Другое"/>
            </form:select></td>
            <td><form:errors path="status" cssClass="error"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Сохранить"/></td>
        </tr>
    </table>
</form:form>
<input type="button" class="floated" onclick="location.href='/employees'" value="Отменить">
</body>
</html>