package de.studyconnect.backend.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to the feature files
    glue = "de.studyconnect.backend.steps",    // Package containing step definitions
    plugin = {"pretty", "summary", "html:target/cucumber-report.html"}, // Verbose output
    monochrome = true
)
public class TasksCucumberIT {
}