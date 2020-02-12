package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order extends EntityBase {
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
