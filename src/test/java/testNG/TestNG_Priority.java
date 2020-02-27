package testNG;

import org.testng.annotations.Test;

public class TestNG_Priority {
	@Test(priority = 1)
	public void test1(){
		System.out.println("this is test1");
	}
	@Test(priority = 3)
	public void test2() {
		System.out.println("this is test2");
	}
	@Test(priority = 2)
	public void test3() {
		System.out.println("this is test3");
	}
}
