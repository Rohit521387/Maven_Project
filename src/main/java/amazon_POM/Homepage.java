package amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	ChromeDriver driver;
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement Signinbutton;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchingtheproduct;
	
	
	public void accountlist(ChromeDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void Signin()
	{
		Signinbutton.click();
	}
	
	public void searching()
	{
		Searchingtheproduct.sendKeys("shoe"+Keys.ENTER);
	}
	public Homepage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
