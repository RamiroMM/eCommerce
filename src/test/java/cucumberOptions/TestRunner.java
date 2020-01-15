package cucumberOptions;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions",
		plugin = {"pretty", "json:target/report.json", "junit:target/io.xml", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
		)


public class TestRunner {

}
