package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//feature/LaunchGoogleApps.feature",
glue = "StepDef",
dryRun = true, 
plugin = {"pretty","html:Reports/LGApps.html",
		  "pretty","json:Reports/LGApps.json",
		  "pretty","junit:Reports/LGApps.junit"})

public class LaunchGoogleApps {

}
