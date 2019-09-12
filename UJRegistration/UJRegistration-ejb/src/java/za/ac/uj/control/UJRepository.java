/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.uj.control;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.uj.artifact.Repository;
import za.ac.uj.dataobject.StudentDO;
import za.ac.uj.entity.Student;

/**
 *
 * @author QXW5421
 */
@Repository
@Stateless
public class UJRepository {
    
    
    @PersistenceContext(unitName = "UJ")
    private EntityManager entityManager;
    
    
      
    public UJRepository(){super();}
    
    public void create(StudentDO stutend){
        entityManager.persist(UJConvertor.convertToEntity(stutend));
    }
    
    public void update(StudentDO stutend){
        entityManager.merge(UJConvertor.convertToEntity(stutend));
    }
    
    public void detele(StudentDO stutend){
        entityManager.remove(UJConvertor.convertToEntity(stutend));
    }
    
    public StudentDO getStudent(Long id){
    
        return UJConvertor.convertToDO(entityManager.find(Student.class, id));
    }
    
}
