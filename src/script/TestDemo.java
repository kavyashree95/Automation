package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LogOutpage;
import page.Loginpage;

public class TestDemo extends BaseTest{
 @Test(priority=1,groups= {"login","smoke"})
 public void testA() throws InterruptedException {
	String data = Utility.getXLData(INPUT_PATH, "sheet1",0,0);
	Reporter.log("Data:"+data,true);
	 
	int r = Utility.getXLRowCount(INPUT_PATH, "sheet1");
	Reporter.log("Row:"+r,true);
	//Assert.fail();
	
	Loginpage l = new Loginpage(driver);
	String sheet ="loginpage";
	String un = Utility.getXLData(INPUT_PATH, sheet,1,0);
	l.setusername(un);
	//Loginpage.setusername("admin");
	Thread.sleep(1000);
	String pw = Utility.getXLData(INPUT_PATH, sheet,1,1);
	l.setPassWord(pw);
	//Loginpage.setPassWord("manager");
	Thread.sleep(1000);
	l.clickLogin();
	Thread.sleep(2000);
	LogOutpage l2 = new LogOutpage(driver);
	l2.clickLogOut();
	
	
//	String p=Utility.getPhoto(driver,PHOTO_PATH);
//	Reporter.log("Photo:"+p,true);	
 }
}