package api.user_data;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReqresNoPojoTest {

    @Test
    public void checkAvatars() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .statusCode(200)
                .body("page", equalTo(2))
                .body("data.id[0]", equalTo(7))
                .body("data.email", notNullValue())
                .body("data.first_name", notNullValue())
                .body("data.last_name", notNullValue())
                .body("data.avatar", notNullValue())
                .extract().response();

        JsonPath jsonPath = response.jsonPath();

        List<String> emails = jsonPath.get("data.email");
        List<String> avatars = jsonPath.get("data.avatar");
        List<Integer> id = jsonPath.get("data.id");

        for (int i = 0; i < avatars.size(); i ++) {
            Assert.assertTrue(avatars.get(i).contains(id.get(i).toString()));
        }

        Assert.assertTrue(emails.stream().allMatch(x -> x.endsWith("@reqres.in")));
    }

    @Test
    public void successUserReg() {
        Map<String, String> user = new HashMap<>();
        user.put("email", "eve.holt@reqres.in");
        user.put("password", "cityslicka");
        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("https://reqres.in/api/register")
                .then().log().all()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPath = response.jsonPath();

        int id = jsonPath.get("id");
        String token = jsonPath.get("token");

        Assert.assertEquals(id, 4);
        Assert.assertEquals(token, "QpwL5tke4Pnpja7X4");
    }

    @Test
    public void unsuccessfulUserReg() {
        Map<String, String> user = new HashMap<>();
        user.put("email", "sydney@fife");
        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("https://reqres.in/api/register")
                .then().log().all()
                .statusCode(400)
                .extract().response();

        JsonPath jsonPath = response.jsonPath();
        String error = jsonPath.getString("error");
        Assert.assertEquals(error, "Missing password");
    }
}
