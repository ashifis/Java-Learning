package com.RestFul26.DemoRest26;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.MidiChannel;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

@Path("aliens") // url name
public class AlienResources {

	AliensRepository a = new AliensRepository();
	@GET //We are sending a GET request
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})  //What type of data we are returning
	public List<Alien> getAliens(@DefaultValue("1") @QueryParam("minid") int minId,
	        @DefaultValue("7") @QueryParam("maxid") int maxId) {
		System.out.println("getAliens");
		return a.getAliens(minId,maxId);
	}
	
	@GET //We are sending a GET request
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //What type of data we are returning
	public Alien getAlien(@PathParam("id") int id) {
		System.out.println("getAlien");
		/*
		return  al;*/
		
	/*	Alien al = new Alien();
		
		al.setId(5);
		al.setName("Test");
		a.createAlien(al);
		*/
		return a.getAlien(id);
	}

	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
	public Alien createAlien(Alien alien) {
		System.out.println("createAlien");
		System.out.println(alien);
		Alien al =a.createAlien(alien);
		return al;		
	}
	
	/////////////////
	@POST
	@Path("createalien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
	public Alien createAlienII(
			@NotNull  @FormParam("friendfname") String friendfname,
			@NotNull  @FormParam("friendlname") String friendlname,
			@NotNull  @FormParam("frienddomain") String frienddomain,
			@NotNull  @FormParam("friendcity") String friendcity,
			@NotNull  @FormParam("friendpoints") int friendpoints
			) {
		System.out.println("createAlienII");
		Alien alien = new Alien();
		alien.setName(friendfname);
		alien.setLname(friendlname);
		alien.setDomain(frienddomain);
		alien.setCity(friendcity);
		alien.setPoint(friendpoints);
		System.out.println(alien);
		Alien al =a.createAlien(alien);
		return al;		
	}
	
	
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien alien) {
		System.out.println("updateAlien");
		System.out.println(alien);
		Alien al =a.updateAlien(alien);
		
		if(al.getInsertStatus() == 1)
		{return al;}
		else {
		//return	a.createAlien(alien);
		}
		return new Alien();
		
	}
	
	@DELETE
	@Path("killalien/{id}")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien deleteAlien(@PathParam("id") int id) {
		System.out.println("deleteAlien");
		System.out.println(id);
		Alien al =a.killAlien(id);
		
		if(al.getInsertStatus() == 1)
		{
			return al;
		}
		else {
		return	al;
		}
		
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("details/{firstname}.{lastname}@{domain}.com")
	public List<Alien> getAlienByNamesDomain(@PathParam("firstname") String fname,@PathParam("lastname") String lname,
			@PathParam("domain") String domain) {
		
		return a.getAlienByNamesDomain(fname,lname,domain);
		
		
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("details/{lastname}")
	public List<Alien> getAlienByLastName(@PathParam("lastname") String lname) {
		
		return a.getAlienByName(lname);
		
		
	}
	
	
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	@Path("/updatecity")
	public Alien updateCity(@FormParam("friendid") int friendid,@FormParam("friendfname") String friendfname,@FormParam("frienddomain") String frienddomain,
			@FormParam("friendcity") String friendcity) {
		
		System.out.println("updateCity");
		System.out.println(friendid);
		System.out.println(friendfname);
		System.out.println(frienddomain);
		System.out.println(friendcity);
		return a.updateAlienCity( friendid,friendfname, frienddomain, friendcity);
		
	}
	
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	@Path("/updatedomain")
	public Alien updateDomain(MultivaluedMap<String, String> formParams) {
		
		System.out.println("updateDomain");
		
		Map<String,String> map = new HashMap<String, String>();
		
		for  (String str : formParams.keySet()) {
			map.put(str , formParams.getFirst(str));
		}
		System.out.println(formParams);
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(""  + entry.getKey() + " : " + entry.getValue());
		}
		
		
		
		Alien al =  new Alien();
		al.setName("Dummy Alien");
		return al;
		
	}
	
	@GET //We are sending a GET request
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})  //What type of data we are returning
	@Path("/getaliensuri")
	public List<Alien> getaliensuri(@Context UriInfo ui) {
		
		System.out.println("getaliensuri");
	    MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
	    MultivaluedMap<String, String> pathParams = ui.getPathParameters();

	    int minId = 0;
	    int maxId = 7;
	    Map<String,String> map = new HashMap<String, String>();
		
		for  (String str : queryParams.keySet()) {
			map.put(str , queryParams.getFirst(str));
		}
		System.out.println(queryParams);
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(""  + entry.getKey() + " : " + entry.getValue());
			if(entry.getKey().equals("minid")) {
				minId = Integer.parseInt(entry.getValue());
			}
			if(entry.getKey().equals("maxid")) {
				maxId = Integer.parseInt(entry.getValue());
			}
		}
		
		
		return a.getAliens(minId,maxId);
		
	}
	
}
