package amazon_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	ChromeDriver driver;
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement Continue_button;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signIn_button;
	
	public void un()
	{
		username.sendKeys("8830405306");
	}
	public void cnt()
	{
		Continue_button.click();
	}
	public void pwd()
	{
		password.sendKeys("Amazon555@#");
	}
	public void signin()
	{
		signIn_button.click();
	}
	
	public Login(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
