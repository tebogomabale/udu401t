/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.banking.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import za.co.absa.banking.entity.Absa;
import za.co.absa.banking.exception.ABSAException;

/**
 *
 * @author QXW5421
 */
@Stateless
@Path("atm")
public class AbsaFacadeREST extends AbstractFacade<Absa> {

    @PersistenceContext(unitName = "ABSAApplicationPU")
    private EntityManager em;

    public AbsaFacadeREST() {
        super(Absa.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Absa entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Absa entity) {
        super.edit(entity);
    }

    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Absa find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    
    @POST
    @Path("/transact")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Absa transact( Absa absa) throws ABSAException {
    
    List<Absa> absas = findByParameter("Absa.findByCardNumber","cardNumber",absa.getCardNumber());
    Absa dataabsa = null;
    if(!absas.isEmpty())
    {
        if(absas.size()>1){            
            throw new ABSAException("Duplicate Card number");
        }else {
            
             dataabsa = absas.get(0);
            if(dataabsa.getPinNumber()!=absa.getPinNumber())throw new ABSAException("Invalid Pin Number");
            if(String.valueOf(absa.getCardNumber()).length()!=9)throw new ABSAException("Invalid Card Number"); 
            
            if(absa.getTransactiontype().equalsIgnoreCase("WITHDRAW")){
                
                if(dataabsa.getBalance()<absa.getTransactionamount())throw new ABSAException("Insufficient amount");               
                int newbalace =dataabsa.getBalance()-absa.getTransactionamount();
                dataabsa.setBalance(newbalace);
                super.edit(dataabsa);
            
            }else if(absa.getTransactiontype().equalsIgnoreCase("DEPOSIT")){
              
                dataabsa.setBalance(absa.getTransactionamount()+dataabsa.getBalance());
                super.edit(dataabsa);
            
            } else{
                throw new ABSAException("Invalid Transaction");
            }          
        
        }
    }else{        
        throw new ABSAException("Invalid Card ");
    }
        
    return dataabsa;
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
