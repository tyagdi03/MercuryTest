package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.ReadingExcel;

public class FlightFinder{
	
	WebDriver driver;
	
	//ReadingObjectRepository reading=new ReadingObjectRepository();
	
	@FindBy(xpath = "//input[@value='oneway']")
	WebElement flightType;
	
	@FindBy(xpath = "//select[@name='passCount']")
	WebElement passCount;
	
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement departingFrom;
	
	@FindBy(xpath = "//select[@name='fromMonth']")
	WebElement fromMonth;
	
	@FindBy(xpath = "//select[@name='fromDay']")
	WebElement fromDate;
	
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement arrival;
	
	@FindBy(xpath = "//select[@name='toMonth']")
	WebElement toMonth;
	
	@FindBy(xpath = "//select[@name='toDay']")
	WebElement toDate;
	
	@FindBy(xpath = "(//input[@name='servClass'])[2]")
	WebElement serviceClass;
	
	@FindBy(xpath = "//select[@name='airline']")
	WebElement airlineName;
	
	@FindBy(xpath = "//input[@name='findFlights']")
	WebElement continueButton;
	
	
	
	
	public FlightFinder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void flightFinder(){	
		
	//Selecting Flight Type
		flightType.click();
	
	//Selecting PassCount
	Select passengersIndex =new Select(passCount);
	passengersIndex.selectByValue(ReadingExcel.hm.get("passCount"));
	
	//Selecting Departure From	
	Select departingindex =new Select(departingFrom);
	List<WebElement> l= departingindex.getOptions();
	System.out.println(l.get(1).getText());

		departingindex.selectByValue(ReadingExcel.hm.get("departingFrom"));
	
	//Selecting from month
	Select Monthindex =new Select(fromMonth);
	Monthindex.selectByValue(ReadingExcel.hm.get("fromMonth"));
	
	//Selecting Date
		Select dateIndex =new Select(fromDate);
		dateIndex.selectByValue(ReadingExcel.hm.get("fromDate"));
		
	//Selecting Arrival
		Select arrivalindex =new Select(arrival);
		arrivalindex.selectByValue(ReadingExcel.hm.get("arrival"));
		
		//Selecting arrival month
		Select toMonthindex =new Select(toMonth);
		toMonthindex.selectByValue(ReadingExcel.hm.get("toMonth"));
		
		//Selecting arrival date
		Select todateIndex =new Select(toDate);
		todateIndex.selectByValue(ReadingExcel.hm.get("toDate"));
		
		//Selecting ServiceClass
		serviceClass.click();
		
		//Selecting airline		
		Select airline =new Select(airlineName);
		airline.selectByVisibleText(ReadingExcel.hm.get("airlineName"));
		
		//Submitting form
		continueButton.click();
				
	}


}
