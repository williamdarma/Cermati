package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        tags = "@Register",
        glue = {"StepsDefinition", "Utility"},
        plugin = {"pretty","html:target/cucumber-html-report.html","json:cucumber.json"}
)
public class TestRunner {

}
