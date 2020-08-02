package steps;

import actions.PetActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class UploadImageStepsDefinition {
    @Steps
    PetActions petActions;

    @Given("Send a POST request with image url")
    public void sendAPostWithImageUrl(Integer int1) {
        System.out.println("ccccc");
        Assert.assertEquals("sss","sss" );
    }
    @Then("Send GET request to check pet is with image now")
    public void SendGETrequesttocheckPetIsWithImageNow() {
        System.out.println("t");
    }
}
