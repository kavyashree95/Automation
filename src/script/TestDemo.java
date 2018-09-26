package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import generic.BaseTest;
public class TestDemo extends BaseTest{
	@Test
	public void test() {
		Reporter.log("test....", true);
	}
	@Test
	public void testB() {
		Reporter.log("testb......",true);
		Assert.fail();
	}
}
