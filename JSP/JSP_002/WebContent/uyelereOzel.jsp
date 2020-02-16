<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	if(session.getAttribute("oturumKisisi")!=null){
		
		String oturumVerisi = (String)session.getAttribute("oturumKisisi");
		out.println("Hosgeldiniz : "+ oturumVerisi + "<br/>");
		out.println("<h2> SYAFANIZ SIZE OZEL BILGILERLE HAZIR</h2>");
		
	}
	else{
		response.sendRedirect("sayfam.jsp");
		
	}

%>

</body>
</html>