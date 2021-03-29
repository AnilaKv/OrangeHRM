package com.orangeHRMopenSource.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.generics.Baseclass;
import com.orangeHRMopenSource.objectrepository.AddUser;
import com.orangeHRMopenSource.objectrepository.Dashboard;
import com.orangeHRMopenSource.objectrepository.PomClass;
import com.orangeHRMopenSource.objectrepository.SystemUsers;
//@Listeners(com.orangeHRMopenSource.generics.Listenerimplementation.class)
public class LoginTest extends Baseclass
{
	@Test
	public void t1() throws InterruptedException, AWTException{
	//Assert.fail();	
	Dashboard d=new Dashboard(driver);
	d.useradmin(driver);
	d.umanagement(driver);
	d.uuser();
	
	Thread.sleep(2000);
	SystemUsers u= new SystemUsers(driver);
	u.add();
	Thread.sleep(2000);

	AddUser a= new AddUser(driver);
	a.ur();
	Thread.sleep(2000);
	a.getename("anila");
	Thread.sleep(2000);
	a.getusern("anu");
	Thread.sleep(2000);
	a.status();
	Thread.sleep(2000);
	a.getpwd("abc123");
	Thread.sleep(2000);
	a.getcnfrmpwd("abc123");
	Thread.sleep(2000);
	a.sclick();
	
	
		
		
	}
}

