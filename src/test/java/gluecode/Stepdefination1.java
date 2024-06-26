package gluecode;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GooglePageClass;
import utilitypack.PropertFileUtility;
import utilitypack.WebSiteUtility;

public class Stepdefination1 {
	String  expected_result="virat kohli";
	public WebDriver driver;
	 WebSiteUtility  wu = new WebSiteUtility();
	FluentWait<WebDriver>wait;
	String pfpath = "src\\test\\resources\\propertifile\\config.properties";
	GooglePageClass pom;
	
	@Given("open {string} browser")
	public void open_Browser(String browser_name) throws Exception {
		driver = wu.openBrowser(browser_name);
		wu.browserMaximize(driver);
		int x = Integer.parseInt(PropertFileUtility.getValueFromPropertyFile(pfpath, "maxwaitpersec"));
		int y = Integer.parseInt(PropertFileUtility.getValueFromPropertyFile(pfpath, "intervalpermillsec"));
		wait=wu.defindExplicitWait(driver, x,y);

	}

	@When("launch google site")
	public void launch_site() throws Exception {
		wu.lunchSite(driver, PropertFileUtility.getValueFromPropertyFile(pfpath, "url"));
	}

	@When("locate search box and enter a {string}")
	public void enter_word(String word) {
	     pom=new GooglePageClass(driver,wait);
		  pom.searchAWord(word);
	}

	@Then("page title should contain {string}")
	public void validate(String expected_result) {
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		if (actual_result.contains(expected_result)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

	@Then("close site")
	public void close_site() {
		wu.closeAllWindowOrTab(driver);
	}
}
