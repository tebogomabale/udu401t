/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.uj.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import za.ac.uj.artifact.Facade;
import za.ac.uj.control.UJRepository;
import za.ac.uj.control.UJValidation;
import za.ac.uj.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */
@Facade
@Stateless
public class UJFacade {
    
    private UJRepository eCRRepository;
    private UJValidation eCRValidation;
    
    public UJFacade(){super();}
    
    @Inject
    public UJFacade(UJRepository eCRRepository,UJValidation eCRValidation){
        
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
