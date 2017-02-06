package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromExcel {
	
	Properties p= new Properties();
public Properties fileRead() throws IOException{
/*{   
	LogIn logIN =new LogIn();
File src =new File("C:\\Selenium rc\\Book1.xlsx");
FileInputStream f= new FileInputStream(src);
XSSFWorkbook w=new XSSFWorkbook(f);
XSSFSheet s=w.getSheetAt(0);
String userName=s.getRow(0).getCell(0).getStringCellValue();
String passWord=s.getRow(0).getCell(1).getStringCellValue();
//w.close();
logIN.pLogIN(driver, userName, passWord);*/
InputStream stream= new FileInputStream(new File ("C:\\Users\\DIGGANT\\workspace\\MercuryTours\\src\\utilities\\ObjectRepository"));
p.load(stream);
return p;
}}



