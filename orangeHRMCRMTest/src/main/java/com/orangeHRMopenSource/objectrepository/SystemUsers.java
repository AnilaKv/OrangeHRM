package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMopenSource.generics.Baseclass;

public class SystemUsers extends Baseclass {
	@FindBy(id="btnAdd")
	private WebElement add;
	
	
	public SystemUsers(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void add() {
		add.click();
	}

}
