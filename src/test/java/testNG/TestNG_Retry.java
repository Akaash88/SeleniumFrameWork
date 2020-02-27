package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Retry {
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test2( ) {
		System.out.println("failed test");
		Assert.assertTrue(false);
	}
}
