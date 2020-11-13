package Experiences;

import org.testng.annotations.Test;

import Base.BaseTests;
import pages.AddNewCareer;
import pages.EditCareer;
import pages.Experiences;

import pages.StudentDashboard;

public class WorkExperiences extends BaseTests{
	
	
	@Test 
	public void ExpreincesTest() throws InterruptedException{
		
		LoginPage.setUsername("yekmogrenci@gmail.com");
		LoginPage.setPassword("Y3K_StU3nt.462A.!");
		StudentDashboard stdDashboard=LoginPage.clickStudentLogin(); // loginpage creates student dashboard
		
		Experiences Exp=stdDashboard.clickExperiencesButton(); // experinces page

		AddNewCareer newCareer=Exp.clickAddNewButton(); // add new experinces page
		newCareer.setEmployer("stajyer");
		newCareer.setPosition("stajyer");
		newCareer.setCareerStatus(1);
		newCareer.setStartDate();
		
		//newCareer.setEndDate();
		newCareer.setDescription("deneme yeni ekle");
		newCareer.submitButtonClick();
		
		 // edit career
		EditCareer edtCareer=Exp.clickEditButton(); // edit career page
		edtCareer.EditEmployer("edit2");
		edtCareer.EditPosition("edit2");
		edtCareer.EditCareerStatus(0);
		edtCareer.EditCareerDescription("asfsaedit2");
		
		edtCareer.clickSubmitButton();
		
		// delete career
	    Exp.clickDeleteCareer();
		
		
	}
	
	
	}
	

