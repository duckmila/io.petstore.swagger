package tests;

import models.Pet;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPet {

    @BeforeClass
    public static void setTestConfiguration(){
        TestPetStoreQuery query = new TestPetStoreQuery();
        query.setQueryConfig("http://petstore.swagger/io");
    }

    @Test
    public void testAddNewPet(){
        Pet petToAdd = new Pet().generateTestData();
    }
}