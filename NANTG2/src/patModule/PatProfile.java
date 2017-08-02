package patModule;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class PatProfile {
	WebDriver driver;
	public PatProfile(WebDriver driver)
	{
		this.driver= driver;
	}
//	public void ClickProfile(){
//		driver.findElement(By.partialLinkText("Profile")).click();
//	}
	public String  profileText() 
	{
//  
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	Thread.sleep(30000);	
	//	WebElement actualverifyPatProf= driver.findElement(By.className("username"));
			String actualverifyPatProf = driver.findElement(By.xpath("//a/span[ @class= 'username']")).getText();//Retrieve the text b
		System.out.println("the actual label is "+ actualverifyPatProf);
		Assert.assertEquals(actualverifyPatProf, "TomBrady_123");
return actualverifyPatProf ;
	}
	public String  verifyFname() 
	{
		WebDriverWait wait= new WebDriverWait(driver,60);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fname")));
		  
		//Thread.sleep(30000);	
	//	String fname1 = driver.findElement(By.id("fname")).getText();
		String fname1 =  driver.findElement(By.id("fname")).getAttribute("value");
		//String fname1 = driver.findElement(By.name("firstname")).getText();

		System.out.println("the first name is  " + fname1);

		Assert.assertEquals(fname1, "Tom");
		return fname1;
			}

	public String verifyLname()
	{
	String lname= driver.findElement(By.id("lname")).getAttribute("value");
	//	String lname1 = driver.findElement(By.linkText("Brady")).getText();
		System.out.println("the last name is  " + lname);
		
		assertEquals(lname, "Brady");
		return lname;
		}
	public String verifyLicense(){
		//String license=driver.findElement(By.id("licn")).getText();
		String license  = driver.findElement(By.id("licn")).getAttribute("value");
		assertEquals(license, "13309876");
		System.out.println("the license is  " + license);
	return license ;
	}




}
