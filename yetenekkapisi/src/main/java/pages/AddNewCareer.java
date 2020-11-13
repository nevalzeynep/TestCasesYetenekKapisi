package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewCareer extends GlobalVariable {
	
private WebDriver driver;
	
   GlobalVariable gb=new GlobalVariable();
   private String Flag; // 0 for Contunie, 1 for Quit

	
	public AddNewCareer (WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	public void setEmployer(String employerName){	
		driver.findElement(gb.StudentNewCareerEmployerField).sendKeys(employerName);
	}
	
	
	public void setPosition(String positionName) {
		driver.findElement(gb.StudentNewCareerPositionField).sendKeys(positionName);
	}

	public void setStartDate(){
		Calender(gb.StudentNewCareerStarDate);
		if(Flag=="QUIT")
		{
			//set end date
		}
	}
	
	
	public void setCareerStatus(int downCount) throws InterruptedException {
		
		gb.selectWebElement(gb.StudentNewCareerCareerStatus,downCount,driver);
		String typeValue=gb.FindValue(gb.StudentNewCareerCareerStatusValue,driver);
		if (typeValue=="QUIT")
			Flag="QUIT";
		else if(typeValue=="CONTINUE")
			Flag="CONTINUE";
					
	}
	
	public void setEndDate(){
		
	}
	
	public void setDescription(String Description){
			driver.findElement(gb.StudentNewCareerDescription).sendKeys(Description);
				
	}
	

	
	//click methods
	
	public Experiences submitButtonClick(){
		driver.findElement(StudentNewCareerSubmitButton).click();
		return new Experiences(driver);
		
		
	}
	
	
	//private methods
	private void Calender(By path) {
    	driver.findElement(path).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div[2]/div/div/div/form/div[3]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[3]/div[3]")).click();
    }
}
