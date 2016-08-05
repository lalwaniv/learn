package com.pages;
import com.utils.PageDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(PageDriver driver){
		super(driver);
		driver.get("http://www.whiteboxqa.com/");
	}
	
	public int countSocialElements(){
		List<WebElement> l;
		l = driver.findElements(By.cssSelector(".pull-right.social-icons>li"));
		return (l.isEmpty())?0:l.size();
	}
	
	//Home page slider count
	public int countSlider(){
		List<WebElement> l;
		l = driver.findElements(By.cssSelector(".flex-control-nav.flex-control-paging>li>a"));
		return (l.isEmpty())?0:l.size();
	}
	
	public String clickLogin(){
		String url = null;
		driver.findElement(By.cssSelector("#loginButton")).click();
		url = driver.getCurrentUrl();
		return url;
	}
	
	
}
