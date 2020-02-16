package com.ejbKullanim;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejbs.IData;


@WebServlet("/Sayfam")
public class Sayfam extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB(beanName = "memberservice")
	IData data;
	
    public Sayfam() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append(" "+data.Veriler()).append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
