package ResetPassword;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;



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
		assertEquals(rstpasw.getNotificationTextResetPassword(), "Þifre sýfýrlama linki sms olarak gönderilmiþtir.", "þifre için link gitti mesajý gözükmedi");
		
		
	}
	
	@Test
	public void SuccesEmailResetPasswordTest()
	{
		ResetPassword rstpasw=LoginPage.clickForgotPasswordButon();
		rstpasw.setEmail("yekmogrenci@gmail.com");
		rstpasw.clickEmailLink();
		assertEquals(rstpasw.getNotificationTextResetPassword(), "Þifre sýfýrlama linki e-posta adresinize gönderildi", "þifre için sms gitti mesajý gözükmedi");
		
	}
	@Test
	public void FailPhoneResetPasswordTest() {
		ResetPassword rstpasw=LoginPage.clickForgotPasswordButon();
		rstpasw.setEmail("yekmogrenci@gmmmail.com");
		rstpasw.clickEmailLink();
	    assertEquals(rstpasw.getNotificationTextResetPassword(), "Bu mail adresi sistemde kayýtlý deðildir, kayýt ol bölümünden yeni bir kayýt oluþturunuz.", "sistem kayýtlý olmayan bir adres kullanýldý");
		
	}
	
	
	

}
