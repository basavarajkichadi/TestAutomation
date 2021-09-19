package com.sgtesting.framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*1. LaunchBrowser--> navigate --> login as admin--> Create 3 users those are a) user1 b) user2 c)user3 --> Logout -->login as user1 --> Logout --> 
login as user2 --> logout -->login as user3 --> logout --> login as admin --> delete a) user1 b) user2 c)user3 --> logout --> close application*/

public class Assignment8 {
	public static WebDriver driver=null;
	
	@Test(priority=1)
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public static void navigate()
	{
		try
		{
			driver.navigate().to("http://localhost:81/user/submit_tt.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public static void loginasAdmin()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public static void minimizeFlyOutWindow()
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public static void createUser()
	{
		try
		{	
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("firstName")).sendKeys("demo1");
			driver.findElement(By.name("lastName")).sendKeys("user1");
			driver.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			driver.findElement(By.name("username")).sendKeys("userdemo1");
			driver.findElement(By.name("password")).sendKeys("india");
			driver.findElement(By.name("passwordCopy")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("demo2");
			driver.findElement(By.name("lastName")).sendKeys("user2");
			driver.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			driver.findElement(By.name("username")).sendKeys("userdemo2");
			driver.findElement(By.name("password")).sendKeys("india");
			driver.findElement(By.name("passwordCopy")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("demo3");
			driver.findElement(By.name("lastName")).sendKeys("user3");
			driver.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			driver.findElement(By.name("username")).sendKeys("userdemo3");
			driver.findElement(By.name("password")).sendKeys("india");
			driver.findElement(By.name("passwordCopy")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public 	static void loginasUser1()
	{
		try
		{
			GenericMethods.logout(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("userdemo1");
			driver.findElement(By.name("pwd")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public static void loginasUser2()
	{
		try
		{
			GenericMethods.logout(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("userdemo2");
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public static void loginasUser3()
	{
		try
		{
			GenericMethods.logout(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("userdemo3");
			driver.findElement(By.name("pwd")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public static void deleteUser()
	{
		try
		{
			GenericMethods.logout(driver);
			Thread.sleep(2000);
			GenericMethods.loginasAdmin(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=driver.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			alert.accept();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert alert1=driver.switchTo().alert();
			alert1.accept();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public static void closeApplication()
	{
		try
		{
			GenericMethods.logout(driver);
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}

