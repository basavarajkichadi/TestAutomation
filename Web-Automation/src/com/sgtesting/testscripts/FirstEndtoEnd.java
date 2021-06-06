package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstEndtoEnd {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		loginasAdmin();
		minimizeFlyOutWindow();
		createUser();
		logout();
		loginasUser1();
		logout();
		loginasUser2();
		logout();
		loginasUser3();
		logout();
		loginasAdmin();
		deleteUser();
		logout();
		closeApplication();
		
	}
	static void launchBrowser()
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

	static void navigate()
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

	static void loginasAdmin()
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
	static void logout()
	{
		try
		{
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
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
	static void createUser()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
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
	static void closeApplication()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasUser1()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("userdemo1");
			driver.findElement(By.name("pwd")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasUser2()
	{
		try
		{
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
	static void loginasUser3()
	{
		try
		{
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
	
	static void deleteUser()
	{
		try
		{
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
	

}

