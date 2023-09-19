package stepsdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.LoginModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.LoginQuestion;
import tasks.ClickOnAccountIconTask;
import tasks.LoginTask;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @DataTableType
    public LoginModel preparedData(Map<String,String> values){
        return new LoginModel(
                values.get("document"),
                values.get("password")
        );
    }

    @Given("that the user is on the login page")
    public void thatTheUserIsOnTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnAccountIconTask.clickOnAccountIcon());
    }
    @When("the user enter the following credentials")
    public void theUserEnterTheFollowingCredentials(List<LoginModel> credentialsList) {
        LoginModel credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.validateCredentials(credentials));
    }
    @Then("the user should see the main page")
    public void theUserShouldSeeTheMainPage() {
//        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.validateSuccessLogin()
//        , Matchers.is(""));
    }

}
