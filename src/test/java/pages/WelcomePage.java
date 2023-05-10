package pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;

import browserUtility.Base;

public class WelcomePage extends Base {
	
	
	
	By welcomeMsg = By.xpath("//*[@id=\"app-shell-root\"]/div/main/div[2]/div[1]/div/div/h1");
	
	
	
	public void welcomePageAssert() {
		wait(Duration.ofSeconds(5),welcomeMsg);
		Assert.assertEquals(
				driver.findElement(welcomeMsg).getText(), "Welcome, dineshkarthidk28"
				);
	}
	public void welcomeTittle() {
		
		Assert.assertEquals(driver.getTitle(), "* Classes | Khan Academy");
		System.out.println("I have Navigated to the Welcome Page");
		
	}
	}


