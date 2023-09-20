package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.ClickOnMenuCategoriesTask;
import tasks.SelectAProductTask;

public class PurchaseStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    // implementation of feature
    @Given("the user is in the main page and clicks on some option of menu navigation")
    public void theUserIsInTheMainPageAndClicksOnSomeOptionOfMenuNavigation() {
        OnStage.theActorInTheSpotlight().wasAbleTo();
    }

    // Scenario Bulla
    @Given("that the user is on the {string} section")
    public void thatTheUserIsOnTheShoesSection(String menuOption) {
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnMenuCategoriesTask.selectMenuOption(menuOption));
    }

    @When("he select the product number {string} with the size {string}")
    public void heSelectTheProductNumberWithTheSize(String product, String size) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectAProductTask.selectProduct(product,size));
    }

    @And("user clicks on buy button")
    public void userClicksOnBuyButton() {
    }

    @Then("the user should see the buy car")
    public void theUserShouldSeeTheBuyCar() {
        // Write code here that turns the phrase above into concrete actions

    }

    // configuration for after of the proccess
   @After
    public void tearDown(){
        hisBrowser.quit();
    }

}
