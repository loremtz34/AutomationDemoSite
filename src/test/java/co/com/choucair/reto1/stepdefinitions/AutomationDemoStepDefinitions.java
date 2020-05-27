package co.com.choucair.reto1.stepdefinitions;

import java.util.List;

import co.com.choucair.reto1.model.AutomationDemoSiteFormData;
import co.com.choucair.reto1.questions.Answer;
import co.com.choucair.reto1.tasks.IngresarDatos;
import co.com.choucair.reto1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationDemoStepDefinitions {
	
	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() {
		OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
	}

	@When("^el realiza el registro en la pagina$")
	public void elRealizaElRegistroEnLaPagina(List<AutomationDemoSiteFormData> AutomationDemoSiteFormData) {	
		OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.alFormulario(AutomationDemoSiteFormData));
	}

	@Then("^el verifica que se carga la pantalla con texto Double Click on Edito Icon to EDIT the Table Row$")
	public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditoIconToEDITTheTableRow(String question) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
	}
}
