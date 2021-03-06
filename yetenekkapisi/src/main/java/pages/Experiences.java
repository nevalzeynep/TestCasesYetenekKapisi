package pages;

import org.openqa.selenium.WebDriver;

public class Experiences extends GlobalVariable {
private WebDriver driver;
	
	GlobalVariable gb=new GlobalVariable(driver);
	
	public Experiences (WebDriver driver) {
    	this.driver=driver;
    	
    }
	
	public AddNewCareer clickAddNewButton()
	
	{
		clickLinkText("Yeni Ekle",driver);	
		return new AddNewCareer(driver);
		
	}
	
	public EditCareer clickEditButton(){
		driver.findElement(gb.StudentExperiencesEditButton).click();
		return new EditCareer(driver);
		
	}
	
	public void clickDeleteCareer(){
		driver.findElement(gb.StudentExperiencesDeleteButton).click();
		driver.findElement(gb.StudentExpreiencesCancelDelete).click();
		driver.findElement(gb.StudentExperiencesDeleteButton).click();
		driver.findElement(gb.StudentExperiencesConfirmDelete).click();
		
		
	}
	
	public void clickYetkinlikler(){
		clickLinkText("Yetkinlikler",driver);	
	}
	
	public void clickNewSkillButton(){
		clickLinkText("Yeni Ekle",driver);	
		
	}
	public void setSkillName(String SkillName) {
		driver.findElement(gb.StudentSkillNewSkillName).sendKeys(SkillName);
		
	}
	public void setstudentSkillLevel(int countDown) throws InterruptedException{
		gb.selectWebElement(gb.StudentSkillNewSkillLevel, countDown, driver);
	}
	public void setDescription(String Description) {
		driver.findElement(gb.StudentSkillNewDescription).sendKeys(Description);
	}

}
