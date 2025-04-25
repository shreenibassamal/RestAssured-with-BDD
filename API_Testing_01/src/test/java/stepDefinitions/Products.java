package stepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Products {
    @Given("I hit the url of get products api endpoints")
    public void I_hit_the_url_of_get_products_api_endpoints(){
        RestAssured.baseURI= "fake story api/";
//        Response responce= httpRequest.


    }
}
