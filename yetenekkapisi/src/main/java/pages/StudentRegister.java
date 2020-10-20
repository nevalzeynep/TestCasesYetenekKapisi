package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StudentRegister {
	private WebDriver driver;
	private By nameField= (By.name("name"));
	private By surnameField= (By.name("surname"));
	private By emailField=By.name("email");
	private By phoneField=By.name("phone");
	
	
	
	
	 public StudentRegister(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	    //click buttons methods
	 
	 
	 public void setName (String name)
	 {
		 driver.findElement(nameField).sendKeys(name);
	 }
	 public void setSurname(String surname)
	 {
		 driver.findElement(surnameField).sendKeys(surname);
	 }
	 public void setDisabledStatus() throws InterruptedException 
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[4]/div/div/div/div/div[1]/div[1]"));
		 selectMyElement.click();
		 selectWebElement("");
	 }
	 
	 
	 public void setEmail(String mail) {
		 driver.findElement(emailField).sendKeys(mail);
	 }
	 
	 public void setPhone(String phone) {
		 driver.findElement(phoneField).sendKeys(phone);
	 }
	 
	 
	 
	 
	 private void selectWebElement(String path ) throws InterruptedException
	 {
		 
		 Actions keyDown = new Actions(driver); 
		 keyDown.sendKeys(Keys.chord( Keys.ENTER,Keys.ENTER)).perform();
		
	 }
	 

}
