package com.webservisler;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservisler.model.PersonelBilgi;

@Path("personelservis")
public class PersonelServis {
 
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/personeliste")
	public List<PersonelBilgi> personelListeXML(){
		
		List<PersonelBilgi> liste = new ArrayList<>();
		liste.add(new PersonelBilgi("Ramazan","Duman","123123","02342342"));
		liste.add(new PersonelBilgi("Emin","demir","123123","02342342"));
		liste.add(new PersonelBilgi("Fatih","kiraz","123123","02342342"));
		liste.add(new PersonelBilgi("ali","koç","123123","02342342"));
		liste.add(new PersonelBilgi("fatih","koç","123123","02342342"));
		
		return liste;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/personelistejson")
	public List<PersonelBilgi> personelListeJSON(){
		
		List<PersonelBilgi> liste = new ArrayList<>();
		liste.add(new PersonelBilgi("Ramazan","Duman","123123","02342342"));
		liste.add(new PersonelBilgi("Emin","demir","123123","02342342"));
		liste.add(new PersonelBilgi("Fatih","kiraz","123123","02342342"));
		liste.add(new PersonelBilgi("ali","koç","123123","02342342"));
		liste.add(new PersonelBilgi("fatih","koç","123123","02342342"));
		
		return liste;
	}
	

    
}
