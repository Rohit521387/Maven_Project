package amazon_Testcases;

import org.testng.annotations.Test;

import amazon_POM.Homepage;
public class Testcase2 extends Launch_Quit
{
	@Test
	public void searching()
	{
		Homepage h1 = new Homepage(driver);
		h1.searching();
		
	}
}
