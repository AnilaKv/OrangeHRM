package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

public class Logout extends BaseClass{
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout() {
		logout.click();
	}

}
