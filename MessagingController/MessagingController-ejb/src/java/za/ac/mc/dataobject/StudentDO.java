/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mc.dataobject;

import java.io.Serializable;
import za.ac.mc.artifact.DataObject;


@DataObject
public class StudentDO implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Long studentId;
    private String studentName;
    private Long idnumber;
    private String firstname;
    private String lastname;
    private String email;
    private String modulename;
    private InstitutionDO institutionId;

    public StudentDO() {
    }

    public StudentDO(Long studentId) {
        this.studentId = studentId;
    }

    public StudentDO(Long studentId, Long idnumber) {
        this.studentId = studentId;
        this.idnumber = idnumber;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(Long idnumber) {
        this.idnumber = idnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public InstitutionDO getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(InstitutionDO institutionId) {
        this.institutionId = institutionId;
    }

    
}
