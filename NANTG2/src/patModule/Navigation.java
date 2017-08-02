package patModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
	WebDriver driver;
	
	Navigation(WebDriver driver)
	{
		this.driver= driver;
	}
	public void ClickProfile(){
		driver.findElement(By.partialLinkText("Profile")).click();
	}
}


	//public String  profileText() 
//	{
//  
//	public void navigateProfile()
//	{
//		driver.findElement(By.partialLinkText("Profile")).click();
//		
//	}
//}
		
//	public PatProfile clickPatProfile() 
//	{
//		
//		//navigateToTab("Profile", driver);
//		WebElement verifyPP = driver.findElement(By.partialLinkText("Profile"));
//		//WebElement verifyPatProf =driver.findElement(By.cssSelector("a..firepath-matching-node > span.hidden-minibar")).click();
//	//	WebElement verifyPatProf = driver.findElement(By.xpath(""))
//		verifyPP.click();	
//		
//		return new PatProfile(driver);
////	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//	}
//
//}
