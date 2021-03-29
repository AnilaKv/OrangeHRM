package com.orangeHRMopenSource.generics;


import java.io.IOException;
//import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectrepository.Logout;
import com.orangeHRMopenSource.objectrepository.PomClass;

public class Baseclass {
	static {
		System.setProperty("webdriver.gecko.driver","./src/main/resources/driver/geckodriver.exe");
	}
	public static WebDriver driver;
	public FileLib f= new FileLib();
	WebDriverCommonLib w= new WebDriverCommonLib();
	
	
	@BeforeTest
	public void openBrowser() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		//w.WaitForElement(driver);
	}
	
	
	@BeforeMethod
	public void login() throws IOException {
		String un=f.getPropertyValue("UN");
		String pw=f.getPropertyValue("PWD");
		driver.get(f.getPropertyValue("URL"));
		PomClass p= new PomClass(driver);
		p.login(un);
		p.password(pw);
		p.lgnclick();
	}
	
	
	@AfterMethod
	public void logout() {
		Logout l=new Logout(driver);
		l.welcome();
		l.lout();
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult arg) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
