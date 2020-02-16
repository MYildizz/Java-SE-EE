package com.model;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="information")
public class Information implements Serializable {
	
	public Information() {}

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Numara")
	private int id;
	
	@Column(name="adiniz",nullable=false,unique=false,length=45)
	private String adi;
	
	@Column(name="soyadiniz")
	private String soyadi;
	
	@Column(name="yasiniz")
	private int yas;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dogumTarihiniz")
	private Date dogumTarihi;
	
	@Temporal(TemporalType.TIME)
	@Column(name="kayitTarihiniz")
	private Date kayitTarihi;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tarih")
	private Date tarih;
	
	@Embedded
	private Adresler adresler;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public Date getDogrumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public Date getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public Adresler getAdresler() {
		return adresler;
	}

	public void setAdresler(Adresler adresler) {
		this.adresler = adresler;
	}
	
	
	
	
}
