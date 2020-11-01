package ResetPassword;

import org.testng.annotations.Test;

import Base.BaseTests;

import pages.ResetPassword;

public class ResetPasswordTest extends BaseTests {
	@Test
	public void SuccesPhoneResetPasswordTest()
	{
		ResetPassword rstpasw=LoginPage.clickForgotPasswordButon();
		rstpasw.setEmail("yekmogrenci@gmail.com");
		rstpasw.clickPhoneLink();
		
	}
	
	@Test
	public void SuccesEmailResetPasswordTest()
	{
		ResetPassword rstpasw=LoginPage.clickForgotPasswordButon();
		rstpasw.setEmail("yekmogrenci@gmail.com");
		rstpasw.clickEmailLink();
		
	}
	
	
	
	

}
