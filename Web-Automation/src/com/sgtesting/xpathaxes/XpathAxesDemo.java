package com.sgtesting.xpathaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	
		launchBrowser();
		navigate();
		followingSiblingDemo();
		followingDemo();
		preceding();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/Users/Dell/Downloads/WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void followingSiblingDemo()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	static void followingDemo()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("50000");
		oBrowser.findElement(By.xpath("//*[text()='Narendra Modi']/following::tr[2]/td[6]/input")).sendKeys("63000");
	}

	static void precedingSibling()
	{
		oBrowser.findElement(By.xpath("")).click();
	}
	
	static void preceding()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Politician']/preceding::tr[4]/td[1]/input")).click();
	}
}
