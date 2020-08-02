package steps;

import actions.PetActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

public class CreatePetStepsDefinition {

    @Steps
    PetActions petActions = new PetActions();

    @Given("I send a POST request with body to add a new pet")
    public void i_send_a_POST_request_with_body_to_add_a_new_pet() {
        petActions.createPet();

    }

    @Then("I send GET request to check pet is added")
    public void i_send_GET_request_to_check_pet_is_added() {
       petActions.getPetById(123);
    }
}
