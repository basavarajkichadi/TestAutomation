package com.sg.automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BiuldDemo {
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void desiredCapabalities() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capablity=new DesiredCapabilities();
		File file=new File("C:\\Users\\Dell\\Downloads");
		capablity.setCapability("platformName", "Android");
		capablity.setCapability("platformVersion", "6.0.1");
		capablity.setCapability("deviceName", "6acde8ff");
		capablity.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capablity.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		capablity.setCapability("app",file.getAbsolutePath());
		
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capablity);

	}

	@Test
	public void testCase1() throws InterruptedException {
		wait(4000);
		driver.findElementById("com.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		wait(4000);
		driver.findElementById("com.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon").click();
		wait(4000);
		driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text").click();
	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}

	public void wait(int time) throws InterruptedException {
		Thread.sleep(time);
	}


}


