import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetTestToken {
    @Test
    public void testToken() {
        RestAssured.given()
                .queryParam("corpid","ww1f691912c2e119e7")
                .queryParam("corpsecret", "KdhtVTmjl5lSfIOxqJALyrM9tNABK2Dn7GMKDxEU-I8")
                .when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then()
                .log().all()
                .statusCode(200).body("errcode",equalTo(0));
    }
}
