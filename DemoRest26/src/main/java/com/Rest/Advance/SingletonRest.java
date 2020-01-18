package com.Rest.Advance;


import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("singleton")
@Singleton
public class SingletonRest {
	
	
	private int count;
	
	//Can not use path or query param as class members
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		count += 1;
		return "/singleton called " +  count  + " times...";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("count")
	public String getBCount() {
		count += 1;
		return "/singleton/count called " +  count  + " times...";
	}

}
