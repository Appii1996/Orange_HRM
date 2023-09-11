package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser 
{
	static WebDriver driver;
	public static WebDriver openBrowser(String BrowserName, String URL) 
	{
		 
		
		if (BrowserName.equalsIgnoreCase("chrome")) 
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins*"); //Method 1 for opening browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
//			WebDriverManager.chromedriver().setup(); // method 2 for opening browser
//			driver = new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.get(URL);
	    driver.manage().window().maximize();
		return driver;    //method name change void ---> WebDriver
		
	}



}

