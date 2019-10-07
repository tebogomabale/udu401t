/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.banking.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import za.co.fnb.banking.entity.Fnb;
import za.co.fnb.banking.exception.FNBException;

/**
 *
 * @author QXW5421
 */
@Stateless
@Path("atm")
public class FnbFacadeREST extends AbstractFacade<Fnb> {

    @PersistenceContext(unitName = "FNBApplicationPU")
    private EntityManager em;

    public FnbFacadeREST() {
        super(Fnb.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Fnb entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Fnb entity) {
        super.edit(entity);
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Fnb find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/transact")
    private Fnb transact(Fnb fnb) throws FNBException {
    
    List<Fnb> fnbs = findByParameter("Fnb.findByCardNumber","cardNumber",fnb.getCardNumber());
    Fnb datafnb = null;
    if(!fnbs.isEmpty())
    {
        if(fnbs.size()>1){            
            throw new FNBException("Duplicate Card number");
        }else {
            
             datafnb = fnbs.get(0);
            if(datafnb.getPinNumber()!=fnb.getPinNumber())throw new FNBException("Invalid Pin Number");
            if(String.valueOf(fnb.getCardNumber()).length()!=9)throw new FNBException("Invalid Card Number"); 
            if(fnb.getTransactiontype().equalsIgnoreCase("WITHDRAW")){
                
                if(datafnb.getBalance()<fnb.getTransactionamount())throw new FNBException("Insufficient amount");               
                int newbalace =datafnb.getBalance()-fnb.getTransactionamount();
                datafnb.setBalance(newbalace);
                super.edit(datafnb);
            
            }else if(fnb.getTransactiontype().equalsIgnoreCase("DEPOSIT")){
              
                datafnb.setBalance(fnb.getTransactionamount()+datafnb.getBalance());
                super.edit(datafnb);
            
            } else{
                throw new FNBException("Invalid Transaction");
            }          
        
        }
    }else{        
        throw new FNBException("Invalid Card ");
    }
        
    return datafnb;
    }
   
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
