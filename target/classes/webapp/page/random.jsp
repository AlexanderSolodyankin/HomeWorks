<%
int num1 = new java.util.Random().nextInt(1000);
int num2 = new java.util.Random().nextInt(1000);
%>

<html>
<body>
<h1>
    <%= num1 %> + <%= num2 %> = <%= num1+num2 %>
</h1>
</body>

</html>