package automatingchrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentandChild {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		popupTesting();
		parentandchild();

	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void popupTesting()
	{
		try
		{
			System.out.println("Before clicking the link  "+getpopupcount());
			oBrowser.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
			System.out.println("After clicking link  "+getpopupcount());
			if(getpopupcount()>0)
			{
				closepopups();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static int getpopupcount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	public static  void closepopups()
	{
		Object[] pop=null;
		try
		{
			String parent=oBrowser.getWindowHandle();
			System.out.println(parent);
			pop=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<pop.length;i++)
			{
				String child=pop[i].toString();
				System.out.println(child);
				oBrowser.switchTo().window(child);
				String title=oBrowser.getTitle();

				String url=	oBrowser.getCurrentUrl();
				System.out.println(title+"   "+url);


			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void parentandchild()
	{
		try
		{
			String parent=oBrowser.getWindowHandle();
			System.out.println(parent);
			oBrowser.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
			Thread.sleep(2000);
			Set<String> ochild=oBrowser.getWindowHandles();
			for(String child:ochild)
			{
				if(!child.equals(parent))
				{
					oBrowser.switchTo().window(child);
					String url=	oBrowser.getCurrentUrl();
					System.out.println(url);

					String title=oBrowser.getTitle();
					System.out.println(title);
					oBrowser.close();
				}
			}
			oBrowser.switchTo().window(parent);
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}