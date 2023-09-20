package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.RegisterPage;

public class RegisterQuestionEmpty implements Question {

    // creacion de la question para que valide con un texto
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RegisterPage.LBL_USERNAME).viewedBy(actor).asString();
        /*return Enabled.of(RegisterPage.ALT_ERROR_MESSAGE.of(" Por favor escribe una dirección de correo electrónico válida."));*/
    }
    public static RegisterQuestionEmpty empty (){
        return new RegisterQuestionEmpty();
    }
}
