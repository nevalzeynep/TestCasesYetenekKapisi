package EdtiProfile;

import org.testng.annotations.Test;

import Base.BaseTests;

import pages.EditProfilePage;
import pages.StudentDashboard;

public class EditProfilTest extends BaseTests {
	@Test (priority=0)
	public void TestSuccesEditProfileMale() throws InterruptedException
	{
		LoginPage.setUsername("yekmogrenci@gmail.com");
		LoginPage.setPassword("Y3K_StU3nt.462A.!");
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin();
	    EditProfilePage editprofile=stdDashboard.clickEditProfileButton();
	    
		editprofile.SetName("batuhan deneme");
		editprofile.SetSurname("ekici deneme");
		//editprofile.setTckn("41546586464");
		editprofile.setGender(0,"male");  // 0 for countDown, male for GenderFlag
		editprofile.setMilitaryServiceStatus(1); 
		editprofile.setBirthDate();
		editprofile.setPhoneNumber("555555555");
		editprofile.setnationality(2);
		editprofile.setAddress("deneme test çankaya yýldýz 4/2");
		editprofile.setCountry(0);
		editprofile.setCity(1);
		editprofile.setRadioButtons();
		editprofile.setClassLevel(0);
		editprofile.setCareerStatus(0);
		editprofile.setGpa("315");
		editprofile.clickSendButton();
		
		
	}
	
	
	
	

}
