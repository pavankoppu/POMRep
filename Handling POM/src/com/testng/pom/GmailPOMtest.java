package com.testng.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.testng.pages.GmailPOM;

public class GmailPOMtest {
	
//webdriver
	WebDriver driver;
	
	
  @Test
  public void f() {
	  driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://www.gmail.com");
      
      GmailPOM objlogin = new GmailPOM(driver);
      objlogin.loginToGmail("testuser@gmail.com", "abc");
      
      
  }
}
