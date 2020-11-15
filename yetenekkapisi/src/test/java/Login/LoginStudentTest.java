package Login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Base.BaseTests;

public class LoginStudentTest extends BaseTests{
	
	@Test(priority=0)
public void TestSuccesLogin() {
	

		// assign this new object for the dashboard page
		LoginPage.setUsername("yekmogrenci@gmail.com");
		LoginPage.setPassword("Y3K_StU3nt.462A.!");
		LoginPage.clickStudentLogin();
	
	}
	
	
	
	//add login with fail login
	

}
