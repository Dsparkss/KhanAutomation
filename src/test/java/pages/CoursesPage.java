package pages;

import java.time.Duration;

import org.openqa.selenium.By;

import browserUtility.Base;

public class CoursesPage extends Base {

	By coursedrpbtn = By.xpath("//button[@data-test-id=\"learn-menu-dropdown\"]");
	By courseheadbtn = By.xpath("//*[@id=\"header-dropdown\"]/ul/li[1]/div/ul[2]/li[1]/a");
	By continuebtn = By.xpath("//a[@class='_1rhl3qm4']");

	public void courseDropDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(coursedrpbtn).click();
		Thread.sleep(2000);
		driver.findElement(courseheadbtn).click();
		wait(Duration.ofSeconds(5), continuebtn);
		Thread.sleep(1000);
		driver.findElement(continuebtn).click();

	}

}
