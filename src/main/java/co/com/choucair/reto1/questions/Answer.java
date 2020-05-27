package co.com.choucair.reto1.questions;

import co.com.choucair.reto1.userinterface.Formulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
	
	private String question;
	
	public Answer (String question) {
		this.question = question;
	}
	
	public static Answer toThe (String question) {
		return new Answer(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		String labelhome = Text.of(Formulario.LBLVERIFICA).viewedBy(actor).asString();
		if(question.equals(labelhome)) {
			result=true;
		}else {
			result=false;
		}
		return null;
	}
}
