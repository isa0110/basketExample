<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Anasayfa</title>
</head>
<body>


  <form  action="addBasket" model="bs" method="post">
    <table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
			    <th>Kitap No</th>
				<th>Kitap Adı</th>
				<th>Fiyat</th>
				<th>-</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="bs" items="${bookList}">
				<tr>
					<td>${bs.bookId}</td>
					<td>${bs.bookName}</td>
					<td>${bs.price}</td>
					<td>
					    <input type="submit"   value="Sepete ekle" />
					</td>
					
				</tr>
			</c:forEach>
		</tbody>

	 </table>
	</form>
	
	
	<form action="allBasket" method="post">

		<input type="submit" value="Sepetim" />

	</form>
</body>
</html>