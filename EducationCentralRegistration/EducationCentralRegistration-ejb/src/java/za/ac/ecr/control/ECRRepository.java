/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.ecr.control;

import javax.ejb.Stateless;
import za.ac.ecr.artifact.Repository;
import za.ac.ecr.dataobject.StudentDO;
import za.ac.ecr.rest.client.RestClient;

/**
 *
 * @author QXW5421
 */
@Repository
@Stateless
public class ECRRepository {
    
    
    RestClient restClient=null;
      
    public ECRRepository(){
        super();
       this.restClient= new RestClient(); 
        
    }
    
    public void create(StudentDO stutend){
        
        restClient.create(stutend);
        
    }
    
    public void update(StudentDO stutend){
        restClient.update(stutend);
       
    }
    
    public void detele(StudentDO stutend){
        
        restClient.detele(stutend);
        
    }
    
    public StudentDO getStudent(Long id){
        
        return restClient.getStudent(StudentDO.class, id);
    }
    
}
