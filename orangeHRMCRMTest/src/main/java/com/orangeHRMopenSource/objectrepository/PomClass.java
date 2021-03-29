package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMopenSource.generics.Baseclass;

public class PomClass extends Baseclass{
		@FindBy(id="txtUsername")
		private WebElement untbx;
		
		
		@FindBy(id="txtPassword")
		private WebElement pwdtbx;
		
		
		@FindBy(xpath="//input[@id='btnLogin']")
		private WebElement lgn;
		
		public PomClass(WebDriver driver) {
			PageFactory.initElements(driver,this);
		
		}
		public void login(String user) {
			untbx.sendKeys(user);
		}
		
		public void password(String pwd) {
			pwdtbx.sendKeys(pwd);
		}
		
		
		public void lgnclick() {
			lgn.click();
	}


}
