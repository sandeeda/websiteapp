<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="border: 1 px black">
	
		<a href="showCart.do"><button>cart ${sessionScope.cartCount}</button></a>
	
	</div>
	<br><br>
	<table border=1 >
		<tr>
			<td>
			<img src="/images/toy.jpeg" width="80" height="50"/>
			</td>
			<td>
			<p>toy</p>
			</td>
			<td>
			<p>100</p>
			</td>
			<td>
			<a href="/addToCart?productId=123&productPrice=100"><button>ADD to cart</button></a>
			</td>
			
		</tr>
		<tr>
			<td>
			<img src="/images/Car.jpg" width="80" height="50"/>
			</td>
			<td>
			<p>mc laren</p>
			</td>
			<td>
			<p>500</p>
			</td>
			<td>
			<a href="/addToCart?productId=124&productPrice=500"><button>ADD to cart</button></a>
			</td>
			
		</tr>
		<tr>
			<td>
			<img src="/images/cycle.jpg" width="80" height="50"/>
			</td>
			<td>
			<p>hayabusa</p>
			</td>
			<td>
			<p>1000</p>
			</td>
			<td>
			<a href="/addToCart?productId=125&productPrice=1000"><button>ADD to cart</button></a>
			</td>
			
		</tr>
		<tr>
			<td>
			<img src="/images/iphone.jpg" width="80" height="50"/>
			</td>
			<td>
			<p>dabba</p>
			</td>
			<td>
			<p>1010</p>
			</td>
			<td>
			<a href="/addToCart?productId=126&productPrice=1010"><button>ADD to cart</button></a>
			</td>
			
		</tr>
		<tr>
			<td>
			<img src="/images/shirt.jpg" width="80" height="50"/>
			</td>
			<td>
			<p>shirt</p>
			</td>
			<td>
			<p>1200</p>
			</td>
			<td>
			<a href="/addToCart?productId=127&productPrice=1200"><button>ADD to cart</button></a>
			</td>
			
		</tr>
	</table>
		
	
</body>
</html>