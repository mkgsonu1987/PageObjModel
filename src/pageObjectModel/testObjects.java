/**
 * 
 */
package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manishg
 *
 */
public class testObjects {
	WebDriver driver;
	
	
	By loginbutton = By.linkText("Log In");
	By username = By.className("form-text-input");
	By password = By.id("usernameOrEmail");
	By submit = By.xpath("//button[@class='button form-button is-primary']");
	
	public testObjects(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void hitLogin()
	{
		driver.findElement(loginbutton).click();
	}

	public void sendUsername()
	{
		driver.findElement(username).sendKeys("mkgsonu.1987@gmail.com");
	}
	public void sendPassword()
	{
		driver.findElement(password).sendKeys("Welcome-01");
	}
	public void logMEin()
	{
		driver.findElement(submit).click();;
	}

}
