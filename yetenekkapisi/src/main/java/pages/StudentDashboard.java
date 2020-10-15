package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDashboard {

	private WebDriver driver;
	private By profileButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[1]/div[2]/div/section/div[1]/div/div[1]/div/ul/div[1]/button");
	private By EditProfileButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[1]/div[2]/div/section/div[1]/div/div[1]/div/ul/div[1]/div/ul/div/a[1]");
	
	public StudentDashboard(WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	//clickbutton methods
	
	public EditProfile clickEditProfileButton()
	{
		driver.findElement(profileButton).click();
		driver.findElement(EditProfileButton).click();
		return new EditProfile(driver) ;
		
	}
	
	
	
}
