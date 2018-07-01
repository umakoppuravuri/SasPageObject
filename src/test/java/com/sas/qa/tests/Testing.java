package com.sas.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sas.qa.base.TestBase;
import com.sas.qa.pages.SasLoginPage;
import com.sas.qa.util.TestUtil;

public class Testing extends TestBase {
	SasLoginPage loginpage; 
	String sheetName = "OneWaytrip";
	
	public Testing(){
		super();
	}
	@BeforeMethod
	public void before(){
		Initialization();
		 loginpage = new SasLoginPage();
	}
	
	@Test(priority=1)
	public void LoginTestCase(){
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Book cheap flight tickets | SAS");
	//Assert.assertEquals("Page Title is Not Matched", "Book cheap flight tickets | SAS", title);
	
		loginpage.login_sighup();
				 
		loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
						
	}
	
	/*@DataProvider
	public Object[][] SastestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2, dataProvider="SastestData")
	public void OneWayTrip(String from , String To){
		loginpage.login_sighup();
		loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		loginpage.OneWaylink();
		loginpage.OneWayTrip("Stockholm ARN","Oslo OSL");
		loginpage.OneWayTrip(from, To);
	}*/
	
	@AfterMethod
	public void after(){
		driver.quit();
	}
	
}
