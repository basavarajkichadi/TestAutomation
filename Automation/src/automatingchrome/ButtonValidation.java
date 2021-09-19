package automatingchrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonValidation {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		buttonsDemo();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("file:///C:/Users/Dell/Downloads/Sample.html");
			driver.manage().window().maximize();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void buttonsDemo()
	{
		try
		{
			List<WebElement> ole=driver.findElements(By.xpath("//input[@type='button']"));
			System.out.println("The number of buttons present are "+ole.size());
			
			//if(ole.isEmpty())
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
