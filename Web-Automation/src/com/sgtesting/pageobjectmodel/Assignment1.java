package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver driver=null;
	public static ActiTimePages pom=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeBrowser();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
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
			driver.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			pom.getUserName().sendKeys("admin");
			pom.getPassword().sendKeys("manager");
			pom.clickLoginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void flyOutWindow()
	{
		try
		{
			pom.closeFlyOutWindow().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnAddUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("user1");
			pom.lastnameTextField().sendKeys("demo1");
			pom.emailTextField().sendKeys("user1demo1@gmail.com");
			pom.usernameTextField().sendKeys("demouser1");
			pom.passwordTextField().sendKeys("india");
			pom.passwordCopyTextField().sendKeys("india");
			pom.clickOnCreateUser().click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			pom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			pom.clickOnDeleteUser().click();
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			pom.clickLogout().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
