package com.webservis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.webservis.model.PersonelBilgi;

@Path(value = "personels")
public class EmployesService {

	static List<PersonelBilgi> liste =  new ArrayList<>();

	static {
		liste.add(new PersonelBilgi("Ramazan","Duman","4654648746","0212222222222"));
		liste.add(new PersonelBilgi("Emin","Demir","7645754","0565476786"));
		liste.add(new PersonelBilgi("Fatih","Kiraz","44444444","8676578"));
		liste.add(new PersonelBilgi("ali","KOç","897989789","376786"));
		liste.add(new PersonelBilgi("Fatih","Koç","45477","7878786"));
	}
	
	public EmployesService() {
		
		
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(value="/p1")
	public Response personelListeJSON(){

		return Response.status(200).entity(liste).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path(value="/p2")
	public List<PersonelBilgi> personelListeXML(){

		return liste;
	}


}
