package com.sg.automation;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Assignment4 {
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void desiredCapablities() throws MalformedURLException 
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
	public void testcase2() throws InterruptedException, AWTException {
		Thread.sleep(4000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		Thread.sleep(4000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/action_bar_burger_icon").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.view.View[@content-desc=\"Fashion Fashion\"]/android.view.View").click();
		Thread.sleep(2000);
	
	

}
}
