package co.com.choucair.reto1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/web_automation_demo_site.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.reto1.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerReto1 {
}
