package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty
    protected Integer id;
    @JsonProperty
    private  Integer petId;
    @JsonProperty
    private Integer quantity;
    @JsonProperty
    private String shipDate;
    @JsonProperty
    private String status;
    @JsonProperty
    private boolean complete;

    public Order(){
    }
}
