package patModule;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PatLogin {
	WebDriver driver;
//	private WebElement verifyusername;
//	private String actualusername;
//	private String expectedusername;
	public PatLogin(WebDriver driver){
		this.driver= driver;
		
	}
	
	public void loginPatClick() throws InterruptedException
	{
		WebElement patLog = driver.findElement(By.linkText("Patient Login"));
		patLog.click();
		driver.findElement(By.linkText("Login")).click();
		 Thread.sleep(10000);
		}
	public void verifyUserNameTab()
	{
		
	WebElement   verifyusername = driver.findElement(By.className("uname"));
				String actualusername = verifyusername.getText();
		//String expectedusername = "Username";
		
	Assert.assertEquals(actualusername,"Username");
	}
	public void loginSubmit()
	{
	
	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("TomBrady_123");
	
	WebElement password= driver.findElement(By.id("password"));
	password.sendKeys("TomBrady@123");
	
	driver.findElement(By.name("submit")).click();
	}
	public void verifyNametitle()
	{
		WebElement nameTitle= driver.findElement(By.linkText("TomBrady_123"));
		String checkNameTitle = nameTitle.getText();
		System.out.println("The title name is" +checkNameTitle);
		Assert.assertEquals( checkNameTitle ,"TomBrady_123");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
	
	
