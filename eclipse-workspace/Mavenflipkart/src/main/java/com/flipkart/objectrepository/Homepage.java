package com.flipkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.Baseclass;

public class Homepage extends Baseclass {
	@FindBy(xpath="//a[.='Login']")
	private WebElement lgn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getlogin() {
		lgn.click();
	}

}
