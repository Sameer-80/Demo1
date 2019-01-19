package JLogin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\JLogin\\feature"},
		glue={"src\\test\\java\\JLogin\\step"},
		monochrome=true,
		tags={"@smoke"},
		plugin ={"pretty","html:target/cucumber","json:target/cucumber.json"}
		)


public class MainRunner
{

}
