package library;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class RetryAnalyzer implements IRetryAnalyzer {
 
  private int retryCount = 0;
  private static final int maxRetryCount = 3;
 

  public boolean retry(ITestResult result) {
    if (retryCount < maxRetryCount) {
    	System.out.println("Following test is failing===="+result.getName());
    	System.out.println("Retrying the test Count is=== "+ (retryCount+1));
      retryCount++;
      return true;
    }
    return false;
  }
}
