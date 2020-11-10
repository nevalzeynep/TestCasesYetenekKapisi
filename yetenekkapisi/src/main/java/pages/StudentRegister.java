package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StudentRegister extends GlobalVariable {
	
	private WebDriver driver;
	private String genderFlag;
	
	
	public StudentRegister(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	
	GlobalVariable gb=new GlobalVariable();
	
	 //  test cases set 
	 public void setName (String name){
		 
		 driver.findElement(gb.StudentRegisternameField).sendKeys(name);
	 }
	 
	 public void setSurname(String surname){
		 
		 driver.findElement(gb.StudentRegistersurnameField).sendKeys(surname);
	 }
	 
	 public void setDisabledStatus(int countDown) throws InterruptedException 
	 {
		 
		 gb.selectWebElement(gb.StudentRegisterDisabledStatus,countDown,driver);
	 }
	 
	 
	 public void setEmail(String mail) {
		 driver.findElement(StudentRegisteremailField).sendKeys(mail);
	 }
	 
	 public void setPhone(String phone) {
		 driver.findElement(StudentRegisterphoneField).sendKeys(phone);
	 }
	 
	 
	 public void setEducationStatus(int countDown,String educationStatus) throws InterruptedException {
		 
		
		 gb.selectWebElement(gb.StudentRegisterEducationStatus,countDown,driver);
		 
		 if(educationStatus=="mezun")
			 genderFlag="mezun";
		 else
			 genderFlag="std";
	 }
	 
	 
	 public void setEducationType(int countDown) throws InterruptedException{
		 
		 gb.selectWebElement(gb.StudentRegisterEducationType,countDown,driver);
	 }
	 
	 
	 public void setClassLevel(int countDown) throws InterruptedException {
		 
		 gb.selectWebElement(gb.StudentRegisterClassLevel, countDown,driver);
		 
	 }
	 
	 
	 public void setCountry(int countDown) throws InterruptedException {
		 
		 if(genderFlag=="mezun") {
			 
			 gb.selectWebElement(gb.StudentRegisterCountryGraduated,countDown,driver);
		     
		 }
		 
		 else {
			 
			 gb.selectWebElement(gb.StudentRegisterCountryStudent,countDown,driver);
		 }
		
         
	 }
	 
	 
	 public void setUniversity(int countDown) throws InterruptedException {
		 
		 if(genderFlag=="mezun") {
			 
			 gb. selectWebElement(gb.StudentRegisterUniversityGraduated,countDown,driver);
		 }
		 
		 else {
			 
			 gb.selectWebElement(gb.StudentRegisterUniversityStudent,countDown,driver);
		 }
		
	 }
	 
	 
	 public void setDepartmentFromList(int countDown) throws InterruptedException
	 {
		 if(genderFlag=="mezun") {
			 
			 gb.selectWebElement(gb.StudentRegisterDepartmentGraduated,countDown,driver);
		 }
		 
		 else {
			 
			 gb.selectWebElement(gb.StudentRegisterDepartmentStudent,countDown,driver);
		 }
		 
		 
	 }
	 
	 
	 public void setDepartment(String department) {
		 
		 if(genderFlag=="mezun") {
			 
		    driver.findElement(StudentRegisterotherDepartmentField).sendKeys(department);
		 }
		 
		 else {
			 
			 
			 driver.findElement(StudentRegisterotherDepartmentField).sendKeys(department);
		 }
	 }
	 
	 
	 
	 
	  //click buttons methods
	 
	 public void clickClarifacitonButton() throws InterruptedException
	    {
		  if(genderFlag=="mezun") { //mezun
			  
			  gb.JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[13]/span/button");
			  gb.JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
		  }
		 else  {
			 
			 gb.JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/span/button");
			 gb.JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
		  }
	 
	    	
	    }
	 
	 
	 
	 
	 public void clickConsenText(String onay) throws InterruptedException
	 {
		
		  if(genderFlag=="mezun") 	  { // mezun
			  
			  gb.JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[14]/span/button");
			  gb.JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
			  if(onay=="yes") {
				  
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[14]/div/div/div/label[1]/span[1]")).click();
			  }
			  else {
				  
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[14]/div/div/div/label[2]/span[1]")).click();
			  }
		  }
		  else  { // ogrenci
			  
			  gb.JavaScriptElement("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[15]/span/button");
			  gb.JavaScriptElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/button");
			  if(onay=="yes")  {
				  
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[15]/div/div/div/label[1]/span[1]")).click();
			  }
			  else  {
				  
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[15]/div/div/div/label[2]/span[1]")).click();
			  }
			  
		  }

	 }                    
	
	 
	 public LoginPage clickSendButton(){
		 driver.findElement(StudentRegistersendButton).click();
		return new LoginPage(driver);
		 
	 }
	 
	 
	 
	 
	
		 
	 

}
