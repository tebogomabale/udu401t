/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.doe.control;


import za.ac.doe.dataobject.StudentDO;
import za.ac.doe.entity.Student;

/**
 *
 * @author QXW5421
 */
public class DoEConvertor {
    
    
    public static StudentDO convertToDO(Student student){
         
        StudentDO studentDO = new StudentDO();
        studentDO.setEmail(student.getEmail());
        studentDO.setFirstname(student.getFirstname());
        studentDO.setIdnumber(student.getIdnumber());
        studentDO.setLastname(student.getLastname());
        studentDO.setModulename(student.getModulename());
        studentDO.setStudentId(student.getStudentId());
        studentDO.setStudentName(student.getStudentName());
        
        return studentDO;
    
    }
    
    
    
    
    public static Student convertToEntity(StudentDO student){
         
        Student studentDO = new Student();
        studentDO.setEmail(student.getEmail());
        studentDO.setFirstname(student.getFirstname());
        studentDO.setIdnumber(student.getIdnumber());
        studentDO.setLastname(student.getLastname());
        studentDO.setModulename(student.getModulename());
        studentDO.setStudentId(student.getStudentId());
        studentDO.setStudentName(student.getStudentName());
        
        return studentDO;
    
    }
    
   
    
}
