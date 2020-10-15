package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword {
	private WebDriver driver;
	private By EmailField=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[1]/div[1]/div[2]/input");
	private By PhoneRadioButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[1]/div[2]/div[1]/label/span[1]");
	private By EmailRadioButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[1]/div[2]/div[3]/label/span[1]");
	private By SendLinkButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[2]/button");
	public ResetPassword(WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	public void setEmail(String email) {
		driver.findElement(EmailField).sendKeys(email);
		
	}
	
	//clickbutton methods
	
	public HomePage clickEmailLink()
	{
		driver.findElement(EmailRadioButton).click();
		driver.findElement(SendLinkButton).click();
		return new HomePage(driver);
		
		
	}
	public HomePage clickPhoneLink()
	{
		driver.findElement(PhoneRadioButton).click();
		driver.findElement(SendLinkButton).click();
		return new HomePage(driver);
		
	}
	
    

}
