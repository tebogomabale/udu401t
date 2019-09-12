/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.doe.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import za.ac.doe.artifact.Facade;
import za.ac.doe.control.DoERepository;
import za.ac.doe.control.DoEValidation;
import za.ac.doe.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */
@Facade
@Stateless
public class DoEFacade {
    
    private DoERepository eCRRepository;
    private DoEValidation eCRValidation;
    
    public DoEFacade(){super();}
    
    @Inject
    public DoEFacade(DoERepository eCRRepository,DoEValidation eCRValidation){
        
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
