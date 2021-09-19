package com.sg.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Assignment1 {
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void desiredCapablities() throws MalformedURLException, InterruptedException, AWTException
	{
		DesiredCapabilities capablity=new DesiredCapabilities();
		capablity.setCapability("platformName", "Android");
		capablity.setCapability("platformVersion", "6.0.1");
		capablity.setCapability("deviceName", "6acde8ff");
		capablity.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capablity.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capablity);
	}
	@Test
	public void testCase1() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//android.view.View[@content-desc=\"Mobiles Mobiles\"]/android.widget.Image").click();
		Thread.sleep(2000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("iphone 11");
		Thread.sleep(000);

		//use robot class to press enter button
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}
}
