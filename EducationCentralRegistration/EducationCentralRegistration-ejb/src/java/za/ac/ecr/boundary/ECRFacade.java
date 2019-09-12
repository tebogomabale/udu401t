/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.ecr.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import za.ac.ecr.artifact.Facade;
import za.ac.ecr.control.ECRRepository;
import za.ac.ecr.control.ECRValidation;
import za.ac.ecr.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */
@Facade
@Stateless
public class ECRFacade {
    
    private ECRRepository eCRRepository;
    private ECRValidation eCRValidation;
    
    public ECRFacade(){super();}
    
    @Inject
    public ECRFacade(ECRRepository eCRRepository,ECRValidation eCRValidation){
        
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
