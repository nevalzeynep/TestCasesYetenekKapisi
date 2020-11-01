package EdtiProfile;

import org.testng.annotations.Test;

import Base.BaseTests;

import pages.EditProfilePage;
import pages.StudentDashboard;

public class EditProfilTest extends BaseTests {
	@Test
	public void TestSuccesEditProfile() throws InterruptedException
	{
		LoginPage.setUsername("yekmogrenci@gmail.com");
		LoginPage.setPassword("Y3K_StU3nt.462A.!");
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin();
	    EditProfilePage editprofile=stdDashboard.clickEditProfileButton();
	    
		editprofile.SetName("batuhan deneme");
		editprofile.SetSurname("ekici deneme");
		editprofile.setTckn("41546586464");
		editprofile.setGender(0,"male");
		editprofile.setMilitaryServiceStatus(1);
		editprofile.setBirthDate("02/02/1997");
		editprofile.setPhoneNumber("555555555");
		editprofile.setnationality(6);
		editprofile.setAddress("çankaya yýldýz 4/2");
		editprofile.setCountry(0);
		Thread.sleep(4000);
		
	}

}
