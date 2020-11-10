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
		registerstd.setName("test student");
		registerstd.setSurname("test student");
		registerstd.setDisabledStatus(0);
		
		registerstd.setEmail("test@denedme.com");
		registerstd.setPhone("123456");
		registerstd.setEducationStatus(1,"std");
		registerstd.setEducationType(1);
		registerstd.setClassLevel(2);
		registerstd.setCountry(0);
		registerstd.setUniversity(0);
		registerstd.setDepartmentFromList(4);
		//registerstd.clickClarifacitonButton();
		//registerstd.clickConsenText("no");
		registerstd.clickSendButton();
		
		
	}
	
}
