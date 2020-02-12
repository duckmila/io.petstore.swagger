package tests;

import io.restassured.response.Response;
import models.Pet;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestPet {

    private static TestPetStoreQuery query;
    private static Response response;

    @BeforeClass
    public static void setTestConfiguration(){
        query = new TestPetStoreQuery();
        query.setQueryConfig("http://petstore.swagger.io");
    }

    @Test
    public void testAddNewPet(){
        Pet petToAdd = new Pet().generateTestData();
        response = query.addPet(petToAdd);
        Pet actualPet = response.getBody().as(Pet.class);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(petToAdd, actualPet);
    }

    @Test
    public void testDeleteExistedPet() {
        //Add new pet to the store
        Pet petToDelete = new Pet().generateTestData();
        response = query.addPet(petToDelete);

        Assert.assertEquals(200, response.getStatusCode());

        //Delete pet added to the store
        response = query.deletePetById(petToDelete.getId());

        Assert.assertEquals(200, response.getStatusCode());
    }


}