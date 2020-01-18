package com.Rest.Advance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("callclient")
public class CallRestClient {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public CreateClient getClient() {
		CreateClient client = new CreateClient();
		
		client.setClientId(1);
		client.setClientName("Pumba");
		
		
		return client;
		
	}

}
