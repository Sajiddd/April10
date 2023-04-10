package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeBaseTest implements ActiTimeIConst {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,ETO);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}
