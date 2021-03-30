package com.flipkart.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.flipkart.objectrepository.Loginpage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	}
	public WebDriver driver;
	public FileLib f= new FileLib();
	WebdriverCommonLib w= new WebdriverCommonLib();
	
	@BeforeTest
	 public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		driver.get(f.getPropertyValue("url"));
		String n = f.getPropertyValue("nmbr");
		String p = f.getPropertyValue("pwd");
		
		Loginpage page= new Loginpage(driver);
		page.getmobile(n);
		page.getpswd(p);
		page.getlgnbtn();
	}	
		
		@AfterTest
		public void closeBrowser() {
			driver.close();

	
		
	}
	
	

}
