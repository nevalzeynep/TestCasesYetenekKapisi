package EdtiProfile;

import org.testng.annotations.Test;

import Base.BaseTests;
import pages.EditProfile;
import pages.StudentDashboard;

public class EditProfilTest extends BaseTests {
	@Test
	public void TestSuccesEditProfile()
	{
		LoginPage.setUsername("nazan-saribiyik@hotmail.com");
		LoginPage.setPassword("nazan970");
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin();
		EditProfile profile=stdDashboard.clickEditProfileButton();
		profile.SetName("nazan nazli");
		profile.SetSurname("saribiyik");
	}

}
