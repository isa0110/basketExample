<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sepetim</title>
</head>
<body>
	<br>
	
	<h3>Liste</h3>
	
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>Kitap no</th>
				<th>Kitap Adı</th>
				<th>Birim Fiyatı</th>
				<th>Adet</th>
				<th>Toplam Fiyat</th>
				<th>Sil</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="b" items="${basketList}">
				<tr>
					<td>${b.bookId}</td>
					<td>${b.bookName}</td>
					<td>${b.price}</td>
					<td>${b.piece}</td>
					<td>****</td>
					<td><a
						href="${pageContext.request.contextPath}/removeProduct/${b.id}">Delete</a></td>
				</tr>
			</c:forEach>
			
		</tbody>


	</table>
	
	<br>
	
	
	<fieldset>
	   <ul>
	   <li>Ara Toplam   :  ${basketPriceInfoDto.subTotal}</li>
	   <li>KDV          :  ${basketPriceInfoDto.kdvTax}</li>
	   <li>Kargo Ücreti :  ${basketPriceInfoDto.shippingCost}</li>
	   <li>Toplam Tutar :  ${basketPriceInfoDto.totalAmount}</li>
	   </ul>
	
	
	</fieldset>
	
	
	
	
</body>
</html>