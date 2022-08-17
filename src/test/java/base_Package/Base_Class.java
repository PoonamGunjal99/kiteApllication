package base_Package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility_Package.Utility_Class;

public class Base_Class 
{
	protected static WebDriver driver;
public void launchBrowser(String BName) throws IOException
{
    if(BName.equalsIgnoreCase("chrome"))
      {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
      }

    else if(BName.equalsIgnoreCase("firefox"))
      {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
      }
    
    driver.get(Utility_Class.readDataFromPropertyFile("URL"));
}

  public void captureScreenshot(String tcName) throws IOException
  {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest = new File("D:\\Selenium\\Screenshots\\"+tcName+"123.png");
	  FileHandler.copy(src, dest);

	 
  }
  
  public void closeBrowser()
  {
	  driver.close();
  }




}





