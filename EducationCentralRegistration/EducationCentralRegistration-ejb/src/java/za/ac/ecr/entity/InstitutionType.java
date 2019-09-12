/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.ecr.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author QXW5421
 */
@Entity
@Table(name = "INSTITUTION_TYPE")
//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InstitutionType.findAll", query = "SELECT i FROM InstitutionType i")
    , @NamedQuery(name = "InstitutionType.findByTypeId", query = "SELECT i FROM InstitutionType i WHERE i.typeId = :typeId")
    , @NamedQuery(name = "InstitutionType.findByName", query = "SELECT i FROM InstitutionType i WHERE i.name = :name")
    , @NamedQuery(name = "InstitutionType.findByDescription", query = "SELECT i FROM InstitutionType i WHERE i.description = :description")})
public class InstitutionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TYPE_ID")
    private Integer typeId;
    @Size(max = 250)
    private String name;
    @Size(max = 250)
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeId", fetch = FetchType.EAGER)
    private Collection<Institution> institutionCollection;

    public InstitutionType() {
    }

    public InstitutionType(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Institution> getInstitutionCollection() {
        return institutionCollection;
    }

    public void setInstitutionCollection(Collection<Institution> institutionCollection) {
        this.institutionCollection = institutionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeId != null ? typeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitutionType)) {
            return false;
        }
        InstitutionType other = (InstitutionType) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.ecr.entity.InstitutionType[ typeId=" + typeId + " ]";
    }
    
}
