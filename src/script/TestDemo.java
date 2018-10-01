package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.Loginpage;

public class TestDemo extends BaseTest{
 @Test
 public void testA() throws InterruptedException {
	String data = Utility.getXLData(INPUT_PATH, "sheet1",0,0);
	Reporter.log("Data:"+data,true);
	 
	int r = Utility.getXLRowCount(INPUT_PATH, "sheet1");
	Reporter.log("Row:"+r,true);
	//Assert.fail();
	
	Loginpage l = new Loginpage(driver);
	String un = Utility.getXLData(INPUT_PATH, "sheet1",1,0);
	l.setusername(un);
	Thread.sleep(1000);
	String pw = Utility.getXLData(INPUT_PATH, "sheet1",1,1);
	l.setPassWord(pw);
	Thread.sleep(1000);
	l.clickLogin();
	
	
//	String p=Utility.getPhoto(driver,PHOTO_PATH);
//	Reporter.log("Photo:"+p,true);	
 }
}