package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListerner implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failure :"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped :"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("test start :"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test success :"+result.getName());
		
	}


}
