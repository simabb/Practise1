package patModule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPatModule {

	
	WebDriver driver;
	
	  @BeforeClass
	  public void invokeurl() {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Mukesh\\Documents\\Selenium\\selenium-java-3.0.1\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		  	
		  
		  driver= new FirefoxDriver();
		  
			 driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
	  
			 driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	  }
			 
			  @Parameters({"abc"})			
	 
	
			  
			  @Test(priority=2)
			  public void navProfile() throws InterruptedException
			  {
     Navigation nav = new Navigation(driver);
     nav.ClickProfile();
     
			  }			  
			  
//	     nav.navigateProfile();
	  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			  @Parameters({"abc"})
@Test (priority =3, dependsOnMethods= "navProfile")
			  public void verifyPatModule1(@Optional("xyz") String abc) throws InterruptedException
		  
			  {
			  PatProfile pP= new PatProfile(driver);
	 //    pP.ClickProfile();
	     pP.profileText();
	     pP.verifyFname();
	     pP.verifyLname();
	     pP.verifyLicense();
	    
		  
		  
		  
		  
	  }
}
