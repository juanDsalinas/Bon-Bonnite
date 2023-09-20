package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.RegisterPage;

public class RegisterInvalidQuestion implements Question {

    // creacion de la question para que valide con un texto
    @Override
    public Object answeredBy(Actor actor) {
<<<<<<< HEAD
        return Text.of(RegisterPage.LBL_USERNAME).viewedBy(actor).asString();
        /*return Enabled.of(RegisterPage.ALT_ERROR_MESSAGE.of(" Ya hay una cuenta registrada con tu dirección de correo electrónico. ")).viewedBy(actor).asBoolean();*/
=======
        return Enabled.of(RegisterPage.ALT_ERROR_MESSAGE.of(" Por favor escribe una dirección de correo electrónico válida.")).viewedBy(actor).asBoolean();
>>>>>>> 90baa97c08b849a493b47f6197c9c6a63f2a83fc
    }

    public static RegisterInvalidQuestion invalid(){
        return new RegisterInvalidQuestion();
    }
}
