package com.Rest.Advance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("basic")
public class Basic {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showBasic() {
		return "Basic Rest from Java Learning";
	}

}
