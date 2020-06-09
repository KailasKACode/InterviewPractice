package SeleniumPractice;

import org.testng.annotations.*;

public class TestNGDemo2 {
	@BeforeClass
	public void m600() {
		System.out.println("Beforeclass m600");

	}
	
	@BeforeClass
	public void m601() {
		System.out.println("Beforeclass m601");

	}
	
	@BeforeClass
	public void m602() {
		System.out.println("Beforeclass m602");

	}
	
	@BeforeClass
	public void m603() {
		System.out.println("Beforeclass m603");

	}

	@BeforeTest
	public void m67() {
		System.out.println("BeforeTest m67");

	}
	@BeforeTest
	public void m68() {
		System.out.println("BeforeTest m68");

	}

	@BeforeTest
	public void m69() {
		System.out.println("BeforeTest m69");

	}


	@AfterClass
	public void m60() {
		System.out.println("AfterClass m67");

	}
	
	@AfterClass
	public void m61() {
		System.out.println("AfterClass m61");

	}
	
	@AfterClass
	public void m62() {
		System.out.println("AfterClass m62");

	}

	@BeforeSuite
	public void m2() {
		System.out.println("Before Suite m2");

	}


	@BeforeSuite
	public void m3() {
		System.out.println("Before Suite m3");

	}

	@BeforeSuite
	public void m0() {
		System.out.println("Before Suite m0");

	}
	@BeforeMethod
	public void m11() {
		System.out.println("Before Methods m1001");

	}

	@AfterSuite
	public void m79() {
		System.out.println("After Suite m79");

	}
	
	@AfterSuite
	public void m80() {
		System.out.println("After Suite m80");

	}
	@AfterSuite
	public void m81() {
		System.out.println("After Suite 81");

	}

	@Test
	public void m5() {
		System.out.println("Test m5");

	}

	@Test
	public void m7() {
		System.out.println("Test m7");

	}

	@Test
	public void m4() {
		System.out.println("Test m4");

	}

	@AfterTest
	public void m100() {
		System.out.println("After Test m100");

	}
	
	@AfterTest
	public void m101() {
		System.out.println("After Test m101");

	}
	
	@AfterTest
	public void m102() {
		System.out.println("After Test m102");

	}
	
	@AfterTest
	public void m103() {
		System.out.println("After Test m103");

	}

	@AfterMethod
	public void m1001() {
		System.out.println("After Methods m1001");

	}

}
