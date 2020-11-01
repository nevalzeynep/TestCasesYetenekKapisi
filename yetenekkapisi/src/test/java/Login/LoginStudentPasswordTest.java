package Login;

import org.testng.annotations.Test;

import Base.BaseTests;

public class LoginStudentPasswordTest extends BaseTests {
	@Test(priority =1)
	public void TestLoginSeePassword() throws InterruptedException
	{
		Thread.sleep(2000);
		LoginPage.setUsername("yekmogrenci@gmail.com");
		LoginPage.setPassword("Y3K_StU3nt.462A.!");
		LoginPage.clickshowPassword();
		LoginPage.clickStudentLogin();
		
	}

}
