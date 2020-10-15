package ResetPassword;

import org.testng.annotations.Test;

import Base.BaseTests;

import pages.ResetPassword;

public class ResetPasswordTest extends BaseTests {
	@Test
	public void SuccesPhoneResetPasswordTest()
	{
		ResetPassword rstpasw=homePage.clickForgotPasswordButon();
		rstpasw.setEmail("nazan-saribiyik@hotmail.com");
		rstpasw.clickPhoneLink();
		
	}
	
	@Test
	public void SuccesEmailResetPasswordTest()
	{
		ResetPassword rstpasw=homePage.clickForgotPasswordButon();
		rstpasw.setEmail("nazan-saribiyik@hotmail.com");
		rstpasw.clickEmailLink();
		
	}
	
	
	
	

}
