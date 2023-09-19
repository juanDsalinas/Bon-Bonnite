package stepsdefinitions;

import com.gargoylesoftware.htmlunit.javascript.host.security.Credential;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.RegisterModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.apache.xerces.impl.xpath.regex.Match;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.RegisterInvalidQuestion;
import questions.RegisterQuestion;
import tasks.ClickOnAccountIconTask;
import tasks.RegisterTask;

import java.util.List;
import java.util.Map;

public class RegisterStepDefinitions {

    // configuracion antes de ejecutar los escenarios
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

    // Escenario Exitoso
    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }


    @When("the user enter ethe credentials")
    public void theUserEnterEtheCredentials(List<RegisterModel> credentialsList) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnAccountIconTask.clickOnAccountIcon());
        RegisterModel credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.enter(credentials));

    }

    // Asercion para validar el correcto logueo
    @Then("the user should see the dashboard")
    public void theUserShouldSeeTheDashboard() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterQuestion.successuful()
        , Matchers.is("LISTA DE DESEOS")));
    }


    // Escenario Fallido


    @When("the user enter the failed credentials")
    public void theUserEnterTheFailedCredentials(List<RegisterModel> credentialList) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnAccountIconTask.clickOnAccountIcon());
        RegisterModel credentials;
        credentials = credentialList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.enter(credentials));
    }

    @Then("the user should see a error message")
    public void theUserShouldSeeAErrorMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterInvalidQuestion.invalid()
        , Matchers.is(true)));
    }

    // Scenario Empty
    @When("the user enter the empty credentials")
    public void theUserEnterTheEmptyCredentials(List<RegisterModel> credentialList) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnAccountIconTask.clickOnAccountIcon());
        RegisterModel credentials;
        credentials = credentialList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.enter(credentials));
    }

    @After
    public void tearDown(){
        hisBrowser.quit();
    }

}
