package com.Rest.Advance;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;



public class RestClient {
	
	
	public static void main(String args[]) {
		
		
		
		Client cl = ClientBuilder.newClient();
		WebTarget basetarget =  cl.target("http://localhost:8080/DemoRest26/webapi/");
		
		WebTarget messageTarge = basetarget.path("callclient");
		//WebTarget target =  cl.target("http://localhost:8080/DemoRest26/webapi/callclient");//Give it a target to point to . client to be inited once per application
		Builder builder =	(Builder) messageTarge.request();
		Response  response =  builder.get();
		CreateClient client = response.readEntity(CreateClient.class);
		
		
		System.out.println(client.getClientId());
		System.out.println(client.getClientName());
	}

}
