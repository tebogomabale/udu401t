/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.ecr.dataobject;

import java.io.Serializable;
import za.ac.ecr.artifact.DataObject;

@DataObject
public class InstitutionDO implements Serializable {

    private Integer institutionId;
    private String name;
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String phone;
    private String fax;
    private String email;
    private InstitutionTypeDO institutionType;

    public InstitutionDO() {
    }

    public Integer getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstitutionTypeDO getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(InstitutionTypeDO institutionType) {
        this.institutionType = institutionType;
    }
   
}
