package tests;

import io.restassured.response.Response;
import org.junit.BeforeClass;

public class TestBase {
    protected static TestPetStoreQuery query = new TestPetStoreQuery();
    protected static Response response;

    @BeforeClass
    public static void setTestConfiguration(){
        query.setQueryConfig("http://petstore.swagger.io");
    }
}