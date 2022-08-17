package utility_Package;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base_Package.Base_Class;


public class listner extends Base_Class implements ITestListener
{
	Base_Class b = new Base_Class();


	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("test case is sucessed "+result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("test case is Skipped "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) 
	{
		try {
			b.captureScreenshot("validateUserID");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("test case is skipped "+result.getName());
		
	
	}
}
