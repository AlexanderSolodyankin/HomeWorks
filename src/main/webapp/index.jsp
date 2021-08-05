
<%@page contentType="text/html" language = "java"%>


<head>
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