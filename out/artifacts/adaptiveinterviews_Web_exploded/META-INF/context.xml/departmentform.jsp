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
    </style>
</head>
<body>
<h3>Отдел</h3>

<form:form method="POST"
           action="update" modelAttribute="department">
    <table>
        <tr>
            <td><form:label path="name">Название*</form:label></td>
            <td><form:input path="name" type="text"/></td>
            <td><form:errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="supervisor">Руководитель*</form:label></td>
            <td><form:input path="supervisor" type="text"/></td>
            <td><form:errors path="supervisor" cssClass="error"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Сохранить"/></td>
        </tr>
    </table>
</form:form>
<input type="button" class="floated" onclick="location.href='/departments'" value="Отменить">
</body>
</html>