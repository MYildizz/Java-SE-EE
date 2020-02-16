<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

    <!doctype html>
<html lang="en">
  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>

	<sql:setDataSource var="kaynak" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost/sirketbilgi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
	user="root"
	password=""
	/>

<c:if test="${kaynak != null }">
	<h1>başarılı bağlantı</h1>
	
</c:if>	

<c:if test="${param.adi != null or param.soyadi != null or param.tcno != null }">

	<c:set var="adi" value="${param.adi }"></c:set>
	<c:set var="soyadi" value="${param.soyadi }"></c:set>
	<c:set var="tcno" value="${param.tcno }"></c:set>
	
	
	
	
<sql:transaction dataSource="${kaynak }">
	
			<sql:update>
			INSERT INTO personelbilgi (adi,soyadi,tcno) VALUES (?,?,?);
	
			<sql:param value="${adi }"></sql:param>
			<sql:param value="${soyadi }"></sql:param>
			<sql:param value="${tcno }"></sql:param>
			</sql:update>
	


</sql:transaction>

</c:if>
	
	
	
		<sql:query var="personelbilgiTablosu" dataSource="${kaynak }">
		SELECT * FROM personelbilgi;
	</sql:query>
	
	<table class="table">
		<tr>
			<c:forEach var="kolon" items="${personelbilgiTablosu.columnNames}">
				<th>  <c:out value="${kolon }"></c:out> </th>
			</c:forEach>
			
		</tr>
		
		
				
			<c:forEach var="datas" items="${personelbilgiTablosu.rows}">
				<tr>
				  <td> <c:out value="${datas.id }"></c:out> </td>
				  <td> <c:out value="${datas.adi }"></c:out> </td>
				  <td> <c:out value="${datas.soyadi }"></c:out> </td>
				  <td> <c:out value="${datas.tcno }"></c:out> </td>
				<td> <a href="index.jsp?id=${datas.id }">sil</a></td>
				<td> <a href="index.jsp?id=${datas.id }">Güncelle</a></td>
				</tr>
			</c:forEach>
			
			
	
	</table>
	


	<c:catch>
	
		<c:if test="${hataSonuc !=null }">
			<c:out value="${hataSonuc }"></c:out>
		</c:if>
	
	</c:catch>







    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>