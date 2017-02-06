package utilities;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcel {
	
	static public HashMap<String, String> hm=new HashMap();
	public static void objectRepositoryRead(int row) throws Exception
	{   
		
		//LogIn logIN =new LogIn();
	File src1 =new File("C:\\Selenium rc\\ObjectRepository.xlsx");
	FileInputStream repositoryFile= new FileInputStream(src1);
	XSSFWorkbook w1=new XSSFWorkbook(repositoryFile);
	XSSFSheet s1=w1.getSheetAt(0);
	System.out.println("Hi");
	int s=s1.getRow(0).getPhysicalNumberOfCells();
	
	for(int i=0;i<s;i++){
		
		hm.put(s1.getRow(0).getCell(i).getStringCellValue(),s1.getRow(row).getCell(i).getStringCellValue());
	//System.out.println("HI");
	}
	
}
	
	
	
}