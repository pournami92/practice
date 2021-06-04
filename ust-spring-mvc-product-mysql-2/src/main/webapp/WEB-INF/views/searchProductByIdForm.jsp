<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Please search your products based on product id:</h2>

<form action="searchProductById">

<table>
<tr><td>Product Id to search: </td><td><input type="text" name="productId"/></td></tr>
<tr><td>Product Name: </td><td><input type="text" name="productName"/></td></tr>
<tr><td>Product Quantity On Hand </td><td><input type="text" name="quantityOnHand"/></td></tr>
<tr><td>Product Price: </td><td><input type="text" name="price"/></td></tr>
<tr><td><input type="submit" value="Fetch"/><input type="reset" value="reset"/></td></tr>






</table>
</form>
<font color="red">${msg}</font>
</body>
</html>