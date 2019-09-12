/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mc.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import za.ac.mc.artifact.Facade;
import za.ac.mc.control.MCRepository;
import za.ac.mc.control.MCValidation;
import za.ac.mc.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */
@Facade
@Stateless
public class MCFacade {
    
    private MCRepository eCRRepository;
    private MCValidation eCRValidation;
    
    public MCFacade(){super();}
    
    @Inject
    public MCFacade(MCRepository eCRRepository,MCValidation eCRValidation){
        
        this.eCRRepository=eCRRepository;
        this.eCRValidation=eCRValidation;
    
    }
      
    public void create(StudentDO stutend){
       eCRRepository.create(stutend);
    }
    
    public void update(StudentDO stutend){
        eCRRepository.update(stutend);
    }
    
    public void detele(StudentDO stutend){
        eCRRepository.detele(stutend);
    }
    
    public StudentDO getStudent(Long id){
    
        return eCRRepository.getStudent(id);
    }
}
