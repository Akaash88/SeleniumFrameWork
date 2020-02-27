package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	@Test
	@Parameters("myName")
	public void test1(String name) {
		System.out.println("my name is " +name);
	}
	
	@Test(alwaysRun = true)
	@Parameters({"myName","myAge"})
	public void test2(String name, int age) {
		System.out.println("my name is " +name);
		System.out.println("age is " +age);
	}
	@Test
	@Parameters("myDob")
	public void test3(@Optional String dob) {
		System.out.println("my Dob is " +dob);
	}
	@Test
	@Parameters("myDob")
	public void test4(@Optional("August") String dob) {
		System.out.println("my Dob is " +dob);
	}
}

