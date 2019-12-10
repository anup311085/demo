package demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoTest4 {
	Logger logger = Logger.getLogger(demoTest4.class.getName());
	
	 @BeforeTest
	    public void start_log() {
			PropertyConfigurator.configure("./log4j.properties");
		} 
		
	@Test
	public void add() {
		logger.info("----------this is info messege-------");
		System.out.println("This is addition method4");
	}
	
	@Test
	public void sub() {
		System.out.println("This is subtraction method4");
	}
	
	@Test
	public void mul() {
		System.out.println("This is multiplication method4");
	}
	
	@Test
	public void div() {
		System.out.println("This is division method4");
	}

}
