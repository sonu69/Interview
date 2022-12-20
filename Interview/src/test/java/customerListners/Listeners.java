package customerListners;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, IExecutionListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started "+result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test - "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Capturing Screenshot for the Failed test -- "+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Test case skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
