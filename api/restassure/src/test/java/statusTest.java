import static org.hamcrest.Matchers.*;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class statusTest extends baseTest{

    private static final String RESOURCE = "/";

    @Test
    public void status_Test(){
        request
                .get(String.format("%sstatus", RESOURCE))
                .then()
                .statusCode(200)
               // .header("Access-Control-Allow-Origin", equalTo("http://localhost"))
                .body("id", equalTo(3),
                        "status", equalTo("Listos para el examen"));


    }


}
