package actions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.models.Pet;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.given;

public class PetActions {

    @Step
    public void createPet() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Pet pet = new Pet();
        pet.name = "test";
        pet.id = 123;
        given()
                .contentType(ContentType.JSON)
                .header("ContentType",
                        "application/json")
                .accept(ContentType.JSON)
                .body(pet)
                .when()
                .post("/pet")
                .then()
                .statusCode(200).log().all();
    }

    @Step
    public void getPetById(int id, int statusCode) {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given()
                .contentType(ContentType.JSON)
                .header("ContentType",
                        "application/json")
                .accept(ContentType.JSON)
                .when()
                .get("/pet/" + id)
                .then()
                .statusCode(statusCode).log().all();
    }

    @Step
    public void deletePetById(int id) {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given()
                .contentType(ContentType.JSON)
                .header("ContentType",
                        "application/json")
                .accept(ContentType.JSON)
                .when()
                .delete("/pet/" + id)
                .then()
                .statusCode(200).log().all();
    }

}


