package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterTimeTrackPage {
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//verify home page is displayed or not
	public boolean verifyHomePageIsDislayed(WebDriverWait wait,WebDriver driver,String title)
	{
		try 
		{
			wait.until(ExpectedConditions.titleContains(title));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
