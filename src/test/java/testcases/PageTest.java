package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserUtility.Base;
import pages.CoursesPage;
import pages.HandlingQuizPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NumbersPage;
import pages.WelcomePage;

public class PageTest extends Base {
	
	
	HomePage home = new HomePage();
	WelcomePage welcome = new WelcomePage();
	LoginPage log = new LoginPage();
	CoursesPage courses = new CoursesPage();
	NumbersPage number = new NumbersPage();
	HandlingQuizPage quiz = new HandlingQuizPage();

	
	
	@BeforeTest
	public void browserLaunch() {
		
		home.invokeBrowser();
		
		//dddd
	}
	
	@Test
	public void quizAutomation() throws InterruptedException {
		
		
	    home.homePage();
		log.login();
		welcome.welcomePageAssert();
		welcome.welcomeTittle();
		courses.courseDropDown();
		number.startQuiz();
		quiz.handleDragDrop();
		quiz.upNextbtn();
		
	}
	
	

	
	

	
	

}
