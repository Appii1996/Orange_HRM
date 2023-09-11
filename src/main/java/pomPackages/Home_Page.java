package pomPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{

	WebDriver driver;
	
	@FindBy(xpath = "//span[text()= 'Admin']")
	private WebElement admin;

	
	public Home_Page(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}

	public void verifyAdminTab() 
	{
		admin.isDisplayed();
		
		

	}

}
