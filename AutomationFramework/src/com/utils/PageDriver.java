package com.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDriver {
	WebDriver driver;
	public PageDriver(){
	 	System.setProperty("webdriver.chrome.driver", "/home/suren/Downloads/chromedriver");
    	this.driver = new ChromeDriver();
  }
	public void get(String url){
	  	driver.manage().window().maximize();
	    driver.get(url);
	}
	
	public WebElement findElement(By by){
		return driver.findElement(by);
	}
	
	public List<WebElement> findElements(By by){
		return driver.findElements(by);
	}
	
	public void pdImplicitWait(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}
	public void quit(){
		driver.quit();
	}
}
