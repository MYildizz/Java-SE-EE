<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page buffer="1024kb" autoFlush="true" %>
<%@ page import="java.util.*" errorPage="hata.jsp" %>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bilgi ekle sayfasi</title>



</head>
<body>



<div class="container">
	
	<h1>Kişi Ekle</h1>
	
	<%
		boolean hataDurum=(boolean)request.getAttribute("errors");
		if(hataDurum){
			
			if(request.getAttribute("adi_errors")!=null){
				String adiHata = (String)request.getAttribute("adi_errors");
		
				%>
				<div class="alert alert-danger"><%= adiHata %> </div>			
				<%
			}
			
			if(request.getAttribute("soyadi_errors")!=null){
				String soyadiHata = (String)request.getAttribute("soyadi_errors");
		
				%>
				<div class="alert alert-danger"><%= soyadiHata%> </div>			
				<%
			}
			
			if(request.getAttribute("tc_errors")!=null){
				String tcHata = (String)request.getAttribute("tc_errors");
		
				%>
				<div class="alert alert-danger"><%= tcHata%> </div>			
				<%
			}
			
			if(request.getAttribute("okul_errors")!=null){
				String okulHata = (String)request.getAttribute("okul_errors");
		
				%>
				<div class="alert alert-danger"><%= okulHata%> </div>			
				<%
			}
			
			if(request.getAttribute("yas_errors")!=null){
				String yasHata = (String)request.getAttribute("yas_errors");
		
				%>
				<div class="alert alert-danger"><%= yasHata%> </div>			
				<%
			}
			
		}
	
	%>
	
	<form action="KayitEkle" method="post">

		<div class="row">
		
			<div class="col-lg-4 col-sm=1 col-md=3">
				<label>Adınız : </label>
			</div>
			
			<div class="col-lg-8 col-sm=2">
			     <input type="text" name="adi" value="<%= (String)request.getAttribute("adiniz")!=null ? (String)request.getAttribute("adiniz"):"" %>" class="form-control"/> 
		    </div>
		    
		    <div class="col-lg-4 ">
				<label>Soyadiniz : </label>
			</div>
			
			<div class="col-lg-8 c">
			     <input type="text" name="soyadiniz" value="<%= (String)request.getAttribute("soyadiniz")!=null ? (String)request.getAttribute("soyadiniz"):"" %>" class="form-control"/> 
		    </div>
		    
		     <div class="col-lg-4 ">
				<label>TC Numarasi : </label>
			</div>
			
			<div class="col-lg-8 c">
			     <input type="text" name="tc" value="<%= (String)request.getAttribute("tcniz")!=null ? (String)request.getAttribute("tcniz"):"" %>" class="form-control"/> 
		    </div>
		    
		    <div class="col-lg-4 ">
				<label>Okul : </label>
			</div>
			
			<div class="col-lg-8 c">
			     <input type="text" name="okul" value="<%= (String)request.getAttribute("okulunuz")!=null ? (String)request.getAttribute("okulunuz"):"" %>" class="form-control"/> 
		    </div>
		    
		     <div class="col-lg-4 ">
				<label>Yasiniz : </label>
			</div>
			
			<div class="col-lg-8 c">
			     <input type="text" name="yas" value="<%= (String)request.getAttribute("yasiniz")!=null ? (String)request.getAttribute("yasiniz"):"" %>" class="form-control"/> 
		    </div>
			
			<div class="col-lg-6">
					<input type="submit" value="Kaydet" class="btn btn-lg btn-primary"/> 
			</div>
			
			<div class="col-lg-2">
					<input type="reset" value="Temizle" class="btn btn-lg btn-danger"/> 
			</div>
		</div>

		

	</form>

</div>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" 
crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>