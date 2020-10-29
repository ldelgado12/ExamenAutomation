import static org.hamcrest.Matchers.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class statusTest extends baseTest{

    private static final String RESOURCE = "/status";

    @Test
    public void status_Test(){
        request
                .get(String.format("%s", RESOURCE))
                .then()
                .statusCode(200)
                //.header("Access-Control-Allow-Origin", equalTo("http://localhost"))
                .body("id", equalTo(3),
                        "status", equalTo("Listos para el examen"));


    }


}
