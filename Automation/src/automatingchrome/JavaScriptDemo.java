package automatingchrome;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 launchBrowser();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		
			driver.get("file:///E:/SELENIUM/TestNG/Sample.html");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			String title=(String) js.executeScript("var kk=document.title; return kk;");
			System.out.println(title);
			String title1=(String) js.executeScript("var kk=document.URL; return kk;");
			System.out.println(title1);
			js.executeScript("document.getElementById('uid1user1name1').value='admin'");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
