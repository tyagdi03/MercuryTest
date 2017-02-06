package test;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.BillingPage;
import pages.FlightFinder;
import pages.FlightSelection;
import pages.LogIn;
import utilities.ReadFromExcel;
import utilities.ReadingExcel;
import utilities.TakeScreenshot;

public class MainClass {
		
	WebDriver driver;
	ReadFromExcel readExcel= new ReadFromExcel();

	//@BeforeM
	//public void driverInit(){
		
	/*System.setProperty("webdriver.chrome.driver","C:\\Selenium rc\\chromedriver.exe");
	driver=new ChromeDriver();*/

	@Test(priority =0)
	
	public void logInTest() throws Exception {
		for(int i=1;i<2;i++){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium rc\\chromedriver.exe");
			driver=new ChromeDriver();
		LogIn logIn =new LogIn(driver);
		Properties p=readExcel.fileRead();
		logIn.pLogIN(p.getProperty("URL"),p.getProperty("UserName"), p.getProperty("PassWord"));
	Assert.assertEquals(driver.getTitle(),"Find a Flight: Mercury Tours:");
	
	
		ReadingExcel ReadingObjectRepository= new ReadingExcel();
	//@Test(priority=1)
	//public void flightFinder() throws Exception{
	
		
	FlightFinder ff=new FlightFinder(driver);
	ReadingObjectRepository.objectRepositoryRead(i);
	ff.flightFinder();
	/*driver.navigate().refresh();
	if(ExpectedConditions.alertIsPresent() != null)
	{
		driver.switchTo().alert().accept();
	}
	driver.navigate().refresh();*/
	Assert.assertEquals(driver.getTitle(),"Select a Flight: Mercury Tours");


	
	//@Test(priority=2)
	//public void reserveFlights(){
		FlightSelection fSelect= new FlightSelection(driver);
		fSelect.flightSelection();
		Assert.assertEquals(driver.getTitle(),"Book a Flight: Mercury Tours");

	//}
	//@Test(priority=3)
	//public void billing() throws IOException{
		BillingPage bp= new BillingPage(driver);
		bp.billingDetails();
		TakeScreenshot tShot= new TakeScreenshot(driver);
		tShot.takeScreenShot(i);
		driver.close();

	}
}	
}
	
	
	

