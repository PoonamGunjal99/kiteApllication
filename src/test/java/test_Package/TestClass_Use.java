package test_Package;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_Package.Base_Class;
import pom_Classes.Kite_Home_Page;
import pom_Classes.Kite_Login_Page;
import pom_Classes.Kite_Pin_Page;
import utility_Package.Utility_Class;


@Listeners(utility_Package.listner.class)
public class TestClass_Use extends Base_Class
{
	Kite_Login_Page kl;
	Kite_Pin_Page kp;
	Kite_Home_Page kh;
	
	@BeforeClass
	public void launchKite() throws IOException
	{
		launchBrowser("chrome");
		
	  kl = new Kite_Login_Page(driver);
	  kp = new Kite_Pin_Page(driver);
      kh = new Kite_Home_Page(driver);

		
	}
	
	@BeforeMethod
	public void loginKite() throws IOException
	{
		kl.sendUserID(Utility_Class.readDataFromPropertyFile("UN"));
		Reporter.log("userID send",true);

		kl.sendPassword(Utility_Class.readDataFromPropertyFile("PWD"));
		Reporter.log("password send",true);

		kl.clickOnLoginButton();
		Reporter.log("login successfully",true);
		
		Utility_Class.implictWait(driver, 1000);
		
		kp.sendPin(Utility_Class.readDataFromPropertyFile("PIN"));
		Reporter.log("sending pin",true);

		kp.clickOnContinueButton();
		Reporter.log("cliked on continue button",true);

		
		Utility_Class.implictWait(driver, 1000);
	
	}
	
	
  @Test
  public void validateUserID() throws IOException 
  {
	  Assert.assertEquals(kh.getActualUserID(), Utility_Class.readDataFromPropertyFile("UN"),"expected & actual userID not matched,hence TC failed");
		Reporter.log("expected & actual user Id matched hence TC is passed",true);

  }
  
  @AfterMethod
  public void logoutKite() throws InterruptedException
  {
	  kh.clickOnLogoutButton();
  }
  
  @AfterClass
  public void closeKite()
  {
	  closeBrowser();
  }
}
