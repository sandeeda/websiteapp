<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<th>Product</th>

			<th>Quantity</th>

			<th>Price</th>

			<th>Delete</th>

		</tr>


		<c:forEach var="lineItem" items="${sessionScope.lineItems}">
			<tr>
				<td>${lineItem.itemProductId}</td>
				<td>${lineItem.itemQuantity}</td>
				<td>${lineItem.productPrice}</td>
				<td><a href="/deleteItem.do/${lineItem.itemId}">Delete</a></td>

			</tr>

		</c:forEach>
		<br>
		<br>
				
	</table>

</body>
</html>