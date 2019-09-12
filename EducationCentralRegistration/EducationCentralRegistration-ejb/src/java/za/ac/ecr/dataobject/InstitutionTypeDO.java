
package za.ac.ecr.dataobject;

import za.ac.ecr.artifact.DataObject;
import java.io.Serializable;


@DataObject
public class InstitutionTypeDO implements Serializable {

   
    private Integer typeId;
    private String name;
    private String description;
    
    public InstitutionTypeDO() {
    }

    public InstitutionTypeDO(Integer typeId) {
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
    
}
