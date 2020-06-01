package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\featurefile\\forumLogin.feature"},
		glue= {"stepDefinition"},
		//tags= {"@regression"},//putting the tag  name telling to run that specific methods
		plugin = {"pretty", "html:target/Report","json:target/cucumber.json"}
		)
public class RunTest {

}
//here target/report1 is the direcrtory and target/cucumber.
//json1 is the file name where it saved
//pretty format to see html fiel click on targer-index .
//right click on index and open with webBrowser
