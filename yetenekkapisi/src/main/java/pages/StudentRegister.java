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
	private By departmentField=By.name("otherDepartment");
    
	public StudentRegister(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	    
	
	 //  test cases set 
	 public void setName (String name)
	 {
		 driver.findElement(nameField).sendKeys(name);
	 }
	 
	 public void setSurname(String surname)
	 {
		 driver.findElement(surnameField).sendKeys(surname);
	 }
	 
	 public void setDisabledStatus() 
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[4]/div/div/div/div/div[1]/div[1]"));
		 selectMyElement.click();
		 selectWebElement();
	 }
	 


	 
	 public void setEmail(String mail) {
		 driver.findElement(emailField).sendKeys(mail);
	 }
	 
	 public void setPhone(String phone) {
		 driver.findElement(phoneField).sendKeys(phone);
	 }
	 public void setStatus()
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[8]/div/div/div/div"));
		 selectMyElement.click();
		 selectWebElement();
	 }
	 public void setEducationType()
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[9]/div/div/div/div"));
		 selectMyElement.click();
		 selectWebElement();
	 }
	 
	 public void setCountry()
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[10]/div/div/div/div"));
		 selectMyElement.click();
		 Actions keyDown = new Actions(driver); 
		 keyDown.sendKeys(Keys.chord( Keys.ENTER)).perform();
		 //selectWebElement();
	 }
	 public void setUniversity()
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[11]/div/div/div/div"));
		 selectMyElement.click();
		 selectWebElement();
		
	 }
	 
	 
	//click buttons methods
	 
	 
	 
	 // private methods
	 
	 private void selectWebElement( ) 
	 {
		 
		 Actions keyDown = new Actions(driver); 
		 keyDown.sendKeys(Keys.chord( Keys.ENTER,Keys.ENTER)).perform();
		
	 }
	 

}
