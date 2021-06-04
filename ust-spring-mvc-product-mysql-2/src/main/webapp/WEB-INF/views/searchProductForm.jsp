<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!!!!</title>
</head>
<body>
	<h2>Please Enter ID to search for the Product</h2>
<form action="searchProduct">

Enter Product Id to search: <input type="text" name="productId"><br/>
<hr/>
Product Name : <input type="text" name="productName" disabled="disabled"><br/>
Quantity : <input type="text" name="quantityonHand" disabled="disabled"><br/>
Price: <input type="text" name="price" disabled="disabled"><br/>
<hr/>
<input type="submit" value="Fetch Product"/>
</form>
${message }
</body>
</html>