package automatingchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		identifyElements();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void identifyElements()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[contains(text(),'WebDriver')]")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(3000);
			WebElement ole=oBrowser.findElement(By.xpath("//iframe[@name='classFrame']"));
			oBrowser.switchTo().frame(ole);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/dl[2]/dd")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
