package Selenium.Selenium_Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser 
{

public static void main(String[] args) 
{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

}

}
