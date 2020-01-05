package com.CustomerExampleApplication.REST;

import java.net.URI;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;



@Stateless
@Path("/customer")
public class CustomerService {
	
	public static final Logger logger =
            Logger.getLogger(CustomerService.class.getCanonicalName());
	
	@PersistenceContext
	private EntityManager em;
	private CriteriaBuilder cb;
	
	
	@PostConstruct
	private void init() {
		cb = em.getCriteriaBuilder();
	}
	
	
	@SuppressWarnings("deprecation")
	@POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response createCustomer(Customer customer) {
 
        try {
            long customerId = persist(customer);
            return Response.created(URI.create("/" + customerId)).build();
        } catch (Exception e) {
            logger.log(Level.FATAL,"Error creating customer for customerId {0}. {1}", new Object[]{customer.getId(), e.getMessage()});
            throw new WebApplicationException(e,
                    Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
	
	 private long persist(Customer customer) {
	        try {
	            Address address = customer.getAddress();
	            em.persist(address);
	            em.persist(customer);
	        } catch (Exception ex) {
	        	//logger.warning("Something went wrong when persisting the customer");
	        }
	        return customer.getId();
	    }
	
	 	@SuppressWarnings("deprecation")
		@GET
	    @Path("{id}")
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	    public Customer getCustomer(@PathParam("id") String customerId) {
	        Customer customer = null;
	 
	        try {
	            customer = findById(customerId);
	        } catch (Exception ex) {
	            logger.log(Level.ERROR, "Error calling findCustomer() for customerId {0}. {1}",new Object[]{customerId, ex.getMessage()});
	        }
	        return customer;
	    }
	    
	    private Customer findById(String customerId) {
	        Customer customer = null;
	        try {
	            customer = em.find(Customer.class, customerId);
	            return customer;
	        } catch (Exception ex) {
	            logger.log(Level.ERROR,
	                    "Couldn't find customer with ID of {0}");
	        }
	        return customer;
	    }

}
