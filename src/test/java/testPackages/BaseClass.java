package testPackages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import testUtility.Screenshot;
import testUtility.StaticBrowser;









public class BaseClass 
{
	static WebDriver driver;
	public static ExtentReports report;    // to call wherever required so we  called public static 
	public static ExtentHtmlReporter extent;
    public static ExtentTest logger;
     @Parameters({"browser"})
	 @BeforeTest	
	 public void beforeTest (String browser) 
	{
    	 report =new ExtentReports();    // object
    	 extent = new ExtentHtmlReporter("test-output"+File.separator+"Report"+File.separator+"HrmThread"+System.currentTimeMillis()+".html");
		 report.attachReporter(extent);	
   	     WebDriver driver=StaticBrowser.openBrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	     this.driver =driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()== ITestResult.FAILURE)
		{
	    String path =  Screenshot.CapturPageScreenShot(driver);   // return path from base class
	    logger.fail("test case is fail", MediaEntityBuilder.createScreenCaptureFromPath(path).build()); 
	    //path return from base class    //markup language --- html , xml   // we add build bcoz multiple method is adding.
	    
		}
		report.flush();   //update all report whatever lister listen
	//	logger.pass("test case is pass");  //only when it is needed to knw test case is failed or pass
		
		System.out.println("Nothing");  // checked for git bash only
		
		
	}
	
	
	@AfterTest
	public void afterTest()
	{
	       driver.quit();
	}
}
