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
	private By otherDepartmentField=By.name("otherDepartment");
	private By clarificationTextButton=By.xpath("//*[@id=\"modalButton\"]");
	
	private By sendButton=By.xpath("//button[@class='icon btn btn-primary btn-sm']");
	
	
	
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
	 
	 public void setDisabledStatus(int flag) throws InterruptedException 
	 {
		 
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[4]/div/div/div/div",flag);
	 }
	 
	 
	 public void setEmail(String mail) {
		 driver.findElement(emailField).sendKeys(mail);
	 }
	 
	 public void setPhone(String phone) {
		 driver.findElement(phoneField).sendKeys(phone);
	 }
	 
	 
	 public void setStatus(int flag) throws InterruptedException
	 {
		
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[8]/div/div/div/div",flag);
	 }
	 
	 
	 public void setEducationType(int flag) throws InterruptedException
	 {
		 
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[9]/div/div/div/div",flag);
	 }
	 
	 
	 public void setClassLevel(int flag) throws InterruptedException
	 
	 {
		 selectWebElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[10]/div/div/div/div", flag);
	 }
	 
	 
	 public void setCountry(int flag,int flag2) throws InterruptedException
	 {
		 if(flag2==0) {
		     selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[10]/div/div/div/div",flag);
		 }
		 
		 else
		 {
			 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[11]/div/div/div/div",flag);
		 }
		
         
	 }
	 
	 
	 public void setUniversity(int flag,int flag2) throws InterruptedException
	 {
		 if(flag2==0) {
			 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[11]/div/div/div/div",flag);
		 }
		 
		 else {
			 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[12]/div/div/div/div",flag);
		 }
		
	 }
	 
	 
	 public void setDepartmentFromList(int flag,int flag2) throws InterruptedException
	 {
		 if(flag2==0)
		 {
		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[12]/div/div/div/div",flag);
		 }
		 else
		 {
			 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[13]/div/div/div/div",flag);
		 }
		 
		 
	 }
	 
	 
	 public void setDepartment(String department,int flag2)
	 {
		 if(flag2==0)
		 {
		 driver.findElement(otherDepartmentField).sendKeys(department);
		 }
		 else
		 {
			 driver.findElement(otherDepartmentField).sendKeys(department);
		 }
	 }
	 
	 
	 
	 
	  //click buttons methods
	 
	 public void clickClarifacitonButton(int flag2) throws InterruptedException
	    {
		 if(flag2==0)//mezun
		 {
		JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[13]/span/button");
		JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
		 }
		 else
		 {
			    JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/span/button");
				JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
		 }
	 
	    	
	    }
	 public void clickConsenText(int flag2,String onay) throws InterruptedException
	 {
		
		  if(flag2==0) // mezun
		  {
			     JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/span/button");
				 JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
			  if(onay=="yes")
			  {
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[14]/div/div/div/label[1]/span[1]")).click();
			  }
			  else
			  {
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[14]/div/div/div/label[2]/span[1]")).click();
			  }
		  }
		  else// ogrenci
		  {
			     JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[15]/span/button");
				 JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
			  if(onay=="yes")
			  {
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[15]/div/div/div/label[1]/span[1]")).click();
			  }
			  else
			  {
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[15]/div/div/div/label[2]/span[1]")).click();
			  }
			  
		  }

	 }                    
	
	 
	 public LoginPage clickSendButton()
	 {
		 driver.findElement(sendButton).click();
		return new LoginPage(driver);
		 
	 }
	 
	 
	 // private methods
	 
	 private void selectWebElement( String Path,int flag) throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 WebElement selectMyElement = driver.findElement(By.xpath(Path));
		 selectMyElement.click();
		 Actions keyDown = new Actions(driver); 
		 for(int i=0;i<flag;i++)
		 {
			 keyDown.sendKeys(Keys.chord( Keys.DOWN )).perform();
		 }
		 keyDown.sendKeys(Keys.chord( Keys.ENTER )).perform();
		 System.out.println(flag);
		 
		 
		 
			 
		 }
		 
	 private void JavaScriptElement(String path) throws InterruptedException
	 {
		 WebElement ele = driver.findElement(By.xpath(path));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", ele);
		 Thread.sleep(2000);
	 }

}
