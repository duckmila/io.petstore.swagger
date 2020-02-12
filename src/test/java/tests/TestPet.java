package tests;

import models.Pet;
import org.junit.Test;

public class TestPet {
    @Test
    public void testAddNewPet(){
        Pet petToAdd = new Pet().generateTestData();
    }
}