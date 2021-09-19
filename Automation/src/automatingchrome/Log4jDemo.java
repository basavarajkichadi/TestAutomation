package automatingchrome;

import org.apache.log4j.Logger;

public class Log4jDemo {
	public static Logger log=Logger.getLogger("Excecution log");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logsDemo();
	}
	public static void  logsDemo()
	{
		try
		{	
			
			log.info("The Excecution of for loop starts from here");
			for(int i=0;i<10;i++)
			{
				log.info("The number Between 0 and 10 are : "+i);
			}
			log.info("The Excecution of for loop Ends here");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
