package EdtiProfile;

import org.testng.annotations.Test;

import Base.BaseTests;

import pages.EditProfilePage;
import pages.StudentDashboard;

public class EditProfilTest extends BaseTests {
	@Test
	public void TestSuccesEditProfile() throws InterruptedException
	{
		LoginPage.setUsername("nazan-saribiyik@hotmail.com");
		LoginPage.setPassword("nazan970");
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin();
	   EditProfilePage editprofile=stdDashboard.clickEditProfileButton();
	   
		editprofile.SetName("nazan nazli");
		editprofile.SetSurname("saribiyik");
		Thread.sleep(4000);
		
	}

}
