package tests;

import models.Order;
import models.Pet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestOrder extends TestBase {

    @Test
    @Category(TestOrder.class)
    public void testAddNewOrder(){
        // Add new pet to the store
        Pet petToAdd = new Pet().generateTestData();
        response = query.addPet(petToAdd);

        Assert.assertEquals(200, response.getStatusCode());

        // Add new order to the store
        Order orderToAdd = new Order().generateTestData(petToAdd.getId());
        response = query.addOrder(orderToAdd);

        Assert.assertEquals(200, response.getStatusCode());

        // Get order from the store by id
        response = query.getOrderById(orderToAdd.getId());
        Order actualOrder = response.getBody().as(Order.class);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("PLACED", actualOrder.getStatus());
        Assert.assertEquals(orderToAdd, actualOrder);
    }
}
