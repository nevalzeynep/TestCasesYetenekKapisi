package Experiences;

import org.testng.annotations.Test;

import Base.BaseTests;
import pages.Experiences;
import pages.LoginPage;
import pages.StudentDashboard;

public class Skill extends BaseTests {
	@Test
	public void SkillTest() throws InterruptedException {
		LoginPage.setUsername("yekmogrenci@gmail.com");
		LoginPage.setPassword("Y3K_StU3nt.462A.!");
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin(); // loginpage creates student dashboard
		Experiences Exp=stdDashboard.clickExperiencesButton(); // experinces page
		Exp.clickYetkinlikler();
		Exp.clickNewSkillButton();
		Exp.setSkillName("java");
		Exp.setstudentSkillLevel(2);
		Exp.setDescription("deneme description");
		

		
	}

}
