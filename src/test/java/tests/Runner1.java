package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//linkin feature file to runner class
@CucumberOptions(
		features={"src\\test\\resources\\featurefiles\\feature1.feature"},
		glue= {"gluecode"},
		plugin= {"pretty","html:target\\googletitlereport"},
		monochrome=true
		
		)
public class Runner1 extends AbstractTestNGCucumberTests{
    //empty
}
