<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:import var="xmlbelgem" url="veri.xml"></c:import>
	<x:parse var="parset" doc="${xmlbelgem}"></x:parse>
	
	<x:out select="$parset/uyeler/uye/adi"/>
	<x:out select="$parset/uyeler/uye/yasi"/>
	
	<hr/>
	
	<x:forEach var="uye" select="$parset/uyeler/uye">
	
		<x:out select="$uye/adi"/>
		<x:out select="$uye/yasi"/> <br/>
	
	</x:forEach>
	
		<hr/>
		

		
	
	
</body>
</html>