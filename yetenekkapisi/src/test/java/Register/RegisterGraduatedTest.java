package Register;

import org.testng.annotations.Test;

import Base.BaseTests;
import pages.StudentRegister;

public class RegisterGraduatedTest extends BaseTests{
	@Test (priority=0)
	
	public void succesGraduatedRegisterTest() throws InterruptedException
	{
		StudentRegister registerstd=LoginPage.clickStdRegisterButton();
		registerstd.setName("sebiha");
		registerstd.setSurname("gündeþli");
		registerstd.setDisabledStatus(1);
		registerstd.setEmail("s.s.gundesli@gmail.com");
		registerstd.setPhone("123456");
		registerstd.setStatus(0);
		registerstd.setEducationType(1);
		registerstd.setCountry(0,0);
		registerstd.setUniversity(1,0);
		registerstd.setDepartmentFromList(0,0);
		registerstd.clickClarifacitonButton(0);
		registerstd.clickConsenText(0, "yes");
		registerstd.clickSendButton();
		
		
	}
	@Test(priority=1)
	public void succesGraduatedOtherCountryRegisterTest() throws InterruptedException
	{
		
		StudentRegister registerstd=LoginPage.clickStdRegisterButton();
		registerstd.setName("test");
		registerstd.setSurname("test");
		registerstd.setDisabledStatus(1);
		registerstd.setEmail("test@dednemde.ccdcom");
		registerstd.setPhone("123456");
		registerstd.setStatus(0);
		registerstd.setEducationType(0);
		registerstd.setCountry(1,0);
		registerstd.setUniversity(0,0);
		registerstd.setDepartment("computer engineering",0);
		registerstd.clickClarifacitonButton(0);
		registerstd.clickConsenText(0, "yes");
		registerstd.clickSendButton();
	}
	
	

}
