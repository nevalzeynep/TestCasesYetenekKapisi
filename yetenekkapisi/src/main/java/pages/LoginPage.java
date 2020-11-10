package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends GlobalVariable {

	private WebDriver driver;

	
	GlobalVariable gb=new GlobalVariable(driver);
	
	//if session already exist
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    	
    }
   

	//  test case  set username and password
    public void setUsername(String username) {
    	
    	driver.findElement(gb.StudentLoginusernameField).sendKeys(username);
    	
    }
    
    public void setPassword(String password) {
    	
    	driver.findElement(gb.StudentLoginpasswordField).sendKeys(password);
    }
  
    //clickbuttons methods
    
    
    public void clickshowPassword() 
    {
    	driver.findElement(gb.StudentLoginshowPassword).click();
    	
    	
    }
    
    public StudentDashboard clickStudentLogin()
    {
    	driver.findElement(gb.StudentLoginLoginButton).click();
		return new StudentDashboard(driver);
    }
    
    public StudentRegister clickStdRegisterButton()
    {
    	
    	driver.findElement(gb.StudentLoginRegisterButton).click();
    	return new StudentRegister(driver);
    	
    }
    public ResetPassword clickForgotPasswordButon()
    {
    	driver.findElement(gb.StudentLoginForgotPasswordButon).click();
		return new ResetPassword(driver);
    	
    }
   
    

}
