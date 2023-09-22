package tasks;

import interactions.*;
import lombok.AllArgsConstructor;
import models.PaymentDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class EnterPaymentUserDataTask implements Task {

    private final PaymentDataModel paymentUserData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectGenderInteraction.selectGender(paymentUserData.getGender()),
                SelectDocumentTypeInteraction.selectDocumentType(paymentUserData.getDocumentype()),
                SelectCountryInteraction.selectCountry(paymentUserData.getCountry()),
                SelectDepartmentInteraction.selectDepartment(paymentUserData.getDepartment()),
                SelectCityInteraction.selectCity(paymentUserData.getCity())
                );
    }
    public static EnterPaymentUserDataTask enterUserData(PaymentDataModel paymentUserData){
        return instrumented(EnterPaymentUserDataTask.class,paymentUserData);
    }
}
