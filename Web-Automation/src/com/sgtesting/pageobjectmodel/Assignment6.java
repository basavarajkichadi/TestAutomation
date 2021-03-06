package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static WebDriver driver=null;
	public static ActiTimePages pom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeBrowser();
	}
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
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
			driver.get("http://localhost:81/login.do");
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
			Thread.sleep(2000);
			pom.clickLoginButton().click();
		}
		catch(Exception e)
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
	static void createCustomer()
	{
		try
		{
			pom.clickOnTasks().click();
			Thread.sleep(2000);
			pom.clickOnAddNew().click();
			Thread.sleep(2000);
			pom.createNewCustomer().click();
			Thread.sleep(2000);
			pom.EnterCustomerNameTextField().sendKeys("demoCustomer");
			Thread.sleep(2000);
			pom.createCustomerButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			pom.clickOnAddNew().click();
			Thread.sleep(2000);
			pom.createNewProject().click();
			Thread.sleep(2000);
			pom.enterProjectNameTextField().sendKeys("demoProject");
			Thread.sleep(2000);
			pom.createProjectButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void modifyProject()
	{
		try
		{
			pom.projectSettings().click();
			Thread.sleep(2000);
			pom.ProjectDescription().sendKeys("This is Testing Purpose");
			Thread.sleep(2000);
			pom.CrossMarkProject().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteProject()
	{
		try
		{
			pom.projectSettings().click();
			Thread.sleep(2000);
			pom.clickOnActionsProject().click();
			Thread.sleep(2000);
			pom.DeleteProject().click();
			Thread.sleep(2000);
			pom.deleteProjectPermanently().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteCustomer()
	{
		try
		{
			pom.CustomerSettings().click();
			Thread.sleep(2000);
			pom.clickOnActionsCustomer().click();
			Thread.sleep(2000);
			pom.deleteCustomer().click();
			Thread.sleep(2000);
			pom.deleteCustomerPermanently().click();
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



