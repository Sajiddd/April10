package scripts2;
import org.testng.annotations.Test;

import generic.Excel;
import pages.ActiTimeBaseTest;
import pages.ActiTimeLoginPage;

public class TestInvalidLogin extends ActiTimeBaseTest {

	@Test(priority = 2)
	public void testInvalidLogin()
	{
		String userName = Excel.getData("./data/mar26.xlsx","inputInvalidLogin",1,0);
		String password = Excel.getData("./data/mar26.xlsx","inputInvalidLogin",1,1);
		//create the object of Pom class
		ActiTimeLoginPage loginPage=new ActiTimeLoginPage(driver);
		//enter wrong userName
		loginPage.setUserName(userName);
		//enter wrong password
		loginPage.setPassword(password);
		//click on login button
		loginPage.clickLogin();
		
		//verify errorMsg is Displayed.
		loginPage.errMsgIsDisplayed(wait);
	}
}
