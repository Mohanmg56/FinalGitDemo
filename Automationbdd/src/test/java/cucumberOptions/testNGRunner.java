package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="srsc/test/java/featurefiles",glue="stepdefenations",monochrome=true)
public class testNGRunner {

}
