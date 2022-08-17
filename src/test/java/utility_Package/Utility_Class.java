package utility_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_Class 
{
//	public String readDataFromExcel(int rowNum,int cellNum) throws EncryptedDocumentException, IOException
//	{
//		File myFile = new File("D:\\Selenium\\9th_April_Evening.xlsx");
//		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
//		String value = mySheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
//		return value;	
//	}

	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream myFile = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\myMaven\\myProperty.properties");
		
		prop.load(myFile);
		
		String value = prop.getProperty(key);
		return value;
		
	}
	
	public static void implictWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
		
}
