package com.Rest.Advance;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("custommedia")
public class MyCustomMediaType {
	
	
	
	@GET
	@Produces(value = {"text/shortdate",MediaType.TEXT_PLAIN})
	//@Produces(MediaType.TEXT_PLAIN)
	public Date getCustomMediaDate() {
		System.out.println("Inside getCustomMediaDate");
		return Calendar.getInstance().getTime();
	}

}
