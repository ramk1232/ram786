package Irctc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Irctc1.Homepage;

public class Irctctest {
	
	WebDriver driver;
	Homepage Ir;

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.out.println("before class is running");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();   //to turn off notifications of chrome
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("before method is running");
		
		Homepage Home = new Homepage(driver);
//		I.pop();
		Home.from1();
		Home.clik1();
		Thread.sleep(1000);
		Home.to();
		Home.clik2();
		Thread.sleep(1000);
		Home.clikchkb();
		Thread.sleep(1000);
		Home.serch();

	}
	
	@Test(priority=1)
	public void testpage() {
		System.out.println("test method is running");
		
		Ir = new Homepage(driver);
		Ir.clik1();
		
		String url = driver.getCurrentUrl(); // Actual
		if(url.equals("https://www.irctc.co.in/nget/train-search")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test Case is failed");
		}
	}
	
	
	@Test(enabled=false)
	public void testSerch() {
		System.out.println("test method is running");
		
		Ir = new Homepage(driver);
	//	Ir.serch();
		
		String url = driver.getCurrentUrl(); // Actual
		if(url.equals("	https://www.irctc.co.in/nget/booking/train-list")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test Case is failed");
		}
	}

	@AfterMethod
	public void afterMethod() {
					
	}
	@AfterClass
	public void afterclass() {
	//	driver.close();
	}

}
