package tests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Pet;

import static io.restassured.RestAssured.given;

public class TestPetStoreQuery {

    private static String basePath = "/v2/pet";

    public void setQueryConfig (String websiteName){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(websiteName)
                .setContentType(ContentType.JSON)
                .addHeader("api_key", "duckmila")
                .build();
    }

    public Response addPet(Pet petToAdd) {
        return given()
                .basePath(basePath)
                .body(petToAdd)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }

    public Response deletePetById(Integer petId){
        return given()
                .basePath(basePath)
                .pathParam("petId", petId)
                .when()
                .delete("/{petId}")
                .then()
                .extract()
                .response();
    }

    public Response getPetById(Integer petId) {
        return given()
                .basePath(basePath)
                .pathParam("petId", petId)
                .when()
                .get("/{petId}")
                .then()
                .extract()
                .response();
    }
}
