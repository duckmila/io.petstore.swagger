package tests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Order;
import models.Pet;

import static io.restassured.RestAssured.given;

public class TestPetStoreQuery {

    private static String petBasePath = "/v2/pet";
    private static String orderBasePath = "/v2/store/order";

    public void setQueryConfig (String websiteName){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(websiteName)
                .setContentType(ContentType.JSON)
                .addHeader("api_key", "duckmila")
                .build();
    }

    public Response addPet(Pet petToAdd) {
        return given()
                .basePath(petBasePath)
                .body(petToAdd)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }

    public Response deletePetById(Integer petId){
        return given()
                .basePath(petBasePath)
                .pathParam("petId", petId)
                .when()
                .delete("/{petId}")
                .then()
                .extract()
                .response();
    }

    public Response getPetById(Integer petId) {
        return given()
                .basePath(petBasePath)
                .pathParam("petId", petId)
                .when()
                .get("/{petId}")
                .then()
                .extract()
                .response();
    }

    public Response addOrder(Order orderToAdd) {
        return given()
                .basePath(orderBasePath)
                .body(orderToAdd)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }

    public Response getOrderById(Object orderId) {
        return given()
                .basePath(orderBasePath)
                .pathParam("orderId", orderId)
                .when()
                .get("/{orderId}")
                .then()
                .extract()
                .response();
    }
}
