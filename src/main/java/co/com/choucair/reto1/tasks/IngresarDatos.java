package co.com.choucair.reto1.tasks;

import java.util.List;

import co.com.choucair.reto1.model.AutomationDemoSiteFormData;
import co.com.choucair.reto1.userinterface.Formulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatos implements Task {

	public static IngresarDatos alFormulario(List<AutomationDemoSiteFormData> automationDemoSiteFormData) {
		return Tasks.instrumented(IngresarDatos.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Formulario.NAME),
				Enter.theValue("Carlos").into(Formulario.NAME),
				Enter.theValue("Antonio").into(Formulario.LAST_NAME),
				Enter.theValue("calle 1 -1").into(Formulario.ADDRESS),
				Enter.theValue("carlos@yopmail.com").into(Formulario.EMAIL),
				Enter.theValue("1234567").into(Formulario.PHONE),
				Click.on(Formulario.GENDER),
				Click.on(Formulario.HOBBIES),
				Enter.theValue("Arabic").into(Formulario.LANGUAGES),
				Click.on(Formulario.SELECT_COUNTRY_OPEN),
				Click.on(Formulario.SELECT_COUNTRY_DENMARK),
				Click.on(Formulario.YEAR_OPEN),
				Click.on(Formulario.YEAR_1996),
				Click.on(Formulario.MONTH_OPEN),
				Click.on(Formulario.MONTH_MAY),
				Click.on(Formulario.DAY_OPEN),
				Click.on(Formulario.DAY_14),
				Enter.theValue("12345").into(Formulario.PASSWORD),
				Enter.theValue("12345").into(Formulario.CONFIRM_PASSWORD),
				Click.on(Formulario.BTNSUBMIT)
				);
	}
}
