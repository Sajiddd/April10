package scripts2;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import pages.ActiTimeBaseTest;
import pages.ActiTimeLoginPage;
import pages.EnterTimeTrackPage;


public class TestValidLogin extends ActiTimeBaseTest {

	@Test(priority = 1)
	public void testValidLogin()
	{
		//data drive test method
		//to read the data from the excel file we already have developed a generic method called getData()
		String userName = Excel.getData("./data/mar26.slsx","inputValidLogin",1,0);
		String password = Excel.getData("./data/mar26.slsx","inputValidLogin",1,1);
		String tilte = Excel.getData("./data/mar26.slsx","inputValidLogin",1,2);
		ActiTimeLoginPage loginPage=new ActiTimeLoginPage(driver);
		//enter the valid userName
		loginPage.setUserName(userName);
		//enter the valid password
		loginPage.setPassword(password);
		//click on login
		loginPage.clickLogin();
		//verify homePage is displayed
		EnterTimeTrackPage homePage=new EnterTimeTrackPage(driver);
		boolean result = homePage.verifyHomePageIsDislayed(wait, driver, tilte);
		//assert
		Assert.assertEquals(result,true);
	}

}
