package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page {
	
	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	public Kite_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void sendUserID(String UN)
	{
		userID.sendKeys(UN);
	}
	public void sendPassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
