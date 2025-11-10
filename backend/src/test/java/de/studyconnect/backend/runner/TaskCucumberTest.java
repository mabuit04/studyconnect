package de.studyconnect.backend.runner;

//import org.junit.jupiter.api.extension.ExtendWith;
/*
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
*/
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to the feature files
    glue = "de.studyconnect.backend.steps",    // Package containing step definitions
    plugin = {"pretty", "summary", "html:target/cucumber-report.html"}, // Verbose output
    monochrome = true
)
 */
import org.springframework.boot.test.context.SpringBootTest;
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= { SpringTestConfiguration.class})

import io.cucumber.spring.CucumberContextConfiguration;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@CucumberContextConfiguration
@SpringBootTest
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "de.studyconnect.backend")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

public class TaskCucumberTest {
}