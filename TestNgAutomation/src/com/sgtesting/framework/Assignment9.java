package com.sgtesting.framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment9 {

	public static WebDriver driver=null;

	/* LaunchBrowser--> navigate --> login as admin --> create user1 --> logout --> login as user1 --> create user2 --> logout --> 
login as user2 --> create user3 --> logout-->login as admin --> modify user1 --> logout --> login as user1 --> modify user2 --> logout -->
login as user2 --> modify user3 --> logout -->login as user2 --> delete user3 --> logout --> login as user1 --> delete user2 --> logout -->
 login as admin --> delete user1 --> logout --> close application*/
	@Test(priority=1)
	public static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
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
			driver.get("http://localhost:81/login.do");
			Thread.sleep(2000);	//To make the delay of 3 Seconds
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public static void minimizeFlyOutWindow()
	{
		try
		{
			GenericMethods.loginasAdmin(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public static void createUser1()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click(); //To click on Add User
			Thread.sleep(2000);

			driver.findElement(By.name("firstName")).sendKeys("User1");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user1@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User1");
			driver.findElement(By.name("password")).sendKeys("welcome1");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public static void loginAsUser1()
	{
		try
		{
			
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public static void createUser2()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("firstName")).sendKeys("User2");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user2@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User2");
			driver.findElement(By.name("password")).sendKeys("welcome2");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public static void loginAsUser2()
	{
		try
		{

			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("welcome2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public static void createUser3()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("firstName")).sendKeys("User3");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user3@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User3");
			driver.findElement(By.name("password")).sendKeys("welcome3");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public static void modifyUser1()
	{
		try
		{
			GenericMethods.loginasAdmin(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("New");
			driver.findElement(By.name("lastName")).sendKeys("New");
			driver.findElement(By.name("password")).sendKeys("welcome1new");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome1new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public static void loginAsUpdatedUser1()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("welcome1new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public static void modifyUser2()
	{
		try
		{

			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("New");
			driver.findElement(By.name("lastName")).sendKeys("New");
			driver.findElement(By.name("password")).sendKeys("welcome2new");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome2new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public static void loginAsUpdatedUser2()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("welcome2new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public static void modifyUser3()
	{
		try
		{

			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("New");
			driver.findElement(By.name("lastName")).sendKeys("New");
			driver.findElement(By.name("password")).sendKeys("welcome3new");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome3new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public static void deleteUser3()
	{
		try
		{
			GenericMethods.loginAsUser2(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(4000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	public static void deleteUser2()
	{
		try
		{
			GenericMethods.loginAsUser1(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(4000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	public static void deleteUser1()
	{
		try
		{
			GenericMethods.loginasAdmin(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(2000);
			GenericMethods.logout(driver);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	public static void closeApplication()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
