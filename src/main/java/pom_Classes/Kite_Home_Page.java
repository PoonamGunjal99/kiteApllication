package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page 
{
	@FindBy(xpath="//span[@class='user-id']")private WebElement UID;
	@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	
	
	public Kite_Home_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserID()
	{
		String actualUserID=UID.getText();
		 return actualUserID;
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		UID.click();
		Thread.sleep(1000);
		logoutButton.click();
	}

}
