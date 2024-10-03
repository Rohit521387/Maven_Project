package amazon_Testcases;

import org.testng.annotations.Test;

import amazon_POM.Homepage;
import amazon_POM.Registration;
public class Testcase3 extends Launch_Quit
{
	@Test
	   public void registration()
	   {
		  Homepage h1 = new Homepage(driver);
		  h1.accountlist(driver);
		  
		  Registration r1 =new Registration(driver);
		  r1.Starthere();
		  r1.Firstname();
		  r1.Mobile_No();
		  r1.Password();
		  r1.Cont();
		   
		   
		}	     
}
