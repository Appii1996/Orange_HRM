package pom_Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element_wait
{

	public static void WaitForElement(String webelement, int timeout, WebDriver driver)
	{
		
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webelement)));
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
