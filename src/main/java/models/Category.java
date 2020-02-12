package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
