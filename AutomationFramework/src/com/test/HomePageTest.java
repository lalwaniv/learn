package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.base.BaseTest;
import com.pages.HomePage;
import com.utils.PageDriver;

public class HomePageTest extends BaseTest{
	HomePage hp;
	
	@BeforeClass
	public void initialize(){
		driver = new PageDriver();
		hp = new HomePage(driver);	
	}
	
	@Test
	public void testCountSocialIcons(){
		int actual = hp.countSocialElements();
		Assert.assertEquals(actual,4);			
	}
	
	@Test
	public void testCountSlider(){
		int actual = hp.countSlider();
		Assert.assertEquals(actual,6);			
	}
	
	@Test
	public void testLoginClick(){
		String actual = hp.clickLogin();
		Assert.assertEquals(actual, "http://www.whiteboxqa.com/login.php");
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}
}
