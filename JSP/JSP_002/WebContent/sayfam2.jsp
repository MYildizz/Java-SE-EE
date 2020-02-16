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
	String adiSoyadi=request.getParameter("isimsoyisim");
	String tcno = request.getParameter("tcno");
	
	
	if(adiSoyadi.equals("sercan")&& tcno.equals("222")){
		
		session.setAttribute("oturumKisisi",adiSoyadi);
		
		
		out.println("Adi : "+adiSoyadi+"<br/>");
		out.println("tc  : "+tcno);
		
		
	}
	else{
		
		out.println("YANLIS KİSİ");
	}
	
%>

	<a href="uyelereOzel.jsp"> Uyelere Ozel Sayfa</a>
	
</body>
</html>