<%--
  Created by IntelliJ IDEA.
  User: stpdm
  Date: 7/31/2020
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>Product Discount</h1>
<form action="/display-discount" method="post">
    <label>Product Description: </label></br>
    <input type="text" name="description" placeholder="PD" value="product description"/></br>
    <label>List Price: </label></br>
    <input type="text" name="list-price" placeholder="LP" value="0"/></br>
    <label>Discount Percent: </label></br>
    <input type="text" name="discount-percent" placeholder="DP" value="0"/></br>
    <input type="submit" id="submit" value="Calculate Discount"/>
</form>
</body>
</html>
