/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.atm.banking.service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import za.co.atm.banking.client.RestClient;
import za.co.atm.banking.entity.ATM;
import za.co.atm.banking.exception.ATMException;


/**
 * REST Web Service
 *
 * @author QXW5421
 */
@Path("atm")
public class AtmResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AtmResource
     */
    public AtmResource() {
    }

    /**
     * Retrieves representation of an instance of za.co.atm.banking.service.AtmResource
     * @return an instance of za.co.atm.banking.entity.ATM
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public ATM getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of AtmResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(ATM content) {
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public ATM atm(ATM content) throws ATMException {
        
        if(chipContent().getCardNumber()!=content.getCardNumber()) throw new ATMException("Invalid Card Number");
        if(chipContent().getPinNumber()!=content.getPinNumber()) throw new ATMException("Invalid pin");
    
        RestClient clinet = new RestClient();
        return clinet.transact(content, ATM.class);
       
        
    }
    
    
    private ATM chipContent(){
    
        ATM atm = new ATM();
        atm.setCardNumber(987654321);
        atm.setPinNumber(1234);
               
        return atm;
    
    }
}
