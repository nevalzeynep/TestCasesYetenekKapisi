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
	private int GenderFlag; // 1 for Female, 0 for Male
	//will continue
	 public EditProfilePage(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	 
	
	 public void SetName(String name) {
		 
			cleartextbox("//input[@name='name']");
			driver.findElement(nameField).sendKeys(name);
		}
	 
	    public void SetSurname(String Surname){
	    	
	    	cleartextbox("//input[@name='surname']");
	    	driver.findElement(surnameField).sendKeys(Surname);
	    	
	    }
	    
	    public void setTckn(String tcno){
	    	
	    	
	    	cleartextbox("//input[@name='tckn']");
	    	driver.findElement(tcknField).sendKeys(tcno);
	    }
	    
	    public void setGender(int downCount,String gender) throws InterruptedException   {
	    	
	    	if(gender=="male"){
                
	    	   selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[5]/div/div/div/div",downCount);
	    	   GenderFlag=0; 
	    	}
	    	else if(gender=="female") {
	    		 
	    		selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[5]/div/div/div/div",downCount);
	    		GenderFlag=1;
	    		
	    	}
	    	
	    	
	    }
	    
	    public void setMilitaryServiceStatus(int downCount) throws InterruptedException {
	    	
	    	
	    	selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[6]/div/div/div/div",downCount);
	    }
	    
	    
	   
	    
	    public void setBirthDate(String BirthDate) throws InterruptedException {
	    	
	    	driver.findElement(deleteBirtDateButton).click();
	    	
	    	if (GenderFlag==0) // if male 
	    		{
	    		
	    		 AttributesValue("//input[@class='birthDate']",BirthDate);
	    		 System.out.println("erkek "+GenderFlag);
	    	}
	    	else  // if female
	    	{
	    		
	    		AttributesValue("//input[@class='birthDate']",BirthDate);
	    		System.out.println("kadýn "+ GenderFlag);
	    	}
	    }
	    
	    public void setPhoneNumber(String PhoneNumber) {
	    	if (GenderFlag==0) // if male 
    		{
	    	  cleartextbox("//input[@name='phone']");
	    	  AttributesValue("//input[@name='phone']",PhoneNumber);
    		}
	    	else // if female
  		
	    	{
	    		 cleartextbox("//input[@name='phone']");
		    	  AttributesValue("//input[@name='phone']",PhoneNumber);
	    	}
	    }
	    
	     public void setnationality(int downCount) throws InterruptedException{
	    	  
	    	 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[8]/div/div/div/div",downCount);
	     }
	     
	     
	    public void setAddress(String address) {
	    	
	    	driver.findElement(addressField).sendKeys(address);
	    }
	    
	    
	    
	     public void setCountry(int downCount) throws InterruptedException {
	    	 
	    	 selectWebElement("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/ul/li[2]/div/div/div/div",downCount);
	     }
	     
	     
	     

	     
	     
	    // before sendkeys textbox  clean
	     
	    private void cleartextbox(String path) {
	    	
	    	driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL, Keys.chord("a"),(Keys.BACK_SPACE)); //select all text in textbox and delete it
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
					 Thread.sleep(3000);
					 keyDown.sendKeys(Keys.chord( Keys.DOWN )).perform();
					 Thread.sleep(2000);
					 System.out.println("for girdi");
				 }
				 Thread.sleep(2000);
				 keyDown.sendKeys(Keys.chord(Keys.ENTER )).perform();
				 System.out.println(downCount);
				 
				 
				 }
			 }
	    
	    private void AttributesValue(String path,String Value)  {
	    	
	    	 WebElement element = driver.findElement(By.xpath(path)); 
	    	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	 jse.executeScript("arguments[0].value="+Value+";", element);
    		
	    }
	    
	    
	   
	   
	   
			 
 }



