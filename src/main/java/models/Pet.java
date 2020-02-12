package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Faker;

import java.util.Collections;
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

    public Pet generateTestData() {
        Faker faker = new Faker();
        id = faker.number().numberBetween(1000, 10000);
        name = String.valueOf(faker.cat().name());
        photoUrls = Collections.singletonList(faker.internet().image());
        category = new Category(faker.number().numberBetween(1000, 10000), faker.cat().breed());
        tags = Collections.singletonList(new Tag(faker.number().numberBetween(1000, 10000), faker.cat().registry()));
        status = "AVAILABLE";
        return this;
    }
}
