package testPackages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import testUtility.StaticBrowser;

public class TestClassTNG1 
{

	@BeforeClass
	public void beforeClass() 
	{
		 WebDriver driver =StaticBrowser.openBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		System.out.println("beforeClass of class 1");
			
	}
	
	@BeforeMethod
	public  void beforeMethod()
	{
		System.out.println("beforeMethod of class 1");
		
	}
	
	@Test
	public  void test1 ()
	{
		System.out.println("test1 of class 1 ");
		
	}
	
	
	@Test
	public  void test2()
	{
		System.out.println("test2 of class 1");
		
	}
	
	@Test
	public  void test3()
	{
		System.out.println("test3 of class 1");
		
	}
	
	
	@AfterClass
	public  void afterclass()
	{
		System.out.println("afterclass of class 1");
		
	}
	
	
	
}
