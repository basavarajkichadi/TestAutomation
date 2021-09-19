package automatingchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		actionDemo();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void actionDemo()
	{
		try
		{
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			WebElement ole=driver.findElement(By.xpath("//div[text()='Fashion']"));
			Actions mouse=new Actions(driver);
			mouse.moveToElement(ole).build().perform();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
