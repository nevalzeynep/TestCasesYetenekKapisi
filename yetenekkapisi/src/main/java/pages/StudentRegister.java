package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	private By clarificationTextButton=By.xpath("//*[@id=\"modalButton\"]");
	private By radio1=By.xpath("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/div/div/div/label[1]/span[1]");
	private By radio2=By.xpath("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/div/div/div/label[2]/span[1]");
	private By sendButton=By.xpath("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[15]/button[1]");
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
	 
	 public void setDisabledStatus() throws InterruptedException 
	 {
		 
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[4]/div/div/div/div");
	 }
	 
	 
	 public void setEmail(String mail) {
		 driver.findElement(emailField).sendKeys(mail);
	 }
	 
	 public void setPhone(String phone) {
		 driver.findElement(phoneField).sendKeys(phone);
	 }
	 public void setStatus() throws InterruptedException
	 {
		
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[8]/div/div/div/div");
	 }
	 public void setEducationType() throws InterruptedException
	 {
		 
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[9]/div/div/div/div");
	 }
	 public void setClassLevel()
	 
	 {
		 
	 }
	 public void setCountry()
	 {
		 WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[10]/div/div/div/div"));
		 selectMyElement.click();
		 Actions keyDown = new Actions(driver); 
		 keyDown.sendKeys(Keys.chord( Keys.ENTER)).perform();
         
	 }
	 public void setUniversity() throws InterruptedException
	 {
		 
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[11]/div/div/div/div");
		
	 }
	 public void setDepartment() throws InterruptedException
	 {
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[12]/div/div/div/div");
	 }
	 
	 
	  //click buttons methods
	 
	 public void clickClarifacitonButton() throws InterruptedException
	    {
		 
		JavaScriptElement("//*[@id=\"modalButton\"]");
		JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
	    driver.findElement(radio1).click();
	    driver.findElement(radio2).click();
	    	
	    }
	 public void clickConsenText() throws InterruptedException
	 {
		 JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/span/button");
		 JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
	 }
	 
	 
	 public void clickSendButton()
	 {
		 driver.findElement(sendButton).click();
	 }
	 
	 
	 // private methods
	 
	 private void selectWebElement( String Path) throws InterruptedException 
	 {
		 Thread.sleep(1000);
		 WebElement selectMyElement = driver.findElement(By.xpath(Path));
		 selectMyElement.click();
		 Actions keyDown = new Actions(driver); 
		 keyDown.sendKeys(Keys.chord(  Keys.DOWN,Keys.DOWN,Keys.ENTER)).perform();
		
		
		
	 }
	 private void JavaScriptElement(String path) throws InterruptedException
	 {
		 WebElement ele = driver.findElement(By.xpath(path));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", ele);
		 Thread.sleep(2000);
	 }

}
