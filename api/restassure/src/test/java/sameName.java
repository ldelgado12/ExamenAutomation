import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class sameName extends baseTest{

    private static String RESOURCE = "/v1/examen";

    @Test
    public void sameName(){
        request
                .given()
                    .contentType("application/json")
                    .body("{\n" +
                            "    \"name\": \"La Roca\"\n" +
                            "}")
                .when()
                    .post(String.format("%s/sameName", RESOURCE))
                .then()
                    .statusCode(200)
                // .header("Access-Control-Allow-Origin", equalTo("http://localhost"))
                    .body("name", equalTo("La Roca"));

    }

}
