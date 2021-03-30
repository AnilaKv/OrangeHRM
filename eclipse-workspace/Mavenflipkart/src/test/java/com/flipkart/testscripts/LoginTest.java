package com.flipkart.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.generics.Baseclass;
import com.flipkart.objectrepository.Homepage;
import com.flipkart.objectrepository.Loginpage;

public class LoginTest extends Baseclass{
	@Test
	public void test() {
	Homepage h= new Homepage(driver);
	h.getlogin();
	}
	public void verifyTitle() throws IOException {
		Assert.assertEquals(driver.getTitle(), f.getPropertyValue("title"));
	}
	
	}



