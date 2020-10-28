package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDashboard {

	private WebDriver driver;
	private By accountButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[1]/div[2]/div/section/div[1]/div/div[1]/div/ul/div[1]/button");
	private By EditProfileButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[1]/div[2]/div/section/div[1]/div/div[1]/div/ul/div[1]/div/ul/div/a[1]");
	private By NameButton=By.xpath("/html/body/div/div[1]/div/div/main/div/div[1]/div[1]/div/div[2]/div[1]/button");
	
	
	
	public StudentDashboard(WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	//clickbutton methods
	
	public EditProfilePage clickEditProfileButton()
	{
		driver.findElement(accountButton).click();
		clickLink("Profil");
		
		return new EditProfilePage(driver) ;
		
	}
	
	private void clickLink(String LinkText)
	{
		driver.findElement(By.linkText(LinkText)).click();
	}
	
	
	
	
}
