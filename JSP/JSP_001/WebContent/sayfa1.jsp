<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page buffer="1024kb" autoFlush="true" %>
<%@ page import="java.util.*" errorPage="hata.jsp" %>   
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp"  %>
<hr/>

ara metin
<hr/>

<%@ include file="footer.jsp"  %>

<%!
	String deger1="murat";
	String deger2 ="Developer";
	
	public String Methodum(){
		
		return "Methodum Çalıştı";
	}
%>
<br/>
<%
	out.print(deger1);
	out.println(deger2);
	out.println(Methodum());
	

%>
<br/>

<%="sonucu bu şekilde alabilmenizi sağlıyor" %>
<br/>
<%= 4+7 %>



</body>
</html>