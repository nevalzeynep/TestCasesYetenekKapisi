package Login;

import org.testng.annotations.Test;

import Base.BaseTests;

public class LoginStudentTest extends BaseTests{
	@Test(priority =0)
	
public void TestSuccesLogin() 
	{
	

		// assign this new object for the dashboard page
		LoginPage.setUsername("nazan-saribiyik@hotmail.com");
		LoginPage.setPassword("nazan970");
		LoginPage.clickStudentLogin();
		
		
		
	}
	// add login with show password click
	//add login with fail login

}
