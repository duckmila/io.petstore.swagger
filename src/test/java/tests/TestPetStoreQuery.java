package tests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Pet;

import static io.restassured.RestAssured.given;

public class TestPetStoreQuery {

    public void setQueryConfig (String websiteName){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(websiteName)
                .setContentType(ContentType.JSON)
                .addHeader("api_key", "duckmila")
                .build();
    }

    public Response addPet(Pet petToAdd) {
        return given()
                .basePath("/v2/pet")
                .body(petToAdd)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }
}
