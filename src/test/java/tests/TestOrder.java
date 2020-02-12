package tests;

import models.Order;
import models.Pet;
import org.junit.Assert;
import org.junit.Test;

public class TestOrder extends TestBase {
    @Test
    public void testAddNewOrder(){
        // Add new pet to the store
        Pet petToAdd = new Pet().generateTestData();
        response = query.addPet(petToAdd);

        Assert.assertEquals(200, response.getStatusCode());

        // Add new order to the store
        Order orderToAdd = new Order().generateTestData(petToAdd.getId());
        response = query.addOrder(orderToAdd);

        Assert.assertEquals(200, response.getStatusCode());
    }
}
