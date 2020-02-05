package stepDefinitions;

import eCommTests.eCommCucumber.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseDriver{
	
	@Before("@eCommTest")
	public void setUp() {
		getDriver();
	}
	
	@After("@eCommTest")
	public void tearDown() {
		driver.close();
	}
	
	@Before("@SourceCodeTest")
	public void setUp1() {
		getDriver();
	}
	
	@After("@SourceCodeTest")
	public void tearDown1() {
		driver.close();
	}
	
	@Before("@SourceCodeTest1")
	public void setUp3() {
		getDriver();
	}
	
	@After("@SourceCodeTest1")
	public void tearDown3() {
		driver.close();
	}
	
	@Before("@SortingTest")
	public void setUp2() {
		getDriver();
	}
	
	@After("@SortingTest")
	public void tearDown2() {
		driver.close();
	}
	
	@Before("@eCommTest1")
	public void setUp4() {
		getDriver();
	}
	
	@After("@eCommTest1")
	public void tearDown4() {
		driver.close();
	}
	
	@Before("@RegTest")
	public void setUp5() {
		getDriver();
	}
	
	@After("@RegTest")
	public void tearDown5() {
		driver.close();
	}

}
