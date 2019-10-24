package demo;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoTest1 {
		
	 Logger logger = Logger.getLogger(demoTest1.class.getName());
	 
	 
	 @BeforeTest
	    public void start_log() {
			PropertyConfigurator.configure("./log4j.properties");
		}
	    
	
	@Test(groups={"unit"})
	public void add() {
		logger.info("----------this is info messege-------");
		System.out.println("This is addition method1");
	}
	
	@Test(groups={"unit"})
	public void sub() {
		logger.trace("----------this is trace messege-------");
		System.out.println("This is subtraction method1");
	}
	
	@Test(groups={"anup"})
	public void mul() {
		logger.error("----------this is error messege-------");
		System.out.println("This is multiplication method1");
	}
	
	@Test
	public void div() {
		logger.fatal("----------this is fatal messege-------");
		System.out.println("This is division method1");
	}
	
	@Test
	public void all_methods() {
		logger.debug("----------this is fatal messege-------");
		System.out.println("This is division all_methods");
	}

}
