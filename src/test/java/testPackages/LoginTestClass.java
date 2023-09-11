package testPackages;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackages.Login_Page;
import testUtility.FetchDataFromFile;












public class LoginTestClass extends BaseClass
{
	            Login_Page login;
	            FetchDataFromFile  r;
     
			    @BeforeMethod
		    	public void beforeMethod()
    	        {
	    		  login =new Login_Page(driver);//method 1
    		       System.out.println("beforeMethod of Class1");
		    	} 
	    		
			@Test
	    	public void VerifyFunctionalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException
		    	{
				
				logger= report.createTest("verify login functionality with correct data");
				
			//	 Login_Page login =new Login_Page(driver); //method 2 
		    	SoftAssert s= new SoftAssert ();
	    	//	login.sendUserName(r.fetchDataFromFile(1, 0));
	    	//	login.sendPassword(r.fetchDataFromFile(1, 1));
	    	    login.sendUserName("Admin");
    		    login.sendPassword("admin123");	
		    	login.ClickOnLoginButton();
	    		Thread.sleep(4000);
//	    		String CurrentURL = driver.getCurrentUrl();
//	    		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	         
	    		boolean result =login.CheckVisibilityOfAdminTab();
	    	//	s.assertEquals(CurrentURL, ExpectedURL);
		    	
	    		WebElement el = driver.findElement(By.xpath("//img[@alt=\"client brand logo\"]//parent::div//parent::a")); //method 1
	    	//	WebElement el = driver.findElement(By.xpath("//img[@alt=\"client brand logo\"]/ancestor::a")); //method -2 optional to find element
	    		File source =el.getScreenshotAs(OutputType.FILE);
	    		File dest =new File("D:\\APPII\\MAVEN PROJECT\\test-output\\Screenshot\\temp.png");
	    		FileHandler.copy(source, dest);
	    		
	    		System.out.println("SoftAssert is executed ");
		    	Thread.sleep(3000);
		    	Assert.assertTrue(result);
	    		System.out.println("VerifyFunctionalityWithCorrectData");
	    	    s.assertAll();
	    	    logger.pass("test case is pass");  //it will add in logger that test case is pass
		    	}
		    	@Test
		    	public void VerifyFunctionalityWithInCorrectData()
		    	{
		          
		    	
//		    		    login.sendUserName("Admin");
//		    		    login.sendPassword("admin123");	
//				    	login.ClickOnLoginButton();
		    	
		    	 
		    	 System.out.println("VerifyFunctionalityWithInCorrectData");
		    	 Assert.fail();
		    	 
		   	     }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


