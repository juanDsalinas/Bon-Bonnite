package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.RegisterModel;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.ClickOnAccountIconTask;

import java.util.Map;

public class RegisterStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    // tabla para iterar sobre todos los datos del datatabla
    @DataTableType
    public RegisterModel userData(Map <String, String> value){
        return new RegisterModel(
                value.get("document"),
                value.get("email"),
                value.get("password"));
    }


    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }


    @When("the user enter ethe credentials")
    public void theUserEnterEtheCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnAccountIconTask.clickOnAccountIcon());

    }

    @Then("the user should see the dashboard")
    public void theUserShouldSeeTheDashboard() {

    }


    @After
    public void tearDown(){
        hisBrowser.quit();
    }
}
