package com.Rest.Advance;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("messagerw")
public class MessageBodyReaderWriter {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date getDate() {
		return Calendar.getInstance().getTime();
	}
}
