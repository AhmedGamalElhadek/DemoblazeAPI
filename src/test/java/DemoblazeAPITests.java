import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DemoblazeAPITests {
    @Test
    public void testSignUp(){
        //Login URL
        String signUpURL = "https://api.demoblaze.com/signup";

        //User Data
        String userName= "Ahmed";
        String password = "123456789";

        //SignUp Data
        String signupData = "{\"username\": \"" + userName + "\", \"password\": \"" + password + "\"}";

        Response response = RestAssured.given()
                .contentType("application/json; charset=utf-8")
                .body(signupData)
                .when()
                .post(signUpURL);
        int statusCode = response.getStatusCode();
        if (statusCode==200)
            System.out.println("Successful SignUp");
        else
            System.out.println("Invalid Signup");
    }

    @Test
    public void testLogin(){
        //Login URL
        String loginUrl = "https://api.demoblaze.com/login";

        //User Data
        String userName= "Ahmed";
        String password = "123456789";

        //Login Data
        String loginData = "{\"username\": \"" + userName + "\", \"password\": \"" + password + "\"}";

        Response response = RestAssured
                .given()
                .contentType("application/json; charset=utf-8")
                .body(loginData)
                .when()
                .post(loginUrl);

        int statusCode = response.getStatusCode();
        if (statusCode==200)
            System.out.println("Successful Login");
        else
            System.out.println("Invalid Login");
    }
}