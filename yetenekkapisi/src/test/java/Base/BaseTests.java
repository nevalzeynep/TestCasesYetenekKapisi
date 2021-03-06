package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;

public class BaseTests {
	
	private WebDriver driver;
	protected LoginPage LoginPage;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://demo.yetenekkapisi.org/login");
	    
	    
	    //once the app is launch homepage will be open every time
	    
	    LoginPage=new LoginPage(driver);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	   
	    
	
	}
	@AfterClass
	
   public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	

}
