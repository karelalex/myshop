<%--
  Created by IntelliJ IDEA.
  User: alexk
  Date: 03.08.2018
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
<jsp:include page="header.html"/>
<ul class="menu">
    <li>Главная </li>
    <li><a href="catalog">Каталог</a> </li>

    <li><a href="cart">Корзина</a> </li>
    <li><a href="zakaz">Заказ</a></li></ul>
<jsp:include page="footer.html"/>
</body>
</html>
