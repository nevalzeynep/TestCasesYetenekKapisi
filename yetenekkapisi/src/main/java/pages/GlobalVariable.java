package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GlobalVariable {
	
	private WebDriver driver;
	
	
	 public GlobalVariable() {
	    	
	    	
	    }
	 public GlobalVariable(WebDriver driver) {
	    	this.driver=driver;
	    	
	    }
	 
	 //STUDENT LOGIN 	
	 protected By StudentLoginusernameField= (By.name("username"));
	 protected By StudentLoginpasswordField=(By.name("password"));
	 protected By StudentLoginshowPassword=(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[2]/div[1]/button"));
	 protected By StudentLoginLoginButton =(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[3]/button[1]"));
	 protected By StudentLoginRegisterButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[3]/button[2]");
	 protected By StudentLoginForgotPasswordButon=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[2]/div[2]/a");
	 
	 
	 
	 
	 
	 
	//STUDENT REGISTER 
	protected By StudentRegisternameField= (By.name("name"));
	protected By StudentRegistersurnameField= (By.name("surname"));
	protected By StudentRegisteremailField=By.name("email");
	protected By StudentRegisterphoneField=By.name("phone");
	protected By StudentRegisterdepartmentField=By.name("otherDepartment");
	protected By StudentRegisterotherDepartmentField=By.name("otherDepartment");
	protected By StudentRegisterclarificationTextButton=By.xpath("//*[@id=\"modalButton\"]");
	protected By StudentRegistersendButton=By.xpath("//button[@class='icon btn btn-primary btn-sm']");	
	   // dropdown-list elements for student register
	protected By StudentRegisterDisabledStatus=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[4]/div/div/div/div");
	protected By StudentRegisterEducationStatus=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[8]/div/div/div/div");
	protected By StudentRegisterEducationType=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[9]/div/div/div/div");
	protected By StudentRegisterClassLevel=By.xpath("/html/body/div/div[1]/div/div/main/div/div/div/div/form/div[10]/div/div/div/div");
	protected By StudentRegisterCountryGraduated=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[10]/div/div/div/div") ;
	protected By StudentRegisterCountryStudent=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[11]/div/div/div/div");
	protected By StudentRegisterUniversityGraduated=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[11]/div/div/div/div");
	protected By StudentRegisterUniversityStudent=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[12]/div/div/div/div");
	protected By StudentRegisterDepartmentGraduated=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[12]/div/div/div/div");
	protected By StudentRegisterDepartmentStudent=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/div/form/div[13]/div/div/div/div");	
	
	
	
	
	
	// STUDENT EDIT PROFILE	
	protected By StudentEditProfilenameField=By.xpath("//input[@name='name']");
	protected By StudentEditProfilesurnameField=By.xpath("//input[@name='surname']");
	protected By StudentEditProfiletcknField=By.xpath("//input[@name='tckn']");
	protected By StudentEditProfileaddressField=By.xpath("//textarea[@name='street']");
	protected By StudentEditProfiledeleteBirtDateButton=By.xpath("//button[@class='react-datepicker__close-icon']");
	protected By StudentEditProfilephoneNumberField=By.xpath("//input[@name='phone']");
	protected By StudentEditProfileBirthDateField=By.xpath("//input[@class='birthDate']");
	protected By StudentEditProfilegpaField=By.xpath("//input[@name='gpa']") ;
	protected By StudentEditProfilesaveButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[25]/button[1]");
	      // dropdown elements for edit profile
	protected By StudentEditProfileGender=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[5]/div/div/div/div");
	protected By StudentEditProfileMilitary=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[6]/div/div/div/div");
	protected By StudentEditProfileNationalityMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/div/div/div");
	protected By StudentEditProfileNationalityFemale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[8]/div/div/div/div");
	protected By StudentEditProfileCountryMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[10]/div/ul/li[2]/div/div/div/div");
	protected By StudentEditProfilCountryFemale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/ul/li[2]/div/div/div/div");
	protected By StudentEditProfileCityMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[10]/div/ul/li[3]/div/div/div/div");
	protected By StudentEditProfileCityFemale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[9]/div/ul/li[3]/div/div/div/div");
	protected By StudentEditProfileClassMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[19]/div/div/div/div");
	protected By StudentEditProfileClassFeMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[18]/div/div/div/div");
	protected By StudentEditProfileCareerMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[20]/div/div/div/div");
	protected By StudentEditProfileCareerFeMale=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[19]/div/div/div/div");
			
	
	
	
	
	
	
	// STUDENT RESET PASSWORD
	protected By StudentResetPasswordEmailField=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[1]/div[1]/div[2]/input");
	protected By StudentResetPasswordPhoneRadioButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[1]/div[2]/div[1]/label/span[1]");
	protected By StudentResetPasswordEmailRadioButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[1]/div[2]/div[3]/label/span[1]");
	protected By StudentResetPasswordSendLinkButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div/form/div[2]/button");
	
	
	
	
	
	
	
	
	//STUDENT DASHBOARD
	protected By StudentDashboardaccountButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[1]/div[2]/div/section/div[1]/div/div[1]/div/ul/div[1]/button");
	protected By StudentDashboardEditProfileButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[1]/div[2]/div/section/div[1]/div/div[1]/div/ul/div[1]/div/ul/div/a[1]");
	protected By StudentDashboardNameButton=By.xpath("/html/body/div/div[1]/div/div/main/div/div[1]/div[1]/div/div[2]/div[1]/button");
	
	
	
	
	
	
	
	
	
	
	
	
	protected void cleartextbox(By path,WebDriver driver) {
    	
    	driver.findElement(path).sendKeys(Keys.CONTROL, Keys.chord("a"),(Keys.BACK_SPACE)); //select all text in textbox and delete it
    }
	
    protected void selectWebElement( By Path,int countDown,WebDriver driver) throws InterruptedException  {
		 
		 Thread.sleep(2000);
		 WebElement selectMyElement = driver.findElement(Path);
		 selectMyElement.click();
		 Actions keyDown = new Actions(driver); 
		 for(int i=0;i<countDown;i++) {
			 
			 keyDown.sendKeys(Keys.chord( Keys.DOWN )).perform();
		 }
		 
		 keyDown.sendKeys(Keys.chord( Keys.ENTER )).perform();
		 
			 
	 }
    
    
    protected void JavaScriptElement(String path) throws InterruptedException {
		 
		 WebElement ele = driver.findElement(By.xpath(path));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", ele);
		 Thread.sleep(2000);
	 }

}
