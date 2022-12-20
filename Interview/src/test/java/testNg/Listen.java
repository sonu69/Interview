package testNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed - "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Passed - "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Passed - "+result.getName());
	}


}
