package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//feature/GoogleWebPage.feature",
glue = "StepDef",
dryRun = true, 
plugin = {"pretty","html:Reports/GWPage.html",
		  "pretty","json:Reports/GWPage.json",
		  "pretty","junit:Reports/GWPage.junit"})



public class GoogleWebPage {

}
