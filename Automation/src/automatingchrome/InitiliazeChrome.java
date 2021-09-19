package automatingchrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiliazeChrome {
	public static ActiTimePages pom=null;
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		//usingfindelements();
		login();
		minimizeflyoutwindow();
		logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		String path=null;
		try
		{

			path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			pom=new ActiTimePages(driver);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			//driver.get("https://www.amazon.in/");
			//driver.navigate().to("file:///C:/Users/Dell/Downloads/Sample.html");
			driver.get("http://localhost:81/user/submit_tt.do");
			//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			driver.manage().window().maximize();
			//	driver.findElement(By.xpath("//input[@id='firstname']/following::input")).sendKeys("admin");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		driver.close();
	}
	static void login()
	{
		try
		{
			pom.getusername().sendKeys("admin");
			pom.getpassword().sendKeys("manager");
			Thread.sleep(2000);
			pom.getloginbutton().click();
			Thread.sleep(4000);
			if(pom.getloginvalidation().getText().equalsIgnoreCase("Enter Time-Track"))
			{
				System.out.println("Login successfully");
			}
			else {System.out.println("Failed to login");}
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeflyoutwindow()
	{
		try
		{
			driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			pom.getlogout().click();
			Thread.sleep(2000);
			if(pom.getlogoutvalidation().getText().equalsIgnoreCase("Please identify yourself"))
			{
				System.out.println("Logged Out successfully");

			}
			else {System.out.println("Failed to login");}
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 

	static void usingfindelements()
	{

		try
		{
			List<WebElement> list= driver.findElements(By.xpath("//a[@href]"));
			System.out.println(list.size());
			for(int i=0;i<list.size();i++)
			{
				String cont=list.get(i).getText();
				if(cont.endsWith("HQ"))
				{
					list.get(i).click();
					break;

				}
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}




}
