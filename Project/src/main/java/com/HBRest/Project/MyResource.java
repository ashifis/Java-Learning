package com.HBRest.Project;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.HBRest.Entity.Register;
import com.HBRest.Repository.HBRestRepository;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")//http://localhost:8080/Project/webapi/myresource1
public class MyResource {
	
	HBRestRepository  hbRestRepository = new HBRestRepository();
	

	
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "<p>Visit <a href=\"https://java2blog.com/web-service-tutorial/\">Project Jersey website</a>";
    }
    
    
    @POST
	@Path("register")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
	public void register( @NotNull @FormParam("first_name") String first_name,
			@NotNull @FormParam("last_name") String last_name,
			@NotNull @FormParam("username") String username,
			@NotNull @FormParam("password") String password,
			@NotNull @FormParam("address") String address,
			@NotNull @FormParam("contact")  String contact) {
    	
    	//first_name,last_name,username,password,address,contact
		enter("register");
		/*Register register = new Register();
		register.setUsername(username);
		register.setAddress(address);
		register.setContact(contact);
		register.setLast_name(last_name);
		register.setUsername(username);
		register.setFirst_name(first_name);
		System.out.println(first_name + last_name+username+password+address+contact);
		hbRestRepository.RegisterUser(register);*/
		enter("register");
				
	}
    
    public void enter(String meth) {
    	
    	System.out.println("Inside " + meth);
    }
    public void exit(String meth) {
    	
    	System.out.println("Exit " + meth);
    }
	
}
