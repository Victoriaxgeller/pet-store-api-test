package steps;

import actions.PetActions;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class DeletePetStapsDefinition {
    @Steps
    PetActions petActions;

    @Given("Pet with id {int}")
    public void pet_with_id(Integer id) {
     petActions.getPetById(id, 200);
    }

    @When("Send DELETE request to delete an existing Pet")
    public void send_DELETE_request_to_delete_an_existing_Pet() {
        petActions.deletePetById(123);
    }

    @Then("I send GET request to check pet does not exist")
    public void i_send_GET_request_to_check_pet_does_not_exist() {
        petActions.getPetById(123, 404);
    }
}
