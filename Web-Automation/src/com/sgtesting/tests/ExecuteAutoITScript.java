package com.sgtesting.tests;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("E:\\SELENIUM\\AUTOIT\\FirstScript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
