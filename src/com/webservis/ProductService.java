package com.webservis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("products")
public class ProductService {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response urunlerTEXT() {
		
		return Response.status(200).entity("SONUC").build();
	}
	
}
