package Login;

import org.testng.annotations.Test;

import Base.BaseTests;

public class LoginStudentTest extends BaseTests{
	@Test
	
public void TestSuccesLogin(){
	

		// assign this new object for the dashboard page
		homePage.setUsername("nazan-saribiyik@hotmail.com");
		homePage.setPassword("nazan970");
		homePage.clickStudentLogin();
		
		
		
	}

}
