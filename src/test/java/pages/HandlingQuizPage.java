package pages;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import browserUtility.Base;

public class HandlingQuizPage extends Base{
	

	
	By source = By.xpath("//*[@id=\"app-shell-root\"]/div/main/div[3]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/form/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div/div/div");
	By tc = By.xpath("//*[@id=\"app-shell-root\"]/div/main/div[3]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/form/div/div[1]/div/div[2]/div/div/div/div[2]");
	By number = By.xpath("//*[@id=\"app-shell-root\"]/div/main/div[3]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/form/div/div[1]/div/div[1]/div/strong/span/span[2]/span[1]/span/span[2]/span");
	By checkbtn = By.xpath("//button[@class='_rz7ls7u']");
	By mesgalerttxt = By.xpath("//div[@class='_rngbhz']");
	By alertMesg = By.xpath("//div[@class='_t0tx82']");
	By nextQuestnBtn = By.xpath("//button[@class='_6t500vf']");
	By upNextbtn = By.xpath("//a[@class='_1kkrg8oi']");
	

	public void handleDragDrop() {
		wait(Duration.ofSeconds(5),source);
		WebElement source1 ;
		WebElement tcc ;
		Actions builder = new Actions(driver);
		String num ="";
		int value = 0;
		
		for (int i =1; i<=7; i++) {
			
			 num =driver.findElement(number).getText();
			value =Integer.parseInt(num);
			System.out.println(value);
			
			for (int j =1; j<=value; j++) {
				
				wait(Duration.ofSeconds(5),source);
				 source1 = driver.findElement(source);
				 tcc = driver.findElement(tc);
				builder.dragAndDrop(source1, tcc).build().perform();
				
			}
			
			driver.findElement(checkbtn).click(); //check button
			
//			wait(Duration.ofSeconds(5),mesgalerttxt); //alert
//			if(driver.findElement(alertMesg).getText().contains("work!")){
//				System.out.println("The answer is Correct");
//			}
			driver.findElement(nextQuestnBtn).click(); //next question
			
		}
		
	}
	
	public void upNextbtn() {
		
		wait(Duration.ofSeconds(9),upNextbtn);
		driver.findElement(upNextbtn).click();
		
	}
}
