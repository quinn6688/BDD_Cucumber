package features.system;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Created by quinn.cheng on 11/14/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features.system")
public class HelloWorldStepdefs {
    @Given("^I have a greeting application with \"([^\"]*)\"$")
    public void i_have_a_greeting_application_with(String name) throws Throwable {
        System.out.println("I have a greeting application with \"" + name + "\".");
    }

    @When("^I ask it to say \"([^\"]*)\"$")
    public void i_ask_it_to_say_hi(String name) throws Throwable {
        System.out.println("I ask it to say \"" + name + "\".");
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void i_receive(String name) throws Throwable {
        System.out.println("I receive \"" + name + "\"!");
    }
}
