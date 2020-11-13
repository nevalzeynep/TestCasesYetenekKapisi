package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class EditProfilePage extends GlobalVariable {
	private WebDriver driver;
	private int GenderFlag; // 1 for Female, 0 for Male
	
	GlobalVariable gb=new GlobalVariable(driver);
	
	 public EditProfilePage(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	 
	 
	 public void SetName(String name) throws InterruptedException {
		 
		   
			gb.cleartextbox(gb.StudentEditProfilenameField,driver);
			driver.findElement(gb.StudentEditProfilenameField).sendKeys(name);
		}
	 
	    public void SetSurname(String Surname) throws InterruptedException{
	    	
	    	gb.cleartextbox(gb.StudentEditProfilesurnameField,driver);
	    	driver.findElement(gb.StudentEditProfilesurnameField).sendKeys(Surname);
	    	
	    }
	    
	    public void setTckn(String tcno) throws InterruptedException{
	    	
	    	
	    	gb.cleartextbox(gb.StudentEditProfiletcknField,driver);
	    	driver.findElement(gb.StudentEditProfiletcknField).sendKeys(tcno);
	    }
	    
	    public void setGender(int downCount,String gender) throws InterruptedException   {
	    	
	    	
	    	
	    	if(gender=="male"){  

	    	   GenderFlag=0;  //path continue to male
	    	}
	    	
	    	
	    	else if(gender=="female") {

	    		GenderFlag=1; //path continue to female
	    		
	    	}
	    	
	    	selectWebElement(gb.StudentEditProfileGender,downCount,driver);
	    	
	    	
	    }
	    
	    public void setMilitaryServiceStatus(int downCount) throws InterruptedException {
	    	
	    	
	    	selectWebElement(gb.StudentEditProfileMilitary,downCount,driver);
	    	
	    }
	    
	    
	   
	    
	    public void setBirthDate() throws InterruptedException {
	    	
	    	Calender(gb.StudentEditProfileBirthDateField);
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    public void setPhoneNumber(String PhoneNumber) throws InterruptedException {
	    	
	          gb.cleartextbox(gb.StudentEditProfilephoneNumberField,driver);
	    	  AttributesValue(gb.StudentEditProfilephoneNumberField,PhoneNumber);

	    	
	    }
	    
	     public void setnationality(int downCount) throws InterruptedException{
	    	 if(GenderFlag==0) // if male
	    	 {
	    	  
	    	 selectWebElement(gb.StudentEditProfileNationalityMale,downCount,driver);
	    	 
	    	 }
	    	 else // if female
	    	 {
	    		 selectWebElement(gb.StudentEditProfileNationalityFemale,downCount,driver);
	    	 }
	     }
	     
	     
	    public void setAddress(String address) throws InterruptedException {
	    	
	    	gb.cleartextbox(gb.StudentEditProfileaddressField,driver);
	    	driver.findElement(gb.StudentEditProfileaddressField).sendKeys(address);
	    }
	    
	    
	    
	     public void setCountry(int downCount) throws InterruptedException {
	    	 
	    	 if(GenderFlag==0) { // if male
	    		 selectWebElement(gb.StudentEditProfileCountryMale,downCount,driver);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement(gb.StudentEditProfilCountryFemale,downCount,driver);
	    	 }
	    		 
	    		 
	    	 
	     }
	     
	     public void setCity(int downCount) throws InterruptedException{
	    	 
	    	 if(GenderFlag==0) { // if male
	    		 selectWebElement(gb.StudentEditProfileCityMale,downCount,driver);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement(gb.StudentEditProfileCityFemale,downCount,driver);
	    	 }
	     }
	     
	     public void setRadioButtons() throws InterruptedException  {
	    	 
	    	 if(GenderFlag==0) { // if male
	    		 RadioButtonSelect("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[11]/div/label[2]/span[1]");
	    		 RadioButtonSelect("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[12]/div/label[1]/span[1]");
	    		 RadioButtonSelect("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[13]/div/label[2]/span[1]");
	    		 
	    	 }
	    	 else { // if female
	    		 RadioButtonSelect("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[10]/div/label[2]/span[1]");
	    		 RadioButtonSelect("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[11]/div/label[1]/span[1]");
	    		 RadioButtonSelect("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[12]/div/label[2]/span[1]");
	    		 
	    		 
	    	 }
	    	 
	     }
	     
	 
	     
	     
	     public void setClassLevel(int downCount) throws InterruptedException{
	    	 
	    	 if(GenderFlag==0) { // if male
	    		 selectWebElement(gb.StudentEditProfileClassMale,downCount,driver);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement(gb.StudentEditProfileClassFeMale,downCount,driver);
	    	 }
	    	
	     }
	     
	     public void setCareerStatus(int downCount) throws InterruptedException
	     {
	    	 if(GenderFlag==0) { // if male
	    		 
	    		 selectWebElement(gb.StudentEditProfileCareerMale,downCount,driver);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement(gb.StudentEditProfileCareerFeMale,downCount,driver);
	    	 }
	    	 
	     }
	     
	     public void setGpa(String gpa) throws InterruptedException {
	    	 gb.cleartextbox(gb.StudentEditProfilegpaField,driver);
	    	driver.findElement(gb.StudentEditProfilegpaField).sendKeys(gpa);
	    	 
	    	 
	     }
	      public void setPhoto()
	      {
	    	  
	      }
	     
	     
	     
	     
	     
	     // click methods
	     
	     
	     public StudentDashboard clickSendButton()
	     {
	    	driver.findElement(gb.StudentEditProfilesaveButton).click();
			return new StudentDashboard(driver);
	    	 
	     }
     
	     
	     
	     //private methods
	     

	    private void AttributesValue(By path,String Value)  {
	    	
	    	 WebElement element = driver.findElement(path); 
	    	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	 jse.executeScript("arguments[0].value="+Value+";", element);
    		
	    }
	    
	    
	   
	    private void RadioButtonSelect(String path) throws InterruptedException
	    {
			 WebElement ele = driver.findElement(By.xpath(path));
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", ele);
			 Thread.sleep(2000);
		 }
	    
	    
	    // takvim icin value atamasý yapamýyorum o yuzden direk olarak istedigim tarihe týklamam gerekyior
	    private void Calender(By path)
	    {
	    	driver.findElement(path).click();
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[7]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[3]/div[4]")).click();
	    }
	   
			 
 }



