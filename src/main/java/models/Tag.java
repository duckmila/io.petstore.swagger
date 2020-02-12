package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
}
