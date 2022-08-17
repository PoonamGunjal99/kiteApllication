package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_Page
{
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	public Kite_Pin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
