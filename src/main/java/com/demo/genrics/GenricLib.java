package com.demo.genrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenricLib {

	public static String dirPath = System.getProperty("user.dir");
	public static String osname = System.getProperty("os.name");

	public static String getValue(String filepath,String key) {
		String value=null;
		try {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(filepath);
		p.load(fis);
		value=p.getProperty(key);
		}
		catch(IOException e) {
			System.out.println("file not found at specified location4");
		}
		
		
		return value;
	}

}
