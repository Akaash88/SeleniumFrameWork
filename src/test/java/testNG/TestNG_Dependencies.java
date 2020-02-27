package testNG;

import org.testng.annotations.Test;

public class TestNG_Dependencies {
	
	//@Test(dependsOnMethods = {"test2","test3"})
	@Test(dependsOnGroups = "sanity1")
	public void test1() {
	System.out.println("i am inside test1");
	}
	@Test(groups = "sanity1")
	public void test2() {
		System.out.println("i am inside test2");
		}
	@Test()
	public void test3() {
		System.out.println("i am inside test3");
		}
	@Test(dependsOnMethods = "test1")
	public void test4() {
		System.out.println("i am inside test4");
		}

}
