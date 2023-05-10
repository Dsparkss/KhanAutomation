package browserUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Base {
	
	public static WebDriver driver ;
	public static Properties prop;
	public static WebDriverWait wait;
	
	
	
	//calling different browser
	
	public void invokeBrowser() {
		prop = new Properties();
		
		
	//loading the Inputstream
		try {
			prop.load(new FileInputStream("src/test/java/Configuration/configuration.properties"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// To Open Chrome Browser
			if (prop.getProperty("browserName").matches("chrome")) {
					driver = new ChromeDriver();
				}

		// To Open Firefox Browser
			if (prop.getProperty("browserName").matches("firefox")) {
					driver = new FirefoxDriver();
				}

		// To maximize the Browser Window
				driver.manage().window().maximize();
				

			}
	
	
	// To open the Main Page URL
		public void openURL(String websiteURL) {
			driver.get(prop.getProperty(websiteURL));
		}
		
	//wait function
		public void wait(Duration duration, By locator) {
			wait = new WebDriverWait(driver, duration);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		
	// Function to take Screenshot of screen
		public void Screenshoot(String fileName) throws IOException {
			TakesScreenshot capture = (TakesScreenshot) driver;
			File srcFile = capture.getScreenshotAs(OutputType.FILE);
			File destFile = new File(System.getProperty("user.dir")
					+ "/Screenshot/" + fileName + ".png");
			Files.copy(srcFile, destFile);
		}

		public void closeBrowser() {
			driver.quit();
		}

		
	}











