package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@ RunWith(Cucumber.class)
@ CucumberOptions(features="src/test/resources/feature/MoveToCart.feature",
glue="cucumber",//plugin="junit:target/xmlreport.xml")
plugin="json:target/jsonreport.json")
//plugin="html:target/htmlreport")


public class Runner {

}
