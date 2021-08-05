<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>

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