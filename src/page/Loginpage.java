package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBTN;
		
		//intialization
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public void setusername(String un) {
			unTB.sendKeys(un);
		}
		public void setPassWord(String pw) {
			pwTB.sendKeys(pw);
		}
		public void clickLogin()
		{
			 LoginBTN.click();
}}