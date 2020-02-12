package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Faker;

import java.util.Date;

public class Order {
    @JsonProperty
    private Integer id;
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

    public Order generateTestData(Integer existingPetId) {
        Faker faker = new Faker();
        id = faker.number().numberBetween(1000, 10000);
        petId = existingPetId;
        quantity = faker.number().numberBetween(1, 14);
        shipDate = String.format("%tY-%<tm-%<tdT%<tH:%<tM:%<tS.%<tL+0000", new Date());
        status = "PLACED";
        complete = false;
        return this;
    }

    public Object getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order that = (Order) obj;

        return this.id.equals(that.id) &&
                this.shipDate.equals(that.shipDate) &&
                this.complete == that.complete &&
                this.quantity.equals(that.quantity) &&
                this.petId.equals(that.petId) &&
                this.status.equals(that.status);
    }
}
