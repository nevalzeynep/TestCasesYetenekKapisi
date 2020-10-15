package EdtiProfile;

import org.testng.annotations.Test;

import Base.BaseTests;
import pages.EditProfile;
import pages.StudentDashboard;

public class EditProfilTest extends BaseTests {
	@Test
	public void TestSuccesEditProfile()
	{
		homePage.setUsername("nazan-saribiyik@hotmail.com");
		homePage.setPassword("nazan970");
		StudentDashboard stdDashboard=homePage.clickStudentLogin();
		EditProfile profile=stdDashboard.clickEditProfileButton();
		profile.SetName("nazan nazli");
		profile.SetSurname("saribiyik");
	}

}
