/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.host.banking.service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import za.co.host.banking.client.RestClient;
import za.co.host.banking.entity.Host;
import za.co.host.banking.exception.HostException;

/**
 * REST Web Service
 *
 * @author QXW5421
 */
@Path("host")
public class HostResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HostResource
     */
    public HostResource() {
    }

    /**
     * Retrieves representation of an instance of za.co.host.banking.service.HostResource
     * @return an instance of za.co.host.banking.entity.Host
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Host getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of HostResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(Host content) {
    }
    
    /**
     * PUT method for updating or creating an instance of HostResource
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host transact(Host content) throws HostException {
       
        
        RestClient restclient =null;
        if(content.getBankName().equalsIgnoreCase("FNB")){         
            restclient = new RestClient("http://localhost:8080/ABSAApplication/fnb");
        }else if(content.getBankName().equalsIgnoreCase("ABSA")){
            restclient = new RestClient("http://localhost:8080/ABSAApplication/absa");
        }
        
        if(restclient!=null){
         
            restclient.transact_JSON(content, Host.class);
        }
        else{   
            throw new HostException("Invalid Bank");
        }
            
        
        return content;
    }
}
