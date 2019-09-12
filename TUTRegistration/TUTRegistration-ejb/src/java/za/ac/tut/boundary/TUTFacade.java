/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import za.ac.tut.artifact.Facade;
import za.ac.tut.control.TUTRepository;
import za.ac.tut.control.TUTValidation;
import za.ac.tut.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */
@Facade
@Stateless
public class TUTFacade {
    
    private TUTRepository eCRRepository;
    private TUTValidation eCRValidation;
    
    public TUTFacade(){super();}
    
    @Inject
    public TUTFacade(TUTRepository eCRRepository,TUTValidation eCRValidation){
        
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
