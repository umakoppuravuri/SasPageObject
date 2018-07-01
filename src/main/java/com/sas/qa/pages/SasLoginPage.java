package com.sas.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sas.qa.base.TestBase;

public class SasLoginPage extends TestBase {
	
	//Page Factory or object repo
	@FindBy(id="user-profile")
	@CacheLookup
	WebElement loginsighup;
	
	@FindBy(xpath=".//input[@id='Loginemail']")
	WebElement username;
	
	@FindBy(xpath=".//input[@id='Loginpassword']")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	@FindBy(id="user-profile")
	WebElement loginsignup;
	
	@FindBy(xpath=".//button[@id='one-way']")
	WebElement Onewaylink;
	
	@FindBy(id="origin")
	WebElement FromTextbox;
	
	@FindBy(id="destination")
	WebElement ToTextbox;
	
	@FindBy(xpath="//button[@id='search-button' and @aria-label='aria-label']")
	WebElement SearchButton;
	
	
	public SasLoginPage(){
		PageFactory.initElements(driver,this);
	}
	//Actions
		public String ValidateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean PageImage(){
			return login.isDisplayed();
		}
		
		public void login_sighup()
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginsighup);
		}
		public void Login(String un,String pw){
			
			username.sendKeys(un);
			password.sendKeys(pw);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", login);
			
			return;
		}
		public void OneWaylink(){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", Onewaylink);
		}
		
		public void OneWayTrip(String from,String to){
			FromTextbox.sendKeys(from);
			//driver.findElement(By.xpath("//ul[@class='airport-list origin-list-items']")).click();
			ToTextbox.sendKeys(to);
			
			SearchButton.click();
		}

}
