package org.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\IdeaProjects\\ParaBank\\src\\test\\FeatureFolder", glue = "org.stepDef",
dryRun = false, monochrome = false, tags = "@login", plugin = {"pretty","json:Report\\jsonReport\\parabank.json",
        "html:Report\\htmlReport","junit:Report\\junitReport\\junit.xml"})
public class RunnerClass extends BaseClass {

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
    }
}
