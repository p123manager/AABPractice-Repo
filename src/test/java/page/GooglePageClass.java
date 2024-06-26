package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

public class GooglePageClass {
	WebDriver driver;
	FluentWait<WebDriver> wait;
	
	//locate element
   @FindBy(xpath="//textarea[@class='gLFyf']") private WebElement searchbox;
   
   //lizy initilization
   public GooglePageClass(WebDriver driver,FluentWait<WebDriver> wait) {
	   this.driver=driver;
	   this.wait=wait;
	   PageFactory.initElements(driver,this);//lazy initilization
   }
   
   //public method to operate
   public  void searchAWord(String word) {
	   searchbox.sendKeys(word,Keys.ENTER);
	   }
}
