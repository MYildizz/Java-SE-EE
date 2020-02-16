package com.sayfalar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sayfalar.model.Personel;





@WebServlet("/KayitEkle")
public class KayitEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public KayitEkle() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("errors",false);
		
		RequestDispatcher view= request.getRequestDispatcher("bilgiEkle.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Personel p = new Personel();
		request.setAttribute("errors",false);
		
		if(request.getParameter("adi").trim().length()!=0) {
			String adi = request.getParameter("adi");
			request.setAttribute("adiniz", adi);
			
			p.setAdi(adi);

		}
		else
		{
			request.setAttribute("errors",true);
			request.setAttribute("adi_errors", "soyadi alani bos geçilmez.");
		}
		
		if(request.getParameter("soyadiniz").trim().length()!=0) {
			String soyadi = request.getParameter("soyadiniz");
			request.setAttribute("soyadiniz", soyadi);
			
			p.setSoyadi(soyadi);

		}
		else {
			request.setAttribute("errors", true);
			request.setAttribute("soyadi_errors","soyadi alani bos geçilmez.");
			
		}
		
		if(request.getParameter("tc").trim().length()!=0) {
			String tc = request.getParameter("soyadi");
			request.setAttribute("tcniz", tc);
			
			p.setTc(tc);
		}
		else {
			request.setAttribute("errors", true);
			request.setAttribute("tc_errors","tc alani bos geçilmez.");
			
		}
		
		if(request.getParameter("okul").trim().length()!=0) {
			String okul = request.getParameter("okul");
			request.setAttribute("okulunuz", okul);
			
			p.setOkul(okul);
			
		}
		else {
			request.setAttribute("errors", true);
			request.setAttribute("okul_errors","okul alani bos geçilmez.");
			
		}
		
		if(request.getParameter("yas").trim().length()!=0) {
			String yas = request.getParameter("yas");
			request.setAttribute("yasiniz", yas);
			
			p.setYas(yas);
		}
		else {
			request.setAttribute("errors", true);
			request.setAttribute("yas_errors","yas alani bos geçilmez.");
			
		}
		
		
			
		if((boolean) request.getAttribute("errors")) {
			RequestDispatcher view= request.getRequestDispatcher("bilgiEkle.jsp");
			view.forward(request, response);
		}
		
		else {
			
			ServletContext scont=getServletContext();
			
			List<Personel> perList=(ArrayList<Personel>) scont.getAttribute("liste");
			
			perList.add(p);
			
			
			scont.setAttribute("liste", perList);
			
			response.sendRedirect("/Serverlet-JSP-001/Anasayfa");
		}
		
		
	}

}
