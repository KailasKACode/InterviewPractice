package SeleniumPractice;

import org.testng.annotations.*;

public class TestNGDemo {
	@BeforeSuite
	public void m1() {
		System.out.println("m1");
	}

	@BeforeTest
	public void m2() {
		System.out.println("m2");

	}

	@BeforeClass
	public void m3() {
		System.out.println("m3");

	}

	@BeforeMethod
	public void m4() {
		System.out.println("m4");

	}

	@Test
	public void m5() {
		System.out.println("m5");

	}

	@AfterMethod
	public void m6() {
		System.out.println("m6");

	}

	@AfterClass
	public void m7() {
		System.out.println("m7");

	}

	@AfterTest
	public void m8() {
		System.out.println("m8");

	}

	@AfterSuite
	public void m9() {
		System.out.println("m9");

	}

}
