package demo;

import org.testng.annotations.Test;

public class demoTest1 {
	
	@Test(groups={"unit"})
	public void add() {
		System.out.println("This is addition method1");
	}
	
	@Test(groups={"unit"})
	public void sub() {
		System.out.println("This is subtraction method1");
	}
	
	@Test(groups={"anup"})
	public void mul() {
		System.out.println("This is multiplication method1");
	}
	
	@Test
	public void div() {
		System.out.println("This is division method1");
	}
	
	@Test
	public void all_methods() {
		System.out.println("This is division all_methods");
	}

}
