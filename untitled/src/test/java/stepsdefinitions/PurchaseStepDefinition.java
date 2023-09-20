package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.PurchaseSuccessful;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.ClickOnMenuCategoriesTask;
import tasks.PurchaseSuccessfulTask;
import tasks.SelectAProductTask;

import java.util.List;
import java.util.Map;

public class PurchaseStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @DataTableType
    public PurchaseSuccessful userData(Map<String, String> value){
        return new PurchaseSuccessful(
                value.get("categories"),
                value.get("numProduct"),
                value.get("size")
        );
    }

    // implementation the feature of me
    @Given("the user is in the main page and clicks on some categorie")
    public void theUserIsInTheMainPageAndClicksOnSomeCategorie(List<PurchaseSuccessful> credentialList) {
        PurchaseSuccessful credentials;
        credentials = credentialList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseSuccessfulTask.select(credentials));
    }

    @When("the user add a product into the cart")
    public void theUserAddAProductIntoTheCart(io.cucumber.datatable.DataTable dataTable) {

    }
    @When("the user repeat this process again")
    public void theUserRepeatThisProcessAgain(io.cucumber.datatable.DataTable dataTable) {

    }
    @When("the user clicks on the cart and see cart")
    public void theUserClicksOnTheCartAndSeeCart() {

    }
    @When("the user clicks on finalize purchase and clicks on continue")
    public void theUserClicksOnFinalizePurchaseAndClicksOnContinue() {

    }
    @When("the user filled out the form with their data and clicks on buy")
    public void theUserFilledOutTheFormWithTheirDataAndClicksOnBuy() {

    }
    @Then("the user should see the payment gateway")
    public void theUserShouldSeeThePaymentGateway() {

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
