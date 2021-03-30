package com.flipkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.Baseclass;

public class Loginpage extends Baseclass  {
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobile;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pswd;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement lgnbtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void getmobile(String mob) {
		mobile.sendKeys(mob);
	}
	
	public void getpswd(String pwd) {
		pswd.sendKeys(pwd);
	}
	
	public void getlgnbtn() {
		lgnbtn.click();
	}

}
