package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Pet {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private Category category;
    @JsonProperty
    private String name;
    @JsonProperty
    private List<String> photoUrls;
    @JsonProperty
    private List<Tag> tags;
    @JsonProperty
    private String status;
}
