package com.actitime.testscripts;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.LoginPage;
import com.actitime.objectrepository.ViewtimeTrack;

public class Test extends BaseClass {
	@org.testng.annotations.Test
	public void test1() {
		
		ViewtimeTrack v= new ViewtimeTrack(driver);
		v.getview();
		
	}

}
