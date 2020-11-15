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
		assertEquals(rstpasw.getNotificationTextResetPassword(), "�ifre s�f�rlama linki sms olarak g�nderilmi�tir.", "�ifre i�in link gitti mesaj� g�z�kmedi");
		
		
	}
	
	@Test
	public void SuccesEmailResetPasswordTest()
	{
		ResetPassword rstpasw=LoginPage.clickForgotPasswordButon();
		rstpasw.setEmail("yekmogrenci@gmail.com");
		rstpasw.clickEmailLink();
		assertEquals(rstpasw.getNotificationTextResetPassword(), "�ifre s�f�rlama linki e-posta adresinize g�nderildi", "�ifre i�in sms gitti mesaj� g�z�kmedi");
		
	}
	@Test
	public void FailPhoneResetPasswordTest() {
		ResetPassword rstpasw=LoginPage.clickForgotPasswordButon();
		rstpasw.setEmail("yekmogrenci@gmmmail.com");
		rstpasw.clickEmailLink();
	    assertEquals(rstpasw.getNotificationTextResetPassword(), "Bu mail adresi sistemde kay�tl� de�ildir, kay�t ol b�l�m�nden yeni bir kay�t olu�turunuz.", "sistem kay�tl� olmayan bir adres kullan�ld�");
		
	}
	
	
	

}
