package Sas.info.baggage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sas.qa.base.TestBase;
import com.sas.qa.pages.BaggageallowanceTest1;
import com.sas.qa.pages.LoginPage;
import com.sas.qa.util.TestUtil;

public class SasTest1 extends TestBase {
	
	BaggageallowanceTest1 baggage;
	@BeforeMethod
	public void setUp(){
		Initialization();
		baggage = new BaggageallowanceTest1();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException{
		//driver.findElement(By.xpath("//input[@class='wc-shellinput' and @aria-label='Type your message...']")).sendKeys("Baggage allowance");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		baggage.TypeYourMessage("Baggage allowance");
				
		baggage.Yesbutton();
		baggage.IHavePnr();
		baggage.TypeYourMessage("v5nl22");
	
		Thread.sleep(9000);
		baggage.TypeYourMessage("pascotto");
	
		
	}
	

	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
}
