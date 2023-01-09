package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	@FindBy(xpath=("//a[@class='lgnBtnMnu']"))
	private WebElement logbutton;
	
	@FindBy(xpath=("(//input[@type='text'])[2]"))
	private WebElement email;
	
	@FindBy(xpath=("//input[@placeholder='Enter password']"))
	private WebElement pass;
	
	@FindBy(xpath=("(//button[@type='submit'])[1]"))
	private WebElement lgin;
	
	@FindBy(xpath=("//a[@data-toggle='dropdown'])[1]"))
	private WebElement dropdown;
		
	//a[@data-toggle='dropdown'])[1]

	
	public Login1(WebDriver driver) { 
		PageFactory.initElements(driver,this);
	}
	
	public void logbutto() {
		logbutton.click();
	}
	
	public void mail() {
		email.sendKeys("yesrk@gmail.com");
	}
	
	public void password() {
		pass.sendKeys("Learn@1234");
	}
	
	public void loginc() {
		lgin.click();
	}
}
