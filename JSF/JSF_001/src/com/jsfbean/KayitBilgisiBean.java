package com.jsfbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class KayitBilgisiBean implements Serializable {

	private String adiniz;
	
	
	public KayitBilgisiBean() {}


	public String getAdiniz() {
		return adiniz;
	}


	public void setAdiniz(String adiniz) {
		this.adiniz = adiniz;
	}
	
	
}
