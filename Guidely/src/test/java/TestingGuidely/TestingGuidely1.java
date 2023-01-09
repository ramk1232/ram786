package TestingGuidely;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.Login1;

public class TestingGuidely1 {
	
	WebDriver driver;
	Login1 log;

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class is running");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();   //to turn off notifications of chrome
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);    
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://guidely.in/");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is running");
		
		Login1 auth = new Login1(driver);
		auth.logbutto();
		auth.mail();
		auth.password();
		auth.loginc();
		
	}
	@Test
	public void Logclik() {
		System.out.println("test method is running");
		
	log = new Login1(driver);
	log.loginc();		
	}
	
	@Test
	public void credentials() {
		System.out.println("test2 method is running");
		
	log = new Login1(driver);
	log.loginc();
	
	}
	
	@AfterMethod
	public void afterMethod() {
					
	}
	@AfterClass
	public void afterclass() {
		//driver.close();
	}

}
