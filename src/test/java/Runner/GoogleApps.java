package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//feature/GoogleApps.feature",
glue = "StepDef",
dryRun = false)
//plugin = {"pretty","html:Reports/GApps1.html",
//		  "pretty","json:Reports/GApps1.json",
//		  "pretty","junit:Reports/GApps1.junit"})

public class GoogleApps {

}
