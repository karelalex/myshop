<%--
  Created by IntelliJ IDEA.
  User: alexk
  Date: 03.08.2018
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Корзина</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
<jsp:include page="header.html"/>
<ul class="menu">
    <li><a href="main">Главная</a> </li>
    <li><a href="catalog">Каталог</a> </li>
    <li>Корзина </li>
    <li><a href="order">Заказ</a></li></ul>
<jsp:include page="footer.html"/>
</body>
</html>
