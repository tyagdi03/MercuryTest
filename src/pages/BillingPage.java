package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ReadingExcel;

public class BillingPage {
    WebDriver driver;
    
	@FindBy(xpath="//input[contains(@name,'passFirst0')]")
	WebElement firstName;
	
	@FindBy(xpath="//input[contains(@name,'passLast0')]")
	WebElement lastName;
	
	@FindBy(xpath="//select[@name='pass.0.meal']")
	WebElement mealPreference;
	
	@FindBy(xpath="//select[@name='creditCard']")
	WebElement cardType;
	
	@FindBy(xpath="//input[@name='creditnumber']")
	WebElement cardNumber;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_mn']")
	WebElement expiryMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_yr']")
	WebElement expiryYear;
	
	@FindBy(xpath="//input[@name='cc_frst_name']")
	WebElement cardFirstName;
	
	@FindBy(xpath="//input[@name='cc_last_name']")
	WebElement cardLastName;

	@FindBy(xpath="//input[@name='billAddress1']")
	WebElement address1;
	
	@FindBy(xpath="//input[@name='billAddress2']")
	WebElement address2;
	
	@FindBy(xpath="//input[@name='billCity']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='billState']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='billZip']")
	WebElement zip;
	
	@FindBy(xpath="//select[@name='billCountry']")
	WebElement country;
	
	@FindBy(xpath="//input[@name='ticketLess']")
	WebElement ticketLess;
	
	@FindBy(xpath="//input[@name='buyFlights']")
	WebElement purchaseButton;
	
	public BillingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void billingDetails(){
		
		System.out.println("Hi this a git project");
		firstName.sendKeys(ReadingExcel.hm.get("firstName"));
		lastName.sendKeys(ReadingExcel.hm.get("lastName"));
System.out.println("beforeMeal");
		Select mealPref = new Select(mealPreference);
mealPref.selectByVisibleText(ReadingExcel.hm.get("mealPref"));

Select card = new Select(cardType);
card.selectByVisibleText(ReadingExcel.hm.get("cardType"));

cardNumber.sendKeys(ReadingExcel.hm.get("cardNumber"));

Select expMonth = new Select(expiryMonth);
System.out.println("SelectingMonth");
//card.selectByIndex(3);

Select expYear = new Select(expiryYear);
//card.selectByIndex(6);

cardFirstName.sendKeys(ReadingExcel.hm.get("cardFirstName"));
cardLastName.sendKeys(ReadingExcel.hm.get("cardLastName"));

address1.clear();
address1.sendKeys(ReadingExcel.hm.get("address1"));

address2.clear();
address2.sendKeys(ReadingExcel.hm.get("address2"));

city.clear();
city.sendKeys(ReadingExcel.hm.get("city"));

state.clear();
state.sendKeys(ReadingExcel.hm.get("state"));

zip.clear();
zip.sendKeys(ReadingExcel.hm.get("zip"));

Select country1= new Select(country);
country1.selectByVisibleText(ReadingExcel.hm.get("country"));

ticketLess.click();

purchaseButton.click();

System.out.println("Everything done");

	}
	
}
