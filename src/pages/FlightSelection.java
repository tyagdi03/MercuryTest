package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelection {
	
	WebDriver driver;
	@FindBy(xpath ="//*[contains(text(),'361')]//ancestor::tr[1]/td/input")
	WebElement departFlight;
	
	@FindBy(xpath ="//*[contains(text(),'631')]//ancestor::tr[1]/td/input")
	WebElement returnFlight;
	
	@FindBy(xpath ="//input[@name='reserveFlights']")
	WebElement reserveFlights;

	public FlightSelection(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void flightSelection(){
		
		departFlight.click();
		returnFlight.click();
		reserveFlights.click();
		
	
		
	}
}
