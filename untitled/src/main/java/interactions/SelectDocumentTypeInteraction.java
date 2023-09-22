package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectDocumentTypeInteraction implements Interaction {

    private final String docType;

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (docType){
            case "CC":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_DOC_TYPE.of("1")));
                break;
            case "CE":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_DOC_TYPE.of("2")));
                break;
            case "PP":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_DOC_TYPE.of("3")));
                break;
            case "NIT":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_DOC_TYPE.of("4")));
                break;
            case "IDC":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_DOC_TYPE.of("5")));
                break;
            case "DE":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_DOC_TYPE.of("6")));
                break;
        }
    }
    public static SelectDocumentTypeInteraction selectDocumentType(String docType){
        return instrumented(SelectDocumentTypeInteraction.class,docType);
    }
}
