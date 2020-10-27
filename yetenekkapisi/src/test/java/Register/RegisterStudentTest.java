package Register;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTests;
import pages.StudentRegister;


public class RegisterStudentTest extends BaseTests {
	
	@Test
	public void succesStudentRegisterTest() throws InterruptedException
	{
		StudentRegister registerstd=LoginPage.clickStdRegisterButton();
		registerstd.setName("test");
		registerstd.setSurname("test");
		registerstd.setDisabledStatus();
		registerstd.setEmail("test@deneme.com");
		registerstd.setPhone("123456");
		registerstd.setStatus();
		registerstd.setEducationType();
		registerstd.setCountry();
		registerstd.setUniversity();
		registerstd.setDepartment();
		registerstd.clickClarifacitonButton();
		registerstd.clickConsenText();
		registerstd.clickSendButton();
		
		
	}

}
