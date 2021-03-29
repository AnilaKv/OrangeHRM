package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMopenSource.generics.Baseclass;

public class Logout extends Baseclass{
	@FindBy(id="welcome")
	private WebElement wel;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgt;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void welcome() {
		wel.click();
	}
	
	
	
	public void lout() {
		
		lgt.click();
	}

}
