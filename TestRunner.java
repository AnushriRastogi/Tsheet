package TS.TS;



//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;





@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-results", "usage:target/cucumber-results/cucumber-usage.json",
                "junit:target/cucumber-results/cucumber-results.xml", "json:target/cucumber-results/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/vimalSelvam-cucumberReport/report.html"},
        features = {"Featurefile/ts.feature"},
        glue = { "stepdefinition/" },
        tags = {}
        
)
public class TestRunner {

        @Before
        public static void setUp() {
                // TODO: Add your pre-processing

        }

        @After
        public static void tearDown () throws Exception {

        }
        }
