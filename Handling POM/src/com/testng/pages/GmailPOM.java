package com.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GmailPOM {
	WebDriver driver;
	By username = By.id("Email");
	By password = By.id("Passwd");
	By next = By.id("next");
	By login = By.id("signIn");
	
	public GmailPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	//Set username in text box
	public void setUserName(String struname)
	{
		driver.findElement(username).sendKeys(struname);
	}
	//Set password in textbox
	
	public void clickNext()
	{
		driver.findElement(next).click();
	}
	
	
	public void setPwd(String strpwd)
	{
		driver.findElement(password).sendKeys(strpwd);
	}
	
	
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	public void loginToGmail(String struname, String strpwd)
		{
			this.setUserName(struname);	
			this.clickNext();
			this.setPwd(strpwd);
			this.clickLogin();
	
		}
	
}

//driver.findElement(username).sendKeys(struname);
//	driver.findElement(password).sendKeys(strpwd);
//	driver.findElement(login).click();
