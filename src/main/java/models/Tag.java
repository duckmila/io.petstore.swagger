package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;

    public Tag(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
