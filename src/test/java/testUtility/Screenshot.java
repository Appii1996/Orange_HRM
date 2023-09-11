package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testPackages.BaseClass;

public class Screenshot
{

	public static String CapturPageScreenShot( WebDriver driver) throws IOException // void -- String
	{
	//	System.getProperty("user.dir")
		
		String r =System.getProperty("user.dir");
		System.out.println(r);
		String path = System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshot"+File.separator+System.currentTimeMillis()+".png";
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileHandler.copy(source, dest);
		
		return path;      // we are using multiple time path so we can return (void --- String)
		
		
		
		
	}

}
