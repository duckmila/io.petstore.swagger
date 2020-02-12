package tests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

public class TestPetStoreQuery {
    public void setQueryConfig (String websiteName){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(websiteName)
                .setContentType(ContentType.JSON)
                .addHeader("api_key", "duckmila")
                .build();
    }
}
