package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getUsername(String un) {
		uname.sendKeys(un);
	}
	
	public void getPassword(String pw) {
		pwd.sendKeys(pw);
	}
	
	public void clickLogin() {
		login.click();
	}
			

}
