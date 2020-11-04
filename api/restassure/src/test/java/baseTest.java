import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class baseTest {

    public static RequestSpecification request;


    @BeforeClass
    @Parameters("baseUrl")
    public void SetupRestAssured(@Optional String baseUrl){
        if (baseUrl == null){
            baseUrl = "http://localhost:9000";
        }
        RestAssured.baseURI = baseUrl;

        System.out.println(String.format("Corriendo en  %s ", baseUrl));
    }

    @BeforeMethod
    public void before(){
        request = RestAssured.given();
    }

}


