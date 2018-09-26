package generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Result.class)

public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	public String URL =Utility.getPropertyValue(CONFIG_PATH,"URL");
	
	String ITO=Utility.getPropertyValue(CONFIG_PATH,"ITO");
	public long duration=Long.parseLong(ITO);
	static {
		System.setProperty(C_key, C_value);
		System.setProperty(G_key, G_value);
		}
	@BeforeMethod
	public void OpenApllication() {
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(duration,TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void CloseApplication() {
	driver.close();
}
}