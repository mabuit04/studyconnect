package de.studyconnect.backend.runner;

import org.junit.jupiter.api.extension.ExtendWith;
/*
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
*/
import org.springframework.test.context.junit.jupiter.SpringExtension;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to the feature files
    glue = "de.studyconnect.backend.steps",    // Package containing step definitions
    plugin = {"pretty", "summary", "html:target/cucumber-report.html"}, // Verbose output
    monochrome = true
)
 */

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= { SpringTestConfiguration.class})

public class TaskCucumberIT {
}