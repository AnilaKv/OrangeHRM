package com.orangeHRMopenSource.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String value =p.getProperty(key);
		return value;
	}

	
	}


