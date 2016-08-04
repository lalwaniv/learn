package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {
	
	WebDriver driver;
	public void initialize(){
		System.setProperty("webdriver.chrome.driver", "/home/suren/Downloads/chromedriver");
    	this.driver = new ChromeDriver();
    	driver.manage().window().maximize();
	}
	
	public void getPage(String url){
		driver.get(url);
	}
	
	public boolean clickThermometer(){
		WebElement topmenu = driver.findElement(By.xpath(".//*[@id='navigation-top-cat-label-336']"));
		Actions action = new Actions(driver);
		action.moveToElement(topmenu).build().perform();
		WebElement submenu = driver.findElement(By.xpath(".//*[@id='navigation-top-cat-label-1308']"));
		action.moveToElement(submenu).build().perform();
		WebElement childmenu = driver.findElement(By.xpath(".//*[@id='navigation-top-cat-label-1764']"));
		action.moveToElement(childmenu).click().build().perform();	
		 return driver.getTitle().toLowerCase().contains("thermometer");
	}
	
	public void searchBar(String search){
		driver.findElement(By.cssSelector("#gh-ac")).clear();
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys(search);
		driver.findElement(By.cssSelector("#gh-btn")).click();
		
	}
	
	public int listingCount(){
		String l = driver.findElement(By.cssSelector(".listingscnt")).getText();
		int i = Integer.parseInt(l.replaceAll("[\\D]", ""));
		return i;
	}
	
	public boolean categoryExists(){
		return driver
				.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/div[2]/div[1]/ul[2]/li[2]/a"))
				.getAttribute("href")
				.contains("watches");
	}
	
	public void quit(){
		driver.quit();
	}
	

}
