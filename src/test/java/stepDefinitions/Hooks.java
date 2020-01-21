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


	@Before("@SourceMetaTag")
	public void setUp2() {
		getDriver();
	}

	@After("@SourceMetaTag")
	public void tearDown2() {
		driver.close();
	}



}
