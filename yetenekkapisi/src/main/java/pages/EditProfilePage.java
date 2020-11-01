package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.primitives.Chars;

public class EditProfilePage {
	
	
	private WebDriver driver;
	private By nameField=By.xpath("//input[@name='name']");
	private By surnameField=By.xpath("//input[@name='surname']");
	private By tcknField=By.xpath("//input[@name='tckn']");
	private By addressField=By.xpath("//textarea[@name='street']");
	private By deleteBirtDateButton=By.xpath("//button[@class='react-datepicker__close-icon']");
	private By phoneNumberField=By.xpath("//input[@name='phone']");
	private By BirthDateField=By.xpath("//input[@class='birthDate']");
	private By  gpaField=By.xpath("//input[@name='gpa']") ;
	private By saveButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[25]/button[1]");
	private int GenderFlag; // 1 for Female, 0 for Male
	
	
	 public EditProfilePage(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	 
	
	 public void SetName(String name) {
		 
			cleartextbox(nameField);
			driver.findElement(nameField).sendKeys(name);
		}
	 
	    public void SetSurname(String Surname){
	    	
	    	cleartextbox(surnameField);
	    	driver.findElement(surnameField).sendKeys(Surname);
	    	
	    }
	    
	    public void setTckn(String tcno){
	    	
	    	
	    	cleartextbox(tcknField);
	    	driver.findElement(tcknField).sendKeys(tcno);
	    }
	    
	    public void setGender(int downCount,String gender) throws InterruptedException   {
	    	
	    	
	    	if(gender=="male"){

	    	   GenderFlag=0; 
	    	}
	    	else if(gender=="female") {

	    		GenderFlag=1;
	    		
	    	}
	    	selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[5]/div/div/div/div",downCount);
	    	
	    	
	    }
	    
	    public void setMilitaryServiceStatus(int downCount) throws InterruptedException {
	    	
	    	
	    	selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[6]/div/div/div/div",downCount);
	    }
	    
	    
	   
	    
	    public void setBirthDate() throws InterruptedException {
	    	
	    	Calender(BirthDateField);
	    	
	    	//driver.findElement(deleteBirtDateButton).click();
	    	
	    	//if (GenderFlag==0) // if male 
	    	//{
	    		
	    	// AttributesValue(BirthDateField,BirthDate);
	    	// System.out.println("erkek "+GenderFlag);
	    	//}
	    	//else  // if female
	    	//{
	    		
	    	//AttributesValue(BirthDateField,BirthDate);
	    	//System.out.println("kadýn "+ GenderFlag);
	    	//}
	    	
	    	
	    	
	    }
	    
	    public void setPhoneNumber(String PhoneNumber) {
	    	
	          cleartextbox(phoneNumberField);
	    	  AttributesValue(phoneNumberField,PhoneNumber);

	    	
	    }
	    
	     public void setnationality(int downCount) throws InterruptedException{
	    	 if(GenderFlag==0) // if male
	    	 {
	    	  
	    	 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/div/div/div",downCount);
	    	 
	    	 }
	    	 else // if female
	    	 {
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[8]/div/div/div/div",downCount);
	    	 }
	     }
	     
	     
	    public void setAddress(String address) {
	    	cleartextbox(addressField);
	    	driver.findElement(addressField).sendKeys(address);
	    }
	    
	    
	    
	     public void setCountry(int downCount) throws InterruptedException {
	    	 
	    	 if(GenderFlag==0) { // if male
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[10]/div/ul/li[2]/div/div/div/div",downCount);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/ul/li[2]/div/div/div/div",downCount);
	    	 }
	    		 
	    		 
	    	 
	     }
	     
	     public void setCity(int downCount) throws InterruptedException{
	    	 
	    	 if(GenderFlag==0) { // if male
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[10]/div/ul/li[3]/div/div/div/div",downCount);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/ul/li[3]/div/div/div/div",downCount);
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
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[19]/div/div/div/div",downCount);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[18]/div/div/div/div",downCount);
	    	 }
	    	
	     }
	     
	     public void setCareerStatus(int downCount) throws InterruptedException
	     {
	    	 if(GenderFlag==0) { // if male
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[20]/div/div/div/div",downCount);
	    	 }
	    	 else { // if female
	    		 
	    		 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[19]/div/div/div/div",downCount);
	    	 }
	    	 
	     }
	     
	     public void setGpa(String gpa) throws InterruptedException {
	    	 cleartextbox(gpaField);
	    	driver.findElement(gpaField).sendKeys(gpa);
	    	 
	    	 
	     }
	     
	     public StudentDashboard clickSendButton()
	     {
	    	driver.findElement(saveButton).click();
			return new StudentDashboard(driver);
	    	 
	     }
	     
	     
	     
	     
	     
	     
	     
	     //private methods
	     
	    // before sendkeys textbox  clean
	     
	    private void cleartextbox(By path) {
	    	
	    	driver.findElement(path).sendKeys(Keys.CONTROL, Keys.chord("a"),(Keys.BACK_SPACE)); //select all text in textbox and delete it
	    }
	    
	    
	    
	    
	    private void selectWebElement( String Path,int downCount) throws InterruptedException  {
			 Thread.sleep(2000);
			 if(downCount==-1)
			 {
				 return;
			 }
			 else {
				 WebElement selectMyElement = driver.findElement(By.xpath(Path));
				 selectMyElement.click();
				 Actions keyDown = new Actions(driver); 
				 for(int i=0;i<downCount;i++)
				 {
					 Thread.sleep(1000);
					 keyDown.sendKeys(Keys.chord( Keys.DOWN )).perform();
					 Thread.sleep(2000);
					 System.out.println("for girdi");
				 }
				 
				 keyDown.sendKeys(Keys.chord(Keys.ENTER )).perform();
				 System.out.println(downCount);
				 
				 
				 }
			 }
	    
	    
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
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[7]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[7]")).click();
	    }
	   
			 
 }



