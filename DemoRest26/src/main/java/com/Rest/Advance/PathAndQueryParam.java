package com.Rest.Advance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("basic/{Pparam}")
public class PathAndQueryParam {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String  getPQParam(@PathParam("Pparam") String Pparam , @QueryParam("Qparam")  String Qparam) {
		return "@PathParam : " + Pparam + "\n@QueryParam : " + Qparam;
	}

}
