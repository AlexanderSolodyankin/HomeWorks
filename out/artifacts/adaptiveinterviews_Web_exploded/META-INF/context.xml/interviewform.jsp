<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
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
<h3>Беседа</h3>
<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <form:form method="POST"
               action="update" modelAttribute="interviewForm">
        <table>

            <tr>
                <td><form:label path="employeeName">Сотрудник*</form:label></td>
                <td><form:select path="employeeName">
                    <form:option value="${interviewForm.employeeName}"></form:option>
                    <form:options items="${names}"></form:options>
                </form:select></td>
                <td><form:errors path="employeeName" cssClass="error"/></td>
            </tr>
            <tr>
                <td><form:label path="name">Название*</form:label></td>
                <td><form:input path="name" type="text"/></td>
                <td><form:errors path="name" cssClass="error"/></td>
            </tr>
            <tr>
                <td><form:label path="date">Дата беседы*</form:label></td>
                <td><form:input path="date" type="date"/></td>
                <td><form:errors path="date1" cssClass="error"/></td>
            </tr>
            <tr>
                <td><form:label path="nameOfUser">Пользователь*</form:label></td>
                <td><form:select path="nameOfUser">
                    <form:option value="${interview.user.name}"></form:option>
                    <form:options items="${users}" itemValue="name" itemLabel="name"></form:options>
                </form:select></td>
                <td><form:errors path="nameOfUser" cssClass="error"/></td>
            </tr>
            <tr>
                <td><form:label path="description">Отзыв</form:label></td>
                <td><form:textarea path="description" rows="30" cols="60"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Сохранить"/></td>
            </tr>
        </table>
    </form:form>
</c:if>
<c:if test="${pageContext.request.isUserInRole('USER')}">
    <form:form method="POST"
               action="update" modelAttribute="interviewForm">
        <table>

            <tr>
                <td><form:hidden path="employeeName"/></td>
            </tr>
            <tr>
                <td><form:hidden path="name"/></td>
            </tr>
            <tr>
                <td><form:hidden path="date"/></td>
            </tr>
            <tr>
                <td><form:hidden path="nameOfUser"/></td>
            </tr>
            <tr>
                <td><form:label path="description">Отзыв</form:label></td>
                <td><form:textarea path="description" rows="30" cols="60"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Сохранить"/></td>
            </tr>
        </table>
    </form:form>
</c:if>


<input type="button" onclick="location.href='/interviews'" value="Отменить">
</body>
</html>