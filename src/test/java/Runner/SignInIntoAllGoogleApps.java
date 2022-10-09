package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//feature/SignInGoogleApps.feature",
glue = "StepDef",
dryRun = true, 
plugin = {"pretty","html:Reports/SIAGApps.html",
		  "pretty","json:Reports/SIAGApps.json",
		  "pretty","junit:Reports/SIAGApps.junit"})


public class SignInIntoAllGoogleApps {

}
