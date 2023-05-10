package pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import browserUtility.Base;

public class NumbersPage extends Base{
	
	
	By contwthsmalnum = By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[1]/div/div/div[2]/div[3]/ul/li[1]/div/div[1]/div[1]/a/span");
	By letsgoBtn = By.xpath("//button[@class='_1f0fvyce']");
	
	
	public void startQuiz() {
		
		wait(Duration.ofSeconds(5),contwthsmalnum );
		driver.findElement(contwthsmalnum).click();
		
	wait(Duration.ofSeconds(5),letsgoBtn);//lets go button
	driver.findElement(letsgoBtn).click();
	}
	

}
