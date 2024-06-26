package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\resources\\featurefiles\\feature1.feature,"
				+ "src\\test\\resources\\featurefiles\\feature2.feature"},
		glue= {"gulecode"},
		plugin= {"pretty","html:target\\googletitlereport"},
		monochrome=true
		
		)
public class Runner1 extends AbstractTestNGCucumberTests{
    //empty
}
