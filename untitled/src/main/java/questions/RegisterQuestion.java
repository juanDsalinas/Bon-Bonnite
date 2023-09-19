package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of();
    }

    public static RegisterQuestion successuful (){
        return new RegisterQuestion();
    }
}
