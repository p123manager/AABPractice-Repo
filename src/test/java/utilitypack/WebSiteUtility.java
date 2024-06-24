package utilitypack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WebSiteUtility {
	WebDriver driver;

	// open browser
	public WebDriver openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			RuntimeException e = new RuntimeException("Check browser name again");
			throw (e);
		}
		return driver;

	}

	// maximize browser
	public void browserMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	// defining explicit wait
	public FluentWait<WebDriver> defindExplicitWait(WebDriver driver, int timeoutsec, int intervelmillis) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(timeoutsec));
		wait.pollingEvery(Duration.ofMillis(intervelmillis));
		return wait;
	}

	// lunch site
	public void lunchSite(WebDriver driver, String url) {
		driver.get(url);
	}

	// close all browser window or tab
	public void closeAllWindowOrTab(WebDriver driver) {
		driver.quit();
	}

}
