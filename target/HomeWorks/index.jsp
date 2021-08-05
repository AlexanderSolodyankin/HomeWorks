
<%@page contentType="text/html" language = "java"%>

<!DOCTYPE html>
<html lang="en">
<head>
   <!-- <meta charset="UTF-8"> -->
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Home Works 41 !!!</title>
</head>
<body style="background-color: rgb(107, 107, 107);">

   <img src="300.jpg" alt="">

   <form action="${pageContext.request.contextPath}/name" method="post">
   
      <input type="text" name="name" placeholder="Enter your name:" style="margin-left: 5% ; margin-top: 1%;">

      <input type="submit" name="submit" value="submit">
   </form>
</body>
</html>