/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mc.control;

import javax.ejb.Stateless;
import javax.inject.Inject;
import za.ac.mc.artifact.Repository;
import za.ac.mc.boundary.RestClient;
import za.ac.mc.dataobject.StudentDO;


/**
 *
 * @author QXW5421
 */
@Repository
@Stateless
public class MCRepository {
    
   
    
    RestClient restClient=null;
    
          
    public MCRepository(){super();}
    
    public void create(StudentDO stutend){
            
        restClient.create(stutend);
    }
    
    public void update(StudentDO stutend){
        restClient.update(stutend);
    }
    
    public void detele(StudentDO stutend){
       restClient.detele( stutend);
    }
    
    public StudentDO getStudent(Long id){
    
        return restClient.getStudent(StudentDO.class, id);
    }
    
}
