package pages;

import org.openqa.selenium.By;


import browserUtility.Base;

public class HomePage extends Base{
	


	
	public void homePage() {
		driver.get("https://www.khanacademy.org/");
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
	}
}
