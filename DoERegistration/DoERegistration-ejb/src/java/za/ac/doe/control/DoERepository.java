/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.doe.control;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.doe.artifact.Repository;
import za.ac.doe.dataobject.StudentDO;
import za.ac.doe.entity.Student;

/**
 *
 * @author QXW5421
 */
@Repository
@Stateless
public class DoERepository {
    
    
    @PersistenceContext(unitName = "DOE")
    private EntityManager entityManager;
    
    
      
    public DoERepository(){super();}
    
    public void create(StudentDO stutend){
        entityManager.persist(DoEConvertor.convertToEntity(stutend));
    }
    
    public void update(StudentDO stutend){
        entityManager.merge(DoEConvertor.convertToEntity(stutend));
    }
    
    public void detele(StudentDO stutend){
        entityManager.remove(DoEConvertor.convertToEntity(stutend));
    }
    
    public StudentDO getStudent(Long id){
    
        return DoEConvertor.convertToDO(entityManager.find(Student.class, id));
    }
    
}
