package com.test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.Ebay;


public class RightStartTest {
	
Ebay ebay = new Ebay();
	
	@BeforeClass
	public void initialize(){
		ebay.initialize();
		ebay.getPage("http://www.rightstart.com");	
	}
	
	@Test
	public void testThermometer(){
		boolean actual = ebay.clickThermometer();
		Assert.assertEquals(actual,true);
	}
	
	@AfterClass
	public void quitpage(){
		ebay.quit();
	}

}
