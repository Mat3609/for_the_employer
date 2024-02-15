package api;

import api.colors.ColorsData;
import api.registration.Registration;
import api.registration.SuccessReg;
import api.registration.UnsuccessReg;
import api.user_data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import api.spec.Specification;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;


public class ReqresTest {

    private static final String URL = "https://reqres.in/";

    @Test
    public void checkAvatarAndId() {

        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));
        List<String> userId = users.stream().map(x -> x.getId().toString()).collect(Collectors.toList());
        List<String> userAvatar = users.stream().map(UserData :: getAvatar).collect(Collectors.toList());

        for (int i = 0; i < userAvatar.size(); i++) {
            Assert.assertTrue(userAvatar.get(i).contains(userId.get(i)));
        }
    }

    @Test
    public void successRegistration() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Registration user = new Registration("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessReg.class);

        Assert.assertNotNull(successReg.getId());
        Assert.assertNotNull(successReg.getToken());

        Assert.assertEquals(successReg.getId(), id);
        Assert.assertEquals(successReg.getToken(), token);

    }

    @Test
    public void unsuccessfulRegistration() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecError400());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        String expectedRes = "Missing password";
        Registration user = new Registration("sydney@fife", "");
        UnsuccessReg unsuccessReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(UnsuccessReg.class);

        Assert.assertEquals(unsuccessReg.getError(), expectedRes);
    }

    @Test
    public void sortedList() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        List<ColorsData> colorsData = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);
        List<Integer> years = colorsData.stream().map(ColorsData :: getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        System.out.println(years);
        System.out.println(sortedYears);
        Assert.assertEquals(sortedYears, years);
    }

    @Test
    public void deleteUser() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecUnique(204));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }
}
