package pages;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;


import browserUtility.Base;

public class LoginPage extends Base{
	
	
	
 By emailIn = By.xpath("//input[@id='uid-login-form-0-wb-id-identifier-field']");
 By passIn = By.xpath("//input[@id='uid-labeled-text-field-1-wb-id-field']");
 By submtbtn = By.xpath("//button[@type='submit']");

	
	
	public void login() throws InterruptedException {
		
	
		wait(Duration.ofSeconds(5),emailIn);
		driver.findElement(emailIn).sendKeys(prop.getProperty("email"));
		driver.findElement(passIn).sendKeys(prop.getProperty("pwd"));
		driver.findElement(submtbtn).click();
	}

}
