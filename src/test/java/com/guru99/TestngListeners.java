package com.guru99;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestngListeners  implements ITestNGListener {
	
	
	 public void onTestStart(ITestResult result) {
	       
	    }
	    public void onTestSuccess(ITestResult result) {
	    	Guru99Bank_Util.eTest.pass("Test is passed");
	    }
	    public void onTestFailure(ITestResult result) {
	        
	    }
	    public void onTestSkipped(ITestResult result) {
	       
	    }
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        
	    }
	    public void onStart(ITestContext context) {
	       Guru99Bank_Util.rep.createTest("guru99");
	    }
	    public void onFinish(ITestContext context) {
	    	Guru99Bank_Util.rep.flush();
	    }
	}

