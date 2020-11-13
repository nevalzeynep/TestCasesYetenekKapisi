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
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin(); // loginpage creates student dashboard
		
	    EditProfilePage editprofile=stdDashboard.clickEditProfileButton(); 
	    editprofile.setPhoto();
		editprofile.SetName("batuhan deneme");
		editprofile.SetSurname("ekici deneme");
		//editprofile.setTckn("41546586464");
		editprofile.setGender(0,"male");  // 0 for countdown for Dropdown, male for GenderFlag, 
		editprofile.setMilitaryServiceStatus(1); // 1 for countdown for Dropdown
		editprofile.setBirthDate();
		editprofile.setPhoneNumber("555555555");
		editprofile.setnationality(2); //2 for countdown for Dropdown can be any number
		editprofile.setAddress("deneme test çankaya yýldýz 4/2");
		editprofile.setCountry(0);// for dropdown 
		editprofile.setCity(1);// for dropdown 
		editprofile.setRadioButtons();
		editprofile.setClassLevel(0);// for dropdown 
		editprofile.setCareerStatus(0);// for dropdown 
		editprofile.setGpa("400");
		
		editprofile.clickSendButton();
		
		
	}
	
	
	
	

}
