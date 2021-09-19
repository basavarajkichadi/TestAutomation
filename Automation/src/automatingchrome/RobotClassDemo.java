package automatingchrome;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo {
	public static ActiTimePages pom=null;
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		login();
		minimizeflyoutwindow();
		Assignment();
		robotclassDemo();
		logout();
	}

	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			pom=new ActiTimePages(driver);
			driver.get("http://localhost:81/user/submit_tt.do");
			driver.manage().window().maximize();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			Thread.sleep(3000);
			pom.getusername().sendKeys("admin");
			pom.getpassword().sendKeys("manager");
			Thread.sleep(2000);
			pom.getloginbutton().click();
			Thread.sleep(4000);
			if(pom.getloginvalidation().getText().equalsIgnoreCase("Enter Time-Track"))
			{
				System.out.println("Login successfully");
			}
			else {System.out.println("Failed to login");}
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeflyoutwindow()
	{
		try
		{
			driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
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
			pom.getlogout().click();
			Thread.sleep(2000);
			if(pom.getlogoutvalidation().getText().equalsIgnoreCase("Please identify yourself"))
			{
				System.out.println("Logged Out successfully");
				driver.close();

			}
			else {System.out.println("Failed to login");}
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Assignment()
	{
		try
		{
			driver.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='item importTasks ellipsis']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='dropzoneClickableArea']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void robotclassDemo()
	{
		try
		{
			String path="E:\\Sample.csv";
			StringSelection select=new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='loadTasksFromCSVPopup_cancelBtn']")).click();
			Thread.sleep(1000);
			Alert olert=driver.switchTo().alert();
			String content=olert.getText();
			System.out.println(content);
			olert.accept();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


