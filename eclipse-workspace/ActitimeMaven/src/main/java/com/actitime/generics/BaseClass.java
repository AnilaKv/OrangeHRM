package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.objectrepository.LoginPage;
//import com.actitime.objectrepository.FileLib;
import com.actitime.objectrepository.Logout;

public class BaseClass {
	static{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	public WebDriver driver;
	FileLib f= new FileLib();
	
	@BeforeTest
	public void openBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod
	public void login() throws IOException {
		driver.get(f.getPropertyvalue("url"));
		String user = f.getPropertyvalue("username");
		String pwd = f.getPropertyvalue("password");
		
		LoginPage l= new LoginPage(driver);
		l.getUsername(user);
		l.getPassword(pwd);
		l.clickLogin();
		
	}
	
	@AfterMethod
	public void logout() {
		Logout o=new Logout(driver);
		o.clickLogout();
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
