<%--
  Created by IntelliJ IDEA.
  User: Onya
  Date: 22.06.2020
  Time: 00:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <p>${message}</p>
    <form action="Servlet" method="post">
       <input name="phone" type="text" pattern="[0-9]{6}" placeholder="phone"><br>
        <input name="email" type="text" placeholder="email">
        <input type="submit" value="ok">
    </form>
</body>
</html>
