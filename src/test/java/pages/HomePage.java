package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import browserUtility.Base;

public class HomePage extends Base{
	


	
	public void homePage() {
		driver.get("https://www.khanacademy.org/");
		Assert.assertEquals(driver.findElement(By.xpath("//a[@id='login-or-signup']")).getText(), "Log in");
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
	}
}
