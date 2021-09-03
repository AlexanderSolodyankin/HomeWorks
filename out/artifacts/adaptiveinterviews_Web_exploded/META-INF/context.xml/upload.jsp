<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<body>

<h3>${employee.lastName} ${employee.firstName}</h3>
<div th:if="${message}">
    <h2 th:text="${message}"/>
</div>
<form method="POST" action="uploadfile" enctype="multipart/form-data">
    <input type="file" name="file"/><br/><br/>
    <input type="submit" value="Прикрепить (до 10Мб)"/>
</form>
<input type="button" onclick="location.href='/employees/${employee.id}'" value="Отменить">

</body>
</html>


