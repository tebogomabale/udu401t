/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.control;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.artifact.Repository;
import za.ac.tut.dataobject.StudentDO;
import za.ac.tut.entity.Student;

/**
 *
 * @author QXW5421
 */
@Repository
@Stateless
public class TUTRepository {
    
    
    @PersistenceContext(unitName = "TUT")
    private EntityManager entityManager;
    
    
      
    public TUTRepository(){super();}
    
    public void create(StudentDO stutend){
        entityManager.persist(TUTConvertor.convertToEntity(stutend));
    }
    
    public void update(StudentDO stutend){
        entityManager.merge(TUTConvertor.convertToEntity(stutend));
    }
    
    public void detele(StudentDO stutend){
        entityManager.remove(TUTConvertor.convertToEntity(stutend));
    }
    
    public StudentDO getStudent(Long id){
    
        return TUTConvertor.convertToDO(entityManager.find(Student.class, id));
    }
    
}
