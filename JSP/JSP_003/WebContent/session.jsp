<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="kisi" class="com.javasiniflarim.Kisi" scope="session"> </jsp:useBean>
	
	<table border="2" >
		<tr>
			<td> Adi : </td>
			<td> <% out.println(request.getParameter("adi")); %> </td>
			<td> <jsp:getProperty property="adi" name="kisi"/> </td>
		</tr>
		
		<tr>
			<td> Soyadi : </td>
			<td><% out.println(request.getParameter("soyadi"));  %> </td>
		</tr>
		
				<tr>
			<td> Okul : </td>
			<td> <%out.println(request.getParameter("okul"));  %>  </td>
		</tr>
		
				<tr>
			<td> Ülke : </td>
			<td> 
				<% out.println(request.getParameter("ulke")); %>	
		  </td>
		  <td> <jsp:getProperty property="adi" name="kisi"/> </td>
		</tr>
		
				<tr>
			<td> Telefon : </td>
			<td> <%out.println(request.getParameter("telefon"));  %>  </td>
		</tr>
		
				<tr>
			<td> Cinsiyet : </td>
			<td> 
				<%out.println(request.getParameter("cinsiyet"));  %> 
			
		   </td>
		</tr>
		
				<tr>
			<td> Meslek : </td>
			<td> <%out.println(request.getParameter("meslek"));  %>  </td>
		</tr>
		
				<tr>
			<td> Uyrugu : </td>
			<td> <%out.println(request.getParameter("uyrug")); %>  </td>
		</tr>
		
	</table>
	
</body>
</html>