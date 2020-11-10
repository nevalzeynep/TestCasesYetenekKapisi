package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDashboard extends GlobalVariable{

	private WebDriver driver;
	
	GlobalVariable gb=new GlobalVariable(driver);
	
	
	
	public StudentDashboard(WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	//clickbutton methods
	
	public EditProfilePage clickEditProfileButton()
	{
		driver.findElement(StudentDashboardaccountButton).click();
		clickLinkText("Özel Profil");
		
		return new EditProfilePage(driver) ;
		
	}
	
	private void clickLinkText(String LinkText)
	{
		driver.findElement(By.linkText(LinkText)).click();
	}
	
	
	
	
}
