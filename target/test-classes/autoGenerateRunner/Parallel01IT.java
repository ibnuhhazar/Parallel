import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Cucumber-AutoGenerate-Runner-master/src/test/resources/features/AddNumber.feature"},
        plugin = {"json:C:/Cucumber-AutoGenerate-Runner-master/target/cucumber-parallel/json/1.json"},
        monochrome = true,
        tags = {"@MultiplyNumbers,@AddNumbers"},
        glue = {"stepDefinition"})
public class Parallel01IT {
}
