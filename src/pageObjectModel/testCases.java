/**
 * 
 */
/**
 * @author manishg
 *To store properties of projects
 */
package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCases{
	
	@Test
	public void verifyLogin()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/");
		testObjects obj = new testObjects(driver);
		obj.hitLogin();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		obj.sendUsername();
		obj.sendPassword();
		obj.logMEin();
		
		
		
		
		
	}
	
	
}