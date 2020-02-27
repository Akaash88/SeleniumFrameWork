package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;

@Listeners(listeners.TestngListeners.class)
public class Testng_listener1 {
	@Test
	public void test1() {
		System.out.println("this is test1");
	}
	@Test
		public void test2() {
			System.out.println("this is test2");
			AssertJUnit.assertTrue(false);
			
	}
	@Test
		public void test3() {
			System.out.println("this is test3");
			throw new SkipException("this test is skiped");
}
		
}