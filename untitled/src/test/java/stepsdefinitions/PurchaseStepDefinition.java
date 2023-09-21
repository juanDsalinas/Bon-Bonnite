package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.PaymentDataModel;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;

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
    public PaymentDataModel paymentData(Map<String,String> userData){
        return new PaymentDataModel(
                userData.get("gender"),
                userData.get("documentype"),
                userData.get("country"),
                userData.get("department"),
                userData.get("city")
        );
    }


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
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnBuyButtonTask.clickOnBuyButton());
    }


    @When("the user clicks on the confirmation buttons to access the billing form")
    public void theUserClicksOnTheConfirmationButtonsToAccessTheBillingForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClsCarBuyButtonTask.confirmationCarButtons());
        OnStage.theActorInTheSpotlight().attemptsTo(ClsFinishBuyNextBtnTask.confirmationButtons());
    }


    @When("the user enters the following data to the billing form")
    public void theUserEntersTheFollowingDataToTheBillingForm(List<PaymentDataModel> paymentDataList) {
//        PaymentDataModel userData;
//        userData = paymentDataList.get(0);

    }

    @When("the user clicks on the payment button")
    public void theUserClicksOnThePaymentButton() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the user should see the payment gateway")
    public void theUserShouldSeeThePaymentGateway() {
        // Write code here that turns the phrase above into concrete actions

    }



}
