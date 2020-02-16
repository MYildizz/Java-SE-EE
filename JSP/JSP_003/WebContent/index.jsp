<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>İndex Sayfamız</h2>

<form action="VeriSonuc.jsp" method="post">
	
	<table>
		<tr>
			<td> Adi : </td>
			<td> <input type="text" name="adi"/> </td>
		</tr>
		
		<tr>
			<td> Soyadi : </td>
			<td> <input type="text" name="soyadi"/> </td>
		</tr>
		
				<tr>
			<td> Okul : </td>
			<td> <input type="text" name="okul"/> </td>
		</tr>
		
				<tr>
			<td> Ülke : </td>
			<td> 
				<select name="ulke">
				 <option value="turkiye"> Türkiye </option>
				 <option value="isvicre"> İsviçre </option>
				 <option value="norvec"> Norveç </option>
				 <option value="hollanda"> Hollanda</option>
				 <option value="sirbistan"> Sırbistan </option>
				
				
				</select>
			
		  </td>
		</tr>
		
				<tr>
			<td> Telefon : </td>
			<td> <input type="number" name="telefon"/> </td>
		</tr>
		
				<tr>
			<td> Cinsiyet : </td>
			<td> 
				<input type="radio" name="cinsiyet" value="kadın"/>
				<input type="radio" name="cinsiyet" value="erkek"/>
			
		   </td>
		</tr>
		
				<tr>
			<td> Meslek : </td>
			<td> <input type="textarea" name="meslek"/> </td>
		</tr>
		
				<tr>
			<td> Uyrugu : </td>
			<td> <input type="text" name="uyrug"/> </td>
		</tr>
		
						<tr>
			<td>  <input type="reset" value="Temizle"/> </td>
			<td> <input type="submit" value="Veri Kayıt"/> </td>
		</tr>
		
	</table>


</form>

</body>
</html>