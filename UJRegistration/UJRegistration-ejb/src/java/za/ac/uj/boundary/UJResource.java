/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.uj.boundary;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import za.ac.uj.artifact.RestResource;
import za.ac.uj.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */

@Path("/uj")
@RestResource
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class UJResource {
    
    private UJFacade eCRFacade;
    
    public UJResource(){super();}
    
    @Inject
    public UJResource(UJFacade eCRFacade){
        this.eCRFacade=eCRFacade;
    }
    
    
    @POST
    public void create(StudentDO stutend){
       eCRFacade.create(stutend);
    }
    
    @PUT
    public void update(StudentDO stutend){
        eCRFacade.update(stutend);
    }
    @DELETE
    public void detele(StudentDO stutend){
        eCRFacade.detele(stutend);
    }
    @GET
    @Path("/{id}")
    public StudentDO getStudent(@PathParam("id") final Long id){
    
        return eCRFacade.getStudent(id);
    }
    
    
}
