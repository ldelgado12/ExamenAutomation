import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.Usuario;

import static org.hamcrest.Matchers.*;

public class randomName extends baseTest{


        private static String RESOURCE = "/v1/examen";


        @Test
        public void Random_Test_WOAtho(){

            Usuario testInvalidUser = new Usuario("fail", "fail");
            request
                    .body(testInvalidUser)
                    .when()
                        .post(String.format("%s/randomName", RESOURCE))
                    .then()

                        .statusCode(401)
                        .body("message", equalTo("Please login first"));

        }

        @Test
        public void Random_Test_WithAtho(){

            Usuario testUser = new Usuario("testuser", "testpass");
            request
                    .given()
                        .contentType("application/json")
                        .body(testUser)
                    .when()
                        .post(String.format("%s/randomName", RESOURCE))
                    .then()
                        .statusCode(200)
                        .body("name",contains("name"));

        }

}


