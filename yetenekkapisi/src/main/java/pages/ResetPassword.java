package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPassword extends GlobalVariable {
	private WebDriver driver;
	
	
	GlobalVariable gb=new GlobalVariable(driver);
	
	public ResetPassword(WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	public void setEmail(String email) {
		driver.findElement(StudentResetPasswordEmailField).sendKeys(email);
		
	}
	
	//clickbutton methods
	
	public LoginPage clickEmailLink(){
		driver.findElement(StudentResetPasswordEmailRadioButton).click();
		driver.findElement(StudentResetPasswordSendLinkButton).click();
		return new LoginPage(driver);
		
		
	}
	public LoginPage clickPhoneLink(){
		driver.findElement(StudentResetPasswordPhoneRadioButton).click();
		driver.findElement(StudentResetPasswordSendLinkButton).click();
		return new LoginPage(driver);
		
	}
	public String getNotificationTextResetPassword()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div"));
		String content = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML", element);
		return content;
		
	}
	
    

}
