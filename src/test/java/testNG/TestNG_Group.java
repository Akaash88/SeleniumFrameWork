package testNG;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTest"})
public class TestNG_Group {
	@Test(groups = {"sanity"})
	public void test1() {
	System.out.println("This is test1");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("This is test2");
		}
	@Test(groups = {"sanity","regression"})
	public void test3() {
		System.out.println("This is test3");
		}
	@Test(groups = {"windows.regression"})
	public void test4() {
		System.out.println("This is test4");
		}
	@Test(groups = {"linux.regression"})
	public void test5() {
		System.out.println("This is test5");
		}
	@Test(groups = {"windows.smoke"})
	public void test6() {
		System.out.println("This is test6");
		}

}
