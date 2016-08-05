package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.PageDriver;

public class LoginPageTest extends BaseTest {
	LoginPage lp;
	
	@BeforeClass
	public void initilize(){
		driver = new PageDriver();
		lp = new LoginPage(driver);
	}
	
	@Test
	public void testInvalidLogin(){
		String actString = lp.invalidLogin("reena","675");
		Assert.assertEquals(actString,"You have not registered.");
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}

}
