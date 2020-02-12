package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
}
