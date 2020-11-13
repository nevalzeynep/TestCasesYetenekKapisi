package pages;

import org.openqa.selenium.WebDriver;

public class EditCareer {
	private WebDriver driver;
	private String Flag;
	
	
	GlobalVariable gb=new GlobalVariable(driver);
	
	 public EditCareer(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }

	 
	 public void EditEmployer(String NewEmployer) throws InterruptedException
	 {
		 gb.cleartextbox(gb.StudentEditCareerEmployerField, driver);
		 driver.findElement(gb.StudentEditCareerEmployerField).sendKeys(NewEmployer);
	 }
	 
	 public void EditPosition(String NewPosition) throws InterruptedException
	 {
		 gb.cleartextbox(gb.StudentNewCareerPositionField, driver);
		 driver.findElement(gb.StudentNewCareerPositionField).sendKeys(NewPosition);
	 }
	 
	 public void EditStartDate () {
		 
	 }
	 
	 public void EditCareerStatus(int downCount) throws InterruptedException {
		 
		 gb.selectWebElement(gb.StudentNewCareerCareerStatus,downCount,driver);
			String typeValue=gb.FindValue(gb.StudentNewCareerCareerStatusValue,driver);
			if (typeValue=="QUIT")
				Flag="QUIT";
			else if(typeValue=="CONTINUE")
				Flag="CONTINUE";
						
		}
	 
	 public void EditCareerDescription(String Description) throws InterruptedException {
		 gb.cleartextbox(gb.StudentNewCareerDescription, driver);
		 driver.findElement(gb.StudentNewCareerDescription).sendKeys(Description);
	 }
	
	 
	 public void clickBackButton()
	 {
		 driver.findElement(gb.StudenteditCareerBackButton).click();
	 }
	 public Experiences clickSubmitButton()
	 {
		 driver.findElement(gb.StudentEditCareerSubmitButton).click();
		return new Experiences(driver);
		 
	 }
	}

