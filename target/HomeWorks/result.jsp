<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello Servlet!!!!</title>
</head>
<body>
    <center>
        <h1>
            ${result} <% request.getParameter("result"); %>
        </h1>
    </center>
    
</body>
</html>