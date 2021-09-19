package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	
	@AfterSuite
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	
	@Test
	public void deleteUser2()
	{
		System.out.println("user  is deleted");
	}

}
