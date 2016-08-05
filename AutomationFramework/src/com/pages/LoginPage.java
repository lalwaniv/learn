package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.utils.PageDriver;

public class LoginPage extends BasePage {
	
	public LoginPage(PageDriver driver){
		super(driver);
		driver.get("http://www.whiteboxqa.com/login.php");
	}
	public String invalidLogin(String uName , String pwd){
		String error = null;
		driver.findElement(By.cssSelector("#username")).sendKeys(uName);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login")).click();
		driver.pdImplicitWait();
		error = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/article/h6")).getText();
		return error;
	}
}
