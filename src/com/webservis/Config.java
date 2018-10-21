package com.webservis;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("servisler")
public class Config extends Application {
	
	private Set<Object> sing = new HashSet<Object>();
	
	
	public Config() {
		
		//ProductService pservice = new ProductService();
		
		sing.add(new EmployesService());
		sing.add(new ProductService());
		
	}
	
	
	@Override
	public Set<Object> getSingletons() {
		
		return sing;
	}

}
