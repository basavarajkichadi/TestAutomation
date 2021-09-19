package com.sgtesting.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericMethods {
	
	public static void loginasAdmin(WebDriver driver)
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
	
	public static void logout(WebDriver driver)
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
	public static void loginAsUser1(WebDriver driver)
	{
		try
		{
			GenericMethods.logout(driver);
			Thread.sleep(2000);
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
	public static void loginAsUser2(WebDriver driver)
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

}
