package automatingchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {
	public WebDriver driver=null;
	public ActiTimePages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;
	public WebElement getloginbutton()
	{
		return loginbutton;
	}
	@FindBy(xpath="//a[text()='Enter Time-Track']")
	private WebElement loginvalidation;
	public WebElement getloginvalidation()
	{
		return loginvalidation;
	}
	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return logoutLink;
	}
	
	//flyout Window
	@FindBy(xpath="//div[@id='gettingStartedShortcutsMenuCloseId']")
	private WebElement flyoutwindow;
	public WebElement getflyoutwindow()
	{
		return flyoutwindow;
	}
	
	@FindBy(xpath="//*[text()='Please identify yourself']")
	private WebElement logoutvalidation;
	public WebElement getlogoutvalidation()
	{
		return logoutvalidation;
	}

}
