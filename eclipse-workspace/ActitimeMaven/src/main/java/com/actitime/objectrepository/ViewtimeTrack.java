package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewtimeTrack {
	@FindBy(xpath="//a[.='View Time-Track']")
	private WebElement view;
	
	public ViewtimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getview() {
		view.click();
	}

}
