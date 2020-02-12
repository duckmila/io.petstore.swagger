package tests;

import io.restassured.response.Response;
import models.Pet;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPet {

    private static TestPetStoreQuery query;

    @BeforeClass
    public static void setTestConfiguration(){
        query = new TestPetStoreQuery();
        query.setQueryConfig("http://petstore.swagger/io");
    }

    @Test
    public void testAddNewPet(){
        Pet petToAdd = new Pet().generateTestData();
        Response response = query.addPet(petToAdd);
    }
}