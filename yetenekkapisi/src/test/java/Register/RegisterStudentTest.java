package Register;

import static org.testng.Assert.assertEquals;

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
		registerstd.setEducationStatus(1);
		registerstd.setEducationType(1);
		registerstd.setClassLevel(2);
		registerstd.setCountry(0);
		registerstd.setUniversity(0);
		registerstd.setDepartmentFromList(4);
		//registerstd.clickClarifacitonButton();
		//registerstd.clickConsenText("no");
		registerstd.clickSendButton();
		
		
	}
	@Test
	public void FailStudentRegisterTest() throws InterruptedException // mail already exist
	{
		StudentRegister registerstd=LoginPage.clickStdRegisterButton();
		registerstd.setName("test student");
		registerstd.setSurname("test student");
		registerstd.setDisabledStatus(0);
		registerstd.setEmail("test@denedme.com");
		registerstd.setPhone("123456");
		registerstd.setEducationStatus(1);
		registerstd.setEducationType(1);
		registerstd.setClassLevel(2);
		registerstd.setCountry(0);
		registerstd.setUniversity(0);
		registerstd.setDepartmentFromList(4);
		//registerstd.clickClarifacitonButton();
		//registerstd.clickConsenText("no");
		registerstd.clickSendButton();
		 assertEquals(registerstd.getAlertTextRegister(), "Bu alan boþ býrakýlmamalýdýr", "zorunlu alan doldurulmdan register yapýldý");
		
	}
	
}
