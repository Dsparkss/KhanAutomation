package pages;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import browserUtility.Base;

public class NumbersPage extends Base{
	
	
	WebElement element ;
	By demobtn = By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[1]/div/div/div[2]/div[3]/ul/li[2]/div/div[1]/div[2]");
	By buttons = By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[1]/div/div/div[2]/div[3]/ul/li[1]/div/div[1]/div[2]");
	By start = By.xpath("//a[@class='_1lrvdlvw']");
	By tryagain =By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[1]/div/div/div[2]/div[3]/ul/li[1]/div/div[1]/div[2]/a");
	By contwthsmalnum = By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[1]/div/div/div[2]/div[3]/ul/li[1]/div/div[1]/div[1]/a/span");
	By letsgoBtn = By.xpath("//button[@class='_1f0fvyce']");
	By demotry = By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[1]/div/div/div[2]/div[3]/ul/li[2]/div/div[1]/div[2]/a");
	
	public void startQuiz() throws InterruptedException {
		
		//Count with small numbers
		//Try again
		//Start
		
		wait(Duration.ofSeconds(5),contwthsmalnum );
		String button = driver.findElement(contwthsmalnum).getText();
		System.out.println(button);
		Thread.sleep(1000);
		switch (button) {
		case("Count with small numbers"):
			
			driver.findElement(contwthsmalnum).click();
			System.out.println("Count with numbers button is executed");
		break;
		case("Start"):
			
		driver.findElement(start).click();
			System.out.println("Start button is clicked");
		
		break;
		case("Try again"):
			
			driver.findElement(demotry).click();
		System.out.println("Try again button is clicked");
		
		break;
			
		}
		
		Thread.sleep(6000);

	}
	
	public void handleLetsGoButton() throws InterruptedException {
		
	List <WebElement> elements = driver.findElements(letsgoBtn);
	
	if(!elements.isEmpty()) {
		for(WebElement element :elements) {
			Thread.sleep(1000);
			element.click();
		}
	}else {
		System.out.println("No Such Element so skipped");
	}
	
	}

}
