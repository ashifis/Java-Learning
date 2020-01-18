package com.Rest.Advance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.org.apache.regexp.internal.recompile;

@Path("date/{dateparam}")
public class MyDateParamConverter {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMyDate(@PathParam("dateparam") MyDate dateparam) {
		return dateparam.toString();
	}
	

}
