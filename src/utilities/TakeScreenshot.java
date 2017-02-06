package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sun.jna.platform.FileUtils;

public class TakeScreenshot {
	WebDriver driver;
	
	public TakeScreenshot(WebDriver driver) {
this.driver= driver;
	}
	public void takeScreenShot(int i) throws IOException{

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("./Screenshots\\Ticket"+i+".png");

                //Copy file at destination

                org.apache.commons.io.FileUtils.copyFile(SrcFile, DestFile);
}
}