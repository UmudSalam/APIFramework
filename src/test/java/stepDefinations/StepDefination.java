package stepDefinations;

import Utilities.APIResources;
import Utilities.Utils;
import Utilities.testDataBuild;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;
import pojo.Location;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class StepDefination extends Utils {

    RequestSpecification reqspec;
    ResponseSpecBuilder resspecB;
    Response response;
    //if you put static for any variable, then, all test cases in that particular run
    // will refer to the same variable
    //And if you don't put static, when the next scenario starts in the particular run
    // the variable will be set to null
    static String place_id;





    testDataBuild data = new testDataBuild();
    @Given("Add Place Payload with {string} {string} {string}")
    public void add_Place_Payload_with(String name, String language, String address) throws IOException {

        //we've made little optimization to our test
        //where all the generic specification detail coming from Utils class
        //And data is coming from testDataBuild class

        reqspec =given().spec(requestSpecification())
                .body(data.addPlacePayload( name, language, address));
        //awesome, so we successfully made this step definition file data independent
        //data is driven from testDataBuild class and there also we are not using any static jason
        //at run time we're using serialization concept to build our java object base upon our pojo files




    }



    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String method) {

        //.post as well as "API" is dynamic, depend on different scenarios
        //so how do I centralize this code?
        //if I user if else, say there are 100 API in ecommerce app, there will be 50 if else right?
        //Luckily there is a method in java, "value of", this method will invoke the constructor in enum
        //and store the constant in the enum, and then into the argument of the constructor
        //and the method in enum will return the value we want

        //constructor will be called with value of resource which you pass in the feature file
        APIResources resourceAPI = APIResources.valueOf(resource);
        System.out.println(resourceAPI.getResource());

        resspecB = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON);

        //Here our goal in this step definition
        // is to verify whether we're successfully hitting the correct API or not
        if (method.equalsIgnoreCase("POST"))
            response = reqspec.when().post(resourceAPI.getResource());
        else if(method.equalsIgnoreCase("GET"))
            response = reqspec.when().get(resourceAPI.getResource());
        //.then().spec(respspec).extract().response();
    }

    @Then("the API call got success with status code {int}")
    public void the_API_call_got_success_with_status_code(Integer int1) {
        assertEquals(response.getStatusCode(),200);
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyValue, String expectedValue) {




        assertEquals(getJsonPath(response,keyValue), expectedValue);

    }

    @Then("verify place_Id created maps to {string} using {string}")
    public void verify_place_Id_created_maps_to_using(String expectedName, String resource) throws IOException {

        //prepare request specification
        place_id = getJsonPath(response,"place_id");
        reqspec =given().spec(requestSpecification()).queryParam("place_id",place_id );
        user_calls_with_http_request(resource, "GET");
        String actualName = getJsonPath(response, "name");
        assertEquals(actualName,expectedName);

    }

    @Given("DeletePlace Payload")
    public void deleteplace_Payload() throws IOException {

       reqspec = given().spec(requestSpecification()).body(data.deletePlacePayload(place_id));
       // List<String> list = new ArrayList<>();
       // AddPlace ap = new AddPlace(50, "Arpat",  "133243242", "hfiwfgpiu fi road", "ww.jof.c0om", "frendh", new Location(2.0,3.0), list );

    }

}
