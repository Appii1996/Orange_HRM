package pomPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom_Utility.Element_wait;

public class Login_Page 
{
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[text()= 'Admin']")
	private WebElement admin;

	
	public Login_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	   
	}
	
	public void sendUserName(String uName)
	{
		//  Element_wait.WaitForElement("//input[@name='username']", 20, driver);
          username.sendKeys(uName);
	
	}

	public void sendPassword(String pwd) 
	{
		// Element_wait.WaitForElement("//input[@name='password']", 20, driver);
		password.sendKeys(pwd);
	}

	public void ClickOnLoginButton() 
	{
		loginButton.click();
	}
	public void handleAlert()
	{
		driver.switchTo().alert();
	}
	//METHOD 1
	public  String fetchCurrentURL() 
	{
		String url=driver.getCurrentUrl();
		return url;
		
	}
//	//METHOD 2
//    public boolean CompareURL() 
//    {
//    	
//    String ExpectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard";
//    String URL = driver.getCurrentUrl();
//    boolean result = ExpectedURL .equals(URL);
//    return result;
//   method 3
    public boolean CheckVisibilityOfAdminTab() 
    {
    	return admin.isDisplayed();
   
    }
    //Method 4
    public boolean CheckVisibilityOfLoginButton() 
    {
  	return loginButton.isDisplayed();
   
    }
    
}
