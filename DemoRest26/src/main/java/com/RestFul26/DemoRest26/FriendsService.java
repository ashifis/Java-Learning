package com.RestFul26.DemoRest26;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;


import com.RestFul26.DemoRest26.*;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;

@Path("/friend")
public class FriendsService {
	 @GET
	    @Path("/get")
	    @Produces("application/xml")
	    public JAXBElement<Friends> getFriend1() {
		 Friends friends = new Friends();
			friends.setAge(26);
			friends.setCollege("Jis college of Engineering");
			friends.setId(1);
			friends.setName("Ashif");
			return null;
	    }
	 @POST
	    @Path("/create")
	    @Consumes("application/xml")
	    public Response createFriend( Friends friends ) {
			return null;
	        // Process or store the product and return a response
	        // ...
	    }
}
