package com.model;

import java.io.Serializable;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="ortaogretim")
public class Ortaogretim implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Ortaogretim() {
		super();
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="ortaokul_il")
	private String ortail;
	
	@Column(name="ortaokul_isim")
	private String ortaisim;

	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getOrtail() {
		return ortail;
	}

	public void setOrtail(String ortail) {
		this.ortail = ortail;
	}

	public String getOrtaisim() {
		return ortaisim;
	}

	public void setOrtaisim(String ortaisim) {
		this.ortaisim = ortaisim;
	}


   
	
}