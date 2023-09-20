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
        OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(""));
    }

    @When("the user add a product into the cart")
    public void theUserAddAProductIntoTheCart() {

    }
    @And("the user repeat this process other twice")
    public void theUserRepeatThisProcessOtherTwice() {

    }
    @And("the user clicks on the cart and see cart")
    public void theUserClicksOnTheCartAndSeeCart() {

    }
    @And("the user clicks on finalizar compra and clicks on continuar")
    public void theUserClicksOnFinalizarCompraAndClicksOnContinuar() {

    }
    @And("the user filled out the form with their data and clicks on pagar")
    public void theUserFilledOutTheFormWithTheirDataAndClicksOnPagar() {

    }
    @Then("the user should see the payment gateway")
    public void theUserShouldSeeThePaymentGateway() {

    }


    // Scenario
    @Given("that the user is on the shoes section")
    public void thatTheUserIsOnTheShoesSection() {

    }


    @When("he select the product number")
    public void heSelectTheProductNumber(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @And("user clicks on buy after selecting size")
    public void userClicksOnBuyAfterSelectingSize(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @Then("the user should see the buy car")
    public void theUserShouldSeeTheBuyCar() {
        // Write code here that turns the phrase above into concrete actions

    }

//    @After
//    public void tearDown(){
//        hisBrowser.quit();
//    }
}
