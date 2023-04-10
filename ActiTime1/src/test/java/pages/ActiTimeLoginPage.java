package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginPage extends ActiTimeBaseTest {

	//dec,ini,utilization
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	//Initialization
	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	public boolean errMsgIsDisplayed(WebDriverWait wait)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
}
