package com.webservisler.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonelBilgi {

	    @XmlElement
		private String adi;
	    @XmlElement
		private String soyadi;
	    @XmlElement
		private String tcno;
	    @XmlElement
		private String telno;

		public PersonelBilgi() {};
		
		
		public PersonelBilgi(String adi, String soyadi, String tcno, String telno) {

			this.adi = adi;
			this.soyadi = soyadi;
			this.tcno = tcno;
			this.telno = telno;
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
		public String getTcno() {
			return tcno;
		}

		public void setTcno(String tcno) {
			this.tcno = tcno;
		}
		public String getTelno() {
			return telno;
		}
		public void setTelno(String telno) {
			this.telno = telno;
		}
	
		
}
