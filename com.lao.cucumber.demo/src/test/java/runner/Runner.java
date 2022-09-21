package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="classpath:/Features",
glue = "step_Definitions",
dryRun = false,
monochrome = true)
public class Runner {

}
