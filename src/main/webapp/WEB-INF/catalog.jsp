<%--
  Created by IntelliJ IDEA.
  User: alexk
  Date: 03.08.2018
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Каталог</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
<jsp:include page="header.html"></jsp:include>
<ul class="menu">
    <li><a href="main">Главная</a> </li>
    <li>Каталог </li>

    <li><a href="cart">Корзина</a> </li>
    <li><a href="zakaz">Заказ</a></li></ul>
<div class="catalog_container">
    <div class="product-item"><a href="product?id=1"><img src="images/an_che.jpg" alt="">
        <p>Анатомия человека</p>
    </a></div>
    <div class="product-item"><a href="product?id=2"><img src="images/oxford.jpg" alt="">
        <p>Oxford bussines english</p>
    </a></div>
    <div class="product-item"><a href="product?id=3"><img src="images/way.jpg" alt="">
        <p>Way ahead for Ukraine</p>
    </a></div>
    <div class="product-item"><a href="product?id=4"><img src="images/faf2.png" alt="">
        <p>Family and friends 2</p>
    </a></div>
    <div class="product-item"><a href="product?id=5"><img src="images/youandme.jpg" alt="">
        <p>You and Me</p>
    </a></div>
    <div class="product-item"><a href="product?id=6"><img src="images/matrix.jpg" alt="">
        <p>New matrix</p>
    </a></div>
    <div class="product-item"><a href="product?id=7"><img src="images/faf3.png" alt="">
        <p>Family and friends 3</p>
    </a></div>
    <div class="product-item"><a href="product?id=8"><img src="images/grammar.jpg" alt="">
        <p>Oxford grammar for schools</p>
    </a></div>
    <div class="product-item"><a href="product?id=9"><img src="images/der.jpg" alt="">
        <p>Деривативы. Курс для начинающих.</p>
    </a></div>


</div>
<jsp:include page="footer.html"/>
</body>
</html>
