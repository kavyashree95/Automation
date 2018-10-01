package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutpage {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
			public LogOutpage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			public void clickLogOut()
			{
				 logout.click();
	}}
	


