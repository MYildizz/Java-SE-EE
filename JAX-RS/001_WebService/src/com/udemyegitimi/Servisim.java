package com.udemyegitimi;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;;

@Path("ilkservis")
public class Servisim {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String AnaServis() {
		return "Servis Bilgileri \n /isimdondur \n /tcdondur \n adlý linklere erisim yapabilirsiniz";
	}
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)	
	@Path("/isimdondur")
	public String IsimDondur() {
		
		return "murat yildiz";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/tcdondur")
	public String TcDondur() {
		
		return "1234134234";
	}
	
	
	
}
