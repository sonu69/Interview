package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

class BaseClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}


	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}



	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
