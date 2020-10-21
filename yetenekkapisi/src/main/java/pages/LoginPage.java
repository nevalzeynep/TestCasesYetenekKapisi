package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	
	
	private By usernameField= (By.name("username"));
	private By passwordField=(By.name("password"));
	private By showPassword=(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[2]/div[1]/button"));
	private By LoginButton =(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[3]/button[1]"));
    private By StudentRegisterButton=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[3]/button[2]");
	private By ForgotPasswordButon=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/form/div[2]/div[2]/a");
	
	//if session already exist
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    	
    }
   

	//  test case  set username and password
    public void setUsername(String username)
    
    {
    	driver.findElement(usernameField).sendKeys(username);
    	
    }
    
    public void setPassword(String password)
    {
    	driver.findElement(passwordField).sendKeys(password);
    }
  
    //clickbuttons methods
    
    
    public void clickshowPassword() 
    {
    	driver.findElement(showPassword).click();
    	
    }
    
    public StudentDashboard clickStudentLogin()
    {
    	driver.findElement(LoginButton).click();
		return new StudentDashboard(driver);
    }
    
    public StudentRegister clickStdRegisterButton()
    {
    	
    	driver.findElement(StudentRegisterButton).click();
    	return new StudentRegister(driver);
    	
    }
    public ResetPassword clickForgotPasswordButon()
    {
    	driver.findElement(ForgotPasswordButon).click();
		return new ResetPassword(driver);
    	
    }
   
    

}
