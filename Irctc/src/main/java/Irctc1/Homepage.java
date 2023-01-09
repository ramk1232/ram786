package Irctc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
////////////////////
public class Homepage {
	
	//Step 1 : Declaration of variable globally (data members)
	
//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement popup;

	@FindBy(xpath="//input[@role='searchbox'][1]")
	private WebElement from;
	
	@FindBy(xpath="//li[@role='option'][2]")
	private WebElement click1;
		
	@FindBy(xpath="//input[contains(@class,'ng-tns-c57-9 ')]")
	private WebElement to;
	
	@FindBy(xpath="//li[@role='option'][2]")
	private WebElement click2;
	
	@FindBy(xpath="//label[@for='dateSpecific']")
	private WebElement clickChk;
	
	@FindBy(xpath="//button[@label='Find Trains']")
	private WebElement search;
		
		
	public Homepage(WebDriver driver) { 
		PageFactory.initElements(driver,this);
	}

	//Step 3 : Method creation
		
//	public void pop() {
//		popup.click();	
//	}
	public void from1() {
		from.sendKeys("PARBHANI JN - PBN");
	}
	public void clik1() {
		click1.click();	
	}
	public void to() {
		to.sendKeys("LATUR LUR");
	}
	public void clik2() {
		click1.click();	
	}
	public void clikchkb() {
		clickChk.click();	
	}
	public void serch() {
		search.click();	
	}
	
}

