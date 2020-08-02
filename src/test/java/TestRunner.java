
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"steps"},
        monochrome = true,
        plugin = {"pretty", "junit:target/reports/junit-reports/report.xml",
                "json:target/reports/json-reports/report.json",
                "html:target/reports/html-reports/report.html"})
public class TestRunner {

}
