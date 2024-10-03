package amazon_Testcases;

import org.testng.annotations.Test;

import amazon_POM.Homepage;
import amazon_POM.Login;
public class Testcase1 extends Launch_Quit
{
	@Test
	public void Login_Amazon()
	{
		Homepage h1 = new Homepage(driver);
		h1.accountlist(driver);
		h1.Signin();
		
		Login l1 = new Login(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.signin();
		
		
		
	}
}
