package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRMopenSource.generics.Baseclass;

public class AddUser extends Baseclass{
	@FindBy(id="systemUser_userType")
	private WebElement userrole;
	
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement ename;
	
	
	@FindBy(id="systemUser_userName")
	private WebElement username;
	
	
	@FindBy(id="systemUser_status")
	private WebElement status;
	
	
	@FindBy(id="systemUser_password")
	private WebElement password;
	
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confrmpwd;
	
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	public AddUser(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void getename(String emp) {
			ename.sendKeys(emp);}
	public void getusern(String usrname) {
		username.sendKeys(usrname);}
	public void getpwd(String p) {
		password.sendKeys(p);}
	public void getcnfrmpwd(String c) {
		confrmpwd.sendKeys(c);
	}	
		
	public void ur() {
	Select s= new Select(userrole);
	s.selectByIndex(1);
	}
	
	
	public void status() {
	Select s1=new Select(status);
	s1.selectByIndex(0);
	}
	
	public void sclick() {
		save.click();	
	}

}
