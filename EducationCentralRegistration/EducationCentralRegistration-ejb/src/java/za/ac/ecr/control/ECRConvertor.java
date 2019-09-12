/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.ecr.control;

import za.ac.ecr.dataobject.InstitutionDO;
import za.ac.ecr.dataobject.InstitutionTypeDO;
import za.ac.ecr.dataobject.StudentDO;
import za.ac.ecr.entity.Institution;
import za.ac.ecr.entity.InstitutionType;
import za.ac.ecr.entity.Student;

/**
 *
 * @author QXW5421
 */
public class ECRConvertor {
    
    
    public static StudentDO convertToDO(Student student){
         
        StudentDO studentDO = new StudentDO();
        studentDO.setEmail(student.getEmail());
        studentDO.setFirstname(student.getFirstname());
        studentDO.setIdnumber(student.getIdnumber());
        studentDO.setLastname(student.getLastname());
        studentDO.setModulename(student.getModulename());
        studentDO.setStudentId(student.getStudentId());
        studentDO.setStudentName(student.getStudentName());
        studentDO.setInstitutionId(convertToDO(student.getInstitutionId()));
        return studentDO;
    
    }
    
    public static InstitutionDO convertToDO(Institution institution){
        
        InstitutionDO institutionDO = new InstitutionDO();
        institutionDO.setAddressline1(institution.getAddressline1());
        institutionDO.setAddressline2(institution.getAddressline2());
        institutionDO.setCity(institution.getCity());
        institutionDO.setEmail(institution.getEmail());
        institutionDO.setFax(institution.getFax());
        institutionDO.setInstitutionId(institution.getInstitutionId());
        institutionDO.setInstitutionType(convertToDO(institution.getTypeId()));
        institutionDO.setName(institution.getName());
        institutionDO.setPhone(institution.getPhone());
        institutionDO.setState(institution.getState());
        
        return institutionDO;
    }
    
    public static InstitutionTypeDO convertToDO(InstitutionType institutionType){
        
        InstitutionTypeDO institutionTypeDO = new InstitutionTypeDO();
        
        institutionTypeDO.setDescription(institutionType.getDescription());
        institutionTypeDO.setName(institutionType.getName());
        institutionTypeDO.setTypeId(institutionType.getTypeId());
        return institutionTypeDO;
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
        studentDO.setInstitutionId(convertToEntity(student.getInstitutionId()));
        return studentDO;
    
    }
    
    public static Institution convertToEntity(InstitutionDO institution){
        
        Institution institutionDO = new Institution();
        institutionDO.setAddressline1(institution.getAddressline1());
        institutionDO.setAddressline2(institution.getAddressline2());
        institutionDO.setCity(institution.getCity());
        institutionDO.setEmail(institution.getEmail());
        institutionDO.setFax(institution.getFax());
        institutionDO.setInstitutionId(institution.getInstitutionId());
        institutionDO.setTypeId(convertToEntity(institution.getInstitutionType()));
        institutionDO.setName(institution.getName());
        institutionDO.setPhone(institution.getPhone());
        institutionDO.setState(institution.getState());
              
        return institutionDO;
    }
    
    public static InstitutionType convertToEntity(InstitutionTypeDO institutionType){
        
        InstitutionType institutionTypeDO = new InstitutionType();
        
        institutionTypeDO.setDescription(institutionType.getDescription());
        institutionTypeDO.setName(institutionType.getName());
        institutionTypeDO.setTypeId(institutionType.getTypeId());
        return institutionTypeDO;
    }
    
}
