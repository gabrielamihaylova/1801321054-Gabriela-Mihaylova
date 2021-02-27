package uni.pl.fmi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber. class)
@CucumberOptions (features = "src/test/resources/Feature",plugin = {"pretty","html:target/cucumberRaport"} )
public class CucumberStarter {

}
