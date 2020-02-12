package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag extends EntityBase {
    @JsonProperty
    private String name;

    public Tag(){
    }

    public Tag(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tag that = (Tag) obj;

        return this.id.equals(that.id) &&
                this.name.equals(that.name);
    }
}
