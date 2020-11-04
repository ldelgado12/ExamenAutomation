import static org.hamcrest.Matchers.*;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class statusTest extends baseTest{

    private static String RESOURCE = "/v1/examen";

    @Test
    public void status_Test(){

        request

                .when()
                    .post(String.format("%s/status", RESOURCE))
                .then()
                    .statusCode(200)
                    .body("status", equalTo("Listos para el examen"));

    }






}
