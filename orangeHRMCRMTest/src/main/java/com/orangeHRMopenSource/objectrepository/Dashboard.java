package com.orangeHRMopenSource.objectrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMopenSource.generics.Baseclass;

public class Dashboard extends Baseclass{
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement admin;
	
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement usrmngmnt;
	
	
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement user;

	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void useradmin(WebDriver driver) throws InterruptedException {
		Actions a= new Actions(driver);
		a.moveToElement(admin).perform();
		Thread.sleep(2000);
	}	
	public void umanagement(WebDriver driver) throws InterruptedException {
		Actions a1= new Actions(driver);
		a1.moveToElement(usrmngmnt).perform();
		Thread.sleep(2000);
	}	
		
	public void uuser() throws InterruptedException {
		
	user.click();
	Thread.sleep(2000);
	}
	
	
	}
