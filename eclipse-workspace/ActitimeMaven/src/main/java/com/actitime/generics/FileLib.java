package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileLib {
	public String getPropertyvalue(String key) throws IOException {
	FileInputStream fis= new FileInputStream("./src/test/resources/data/commonsdata.property");
	Properties p= new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;

}
}