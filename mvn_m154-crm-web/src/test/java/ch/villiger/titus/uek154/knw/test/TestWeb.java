package ch.villiger.titus.uek154.knw.test;

import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class TestWeb {

	@Test
	public void test() {
		
		
		// TODO: TEST DOES FAIL ("Keine Verbindung zu 7070 aufgebauut" -> Diabled for now
		
		// Configure firefox driver
		/*
		System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\geckodriver\\geckodriver.exe");
		
		// Start firefox driver
		WebDriver driver = new FirefoxDriver();
		
		// Configure chrome driver	
		
		// System.setProperty("webdriver.chrome.driver", "C:\\arif_chughtai\\programme\\chromedriver_win32\\chromedriver.exe");
		  
		//ChromeOptions options = new ChromeOptions();
		// options.addArguments("--no-sandbox"); // In Case of runtime errors. Has to be the very first option
		// options.setExperimentalOption("useAutomationExtension", false); // In Case of runtime errors
		// options.setBinary("C:\\arif_chughtai\\programme\\chromedriver_win32\\chromedriver.exe");	
		// WebDriver driver = new ChromeDriver(options);

		// Start website
		driver.get("http://localhost:7070");
		
		// Use website
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Linux");
		driver.findElement(By.xpath("//input[@name='q']")).submit();

		// Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close driver
		driver.quit();
		
		*/
	}

}
