package testPackages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTNG2 
{

	@Parameters({"browserName"})
	@BeforeTest
	public void beforetest(String browserName ) 
	{
	
		if (browserName.equals("Chrome")) 
		{
			System.out.println("Opening the chrome browser");
		}
		else if (browserName.equals("Firefox")) 
		{
			System.out.println("Opening the firefox browser");
		}
		else if (browserName.equals("Safari"))
		{
			System.out.println("Opening the safari broser");
		}
	}
	
	@BeforeClass
	public void beforeClass() 
	{
	
		System.out.println("beforeClass of class 2");
			
	}
	
	@BeforeMethod
	public  void beforeMethod()
	{
		System.out.println("beforeMethod of class 2");
		
	}
	
	@Test
	public  void test1 ()
	{
		System.out.println("test1 of class 2 ");
		
	}
	
	
	@Test
	public  void test2()
	{
		System.out.println("test2 of class 2");
		
	}
	
	@Test
	public  void test3()
	{
		System.out.println("test3 of class 2");
		
	}
	
	
	@AfterClass
	public  void afterclass()
	{
		System.out.println("afterclass of class 2");
		
	}
	@AfterTest
	public void aftertest() 
	{
	
		System.out.println("aftertest of class 2");
			
	}
	
	
	
}
