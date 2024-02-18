// ********RoostGPT********
/*
Test generated by RoostGPT for test java-junit4-test using AI Type Open AI and AI Model gpt-4

Test generated for /api/customer/restaurantTableGroup/unassignPointOfSale_post for http method type POST in rest-assured framework

RoostTestHash=5671406f4a


*/

// ********RoostGPT********
package com.medeiros.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class unassignPointOfSalePostTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/com/medeiros/RoostTest/unassignPointOfSalePostTest.csv");
    }

  
    @Test  
    public void unassignPointOfSalePost_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.pathParam("company", map.get("company") != null ? map.get("company") : "")
				.pathParam("pointOfSaleId", map.get("pointOfSaleId") != null ? map.get("pointOfSaleId") : "")
				.pathParam("tableGroupId", map.get("tableGroupId") != null ? map.get("tableGroupId") : "")
				.header("Authorization", "Bearer " + map.get("AUTH_TOKEN"))
                .when()
                .post("/api/customer/restaurantTableGroup/unassignPointOfSale")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Unassign Restaurant Table Group from Point of Sale");
      
              if (response.jsonPath().get("entries") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("entries"), instanceOf(undefined.class));  
          }
				}
  
            }  
    }
}
