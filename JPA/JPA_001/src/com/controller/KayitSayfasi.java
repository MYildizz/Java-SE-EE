package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Adresler;
import com.model.Information;
import com.model.Ortaogretim;

/**
 * Servlet implementation class KayitSayfasi
 */
@WebServlet("/KayitSayfasi")
public class KayitSayfasi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
    public KayitSayfasi() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA_001");
		EntityManager entity= factory.createEntityManager();
		
		Date dogumTarihi = new Date(1996,05,10);
		
		EntityTransaction tr = entity.getTransaction();
		
		try {
		
		Adresler adres = new Adresler();
		adres.setUlke("Türkiye");
		adres.setSehir("Ankara");
		adres.setMahalle("Altýndað");

		List<String> epostalar = new ArrayList<String>();
		epostalar.add("murat.yildiz@gmail.com");
		epostalar.add("muraat@gmail.com");
		

		Information bilgi = new Information();
				bilgi.setAdi("murat");
				bilgi.setSoyadi("yil");
				bilgi.setYas(23);
				bilgi.setDogumTarihi(dogumTarihi);
				bilgi.setKayitTarihi(new Date());
				bilgi.setTarih(new Date());
				bilgi.setAdresler(adres);
				bilgi.setEpostalar(epostalar);

				bilgi.setKimlikno(123);
				
				
			Ortaogretim ortaogretim=new Ortaogretim();
			ortaogretim.setOrtail("Ankara");
			ortaogretim.setOrtaisim("ulus ");
				
				tr.begin();
				entity.persist(bilgi);
				entity.persist(ortaogretim);
				entity.flush();
				
				tr.commit();
		}catch(Exception e) {
			tr.rollback();
			System.out.println(e);
		}
		finally {
			entity.close();
			factory.close();
		}
		
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
