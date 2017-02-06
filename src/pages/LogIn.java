package pages;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.pattern.LoggingEventPatternConverter;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	WebDriver driver;
	
@FindBy(xpath= "//input[@name = 'userName']")
WebElement username_textBox;

@FindBy(xpath= "//input[@name = 'password']")
WebElement password_textBox;

@FindBy(xpath= "//input[@name = 'login']")
WebElement login_button;

public LogIn(WebDriver driver){
	this.driver= driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
}


	public void pLogIN(String url, String userName, String passWord) throws Exception{
				
		driver.get(url);
		driver.manage().window().maximize();
		
		username_textBox.sendKeys(userName);
		
		password_textBox.sendKeys(passWord);
		
		login_button.click();
		/*boolean loginSuccess=driver.findElement(By.xpath("//img[contains(@src,'flightfinder')]")).isDisplayed();
		if(loginSuccess){
			Log.info("LogIn Successful");
		}else{
			Log.info("LogIn failed");
		}
		driver.close();*/
		
	}
}
