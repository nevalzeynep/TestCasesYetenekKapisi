package Register;

import org.testng.annotations.Test;

import Base.BaseTests;
import pages.StudentRegister;

public class RegisterGraduatedTest extends BaseTests{
	@Test (priority=1)
	
	public void succesGraduatedRegisterTest() throws InterruptedException{
		
		StudentRegister registerstd=LoginPage.clickStdRegisterButton();
		registerstd.setName("sebiha");
		registerstd.setSurname("gündeþli");
		registerstd.setDisabledStatus(1);
		registerstd.setEmail("s.s.gundesli@gmaiiiil.com");
		registerstd.setPhone("123456");
		registerstd.setEducationStatus(0,"mezun");
		registerstd.setEducationType(1);
		registerstd.setCountry(0);
		registerstd.setUniversity(1);
		registerstd.setDepartmentFromList(0);
		//registerstd.clickClarifacitonButton();
		//registerstd.clickConsenText( "yes");
		registerstd.clickSendButton();
		
		
	}
	@Test (priority=0)
	public void successGraduatedOtherRegistertest() throws InterruptedException{
		
		StudentRegister registerstd=LoginPage.clickStdRegisterButton();
		registerstd.setName("deneme");
		registerstd.setSurname("gündeþli");
		registerstd.setDisabledStatus(0);
		registerstd.setEmail("s.s.gundesli@gmail.com");
		registerstd.setPhone("123456");
		registerstd.setEducationStatus(0,"mezun");
		registerstd.setEducationType(1);
		registerstd.setCountry(5);
		registerstd.setUniversity(1);
		
		registerstd.setDepartment("Computer Engineering");
		//registerstd.clickClarifacitonButton();
		//registerstd.clickConsenText( "yes");
		registerstd.clickSendButton();
	}
	
	
	
	

}
