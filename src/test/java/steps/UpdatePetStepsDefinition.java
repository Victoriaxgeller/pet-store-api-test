//package steps;
//
//import actions.PetActions;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import org.junit.Assert;
//
//
//public class UpdatePetStepsDefinition {
//    @Steps
//    PetActions petActions;
//
//    @Given("Pet with id {int}")
//    public void pet_with_id(Integer int1) {
//        System.out.println("ttete");
//        Assert.assertEquals("ttete","ttete" );
//    }
//
//    @When("Send a POST request with body to add a new pet")
//    public void send_DELETE_request_to_delete_an_existing_Pet() {
//        System.out.println("t");
//    }
//
//    @Then("Send GET request to check pet is added")
//    public void i_send_GET_request_to_check_pet_does_not_exist() {
//        System.out.println("t");
//    }
//}
