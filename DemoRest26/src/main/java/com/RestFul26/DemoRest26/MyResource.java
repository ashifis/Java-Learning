package com.RestFul26.DemoRest26;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource") //This path is linking ,	looks for this path
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET //Specifies when ever there is a GET request this is the method we want to acccess 
    @Produces(MediaType.TEXT_PLAIN) //
    public String getIt() {
        return "Got it!";// Going on the page
    }
    
    
    
}
