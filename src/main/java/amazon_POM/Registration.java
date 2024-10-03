package amazon_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration 
{
	ChromeDriver driver;
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement Starthere;
	
	@FindBy(id="ap_customer_name")
	WebElement FirstName;
	
	@FindBy(id="ap_phone_number")
	WebElement Mobile_No;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="continue")
	WebElement Continue;
	
	public void accountlist(ChromeDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void Starthere()
	{
		Starthere.click();
	}
	public void Firstname()
	{
		FirstName.sendKeys("Rohit");
	}
	public void Mobile_No()
	{
		Mobile_No.sendKeys("8830405306");
	}
	public void Password()
	{
		Password.sendKeys("Amazon123@#");
	}
	public void Cont()
	{
		Continue.click();
	}
	public Registration (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
