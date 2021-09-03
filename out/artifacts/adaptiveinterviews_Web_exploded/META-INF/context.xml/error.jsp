<%@ page language="java"
         contentType="text/html; charset=UTF-8"
%>
<html>
<body>
<h1>Ошибка!</h1>
<table>
    <tr>
        <td>Error</td>
        <td>${error}</td>
    </tr>
    <tr>
        <td>Status</td>
        <td>${status}</td>
    </tr>
    <tr>
        <td>Message</td>
        <td>${message}</td>
    </tr>
    <tr>
        <td>Exception</td>
        <td>${exception}</td>
    </tr>
    <tr>
        <td>Trace</td>
        <td>
            <pre>${trace}</pre>
        </td>
    </tr>
    <tr>
        <h5><a href="../..">Вернуться на главную</a></h5><br/>
    </tr>
</table>
</body>
</html>