package com.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.model.Adresler;
import com.model.Information;

public class Main {

	public static void main(String[] args) {
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA_001");
		EntityManager entity= factory.createEntityManager();
		
		Date dogumTarihi = new Date(1996,05,10);
		
		EntityTransaction tr = entity.getTransaction();
		
		try {
		
		Adresler adres = new Adresler();
		adres.setUlke("Türkiye");
		adres.setSehir("Ýstanbul");
		adres.setMahalle("Esenler");

		Information bilgi = new Information();
				bilgi.setAdi("murat");
				bilgi.setSoyadi("Göðer");
				bilgi.setYas(23);
				bilgi.setDogumTarihi(dogumTarihi);
				bilgi.setKayitTarihi(new Date());
				bilgi.setTarih(new Date());
				bilgi.setAdresler(adres);
				
				tr.begin();
				entity.persist(bilgi);
				entity.flush();
				
				tr.commit();
		}catch(Exception e) {
			tr.rollback();
		}
		finally {
				entity.close();
				factory.close();
		}
		
		
		}
	
		

}
