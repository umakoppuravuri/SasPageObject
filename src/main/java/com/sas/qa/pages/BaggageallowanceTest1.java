package com.sas.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sas.qa.base.TestBase;

public class BaggageallowanceTest1 extends TestBase {

	
	@FindBy(xpath="//input[@class='wc-shellinput' and @aria-label='Type your message...']")
	WebElement TypeYourMessage;
	
	@FindBy(xpath="//button[@type='button' and @title='yes']")
	WebElement Yes_BaggageAllowance;
	
	@FindBy(xpath="//button[@type='button' and @title='no']")
	WebElement No_BaggageAllowance;
	
	@FindBy(xpath="//button[@type='button' and @title='I have PNR']")
	WebElement IHavePNR;
	
	
	public void TypeYourMessage(String message) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		TypeYourMessage.sendKeys(message);
		Keyboard keyboard=((HasInputDevices) driver).getKeyboard();
	    keyboard.pressKey(Keys.ENTER);
	    Thread.sleep(3000);
	}
	
	public void EnterButton(){
		//WebElement.sendKeys(Keys.RETURN);
		Keyboard keyboard=((HasInputDevices) driver).getKeyboard();
	    keyboard.pressKey(Keys.ENTER);
	}
	public BaggageallowanceTest1() {
		PageFactory.initElements(driver, this);
	}
	
	public void Yesbutton(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", Yes_BaggageAllowance);
	}
	public void IHavePnr() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", IHavePNR);
    	Thread.sleep(6000);
	}
}
