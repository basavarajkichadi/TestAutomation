package practice;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewExel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createandWrite();
		//createandWrite1();
		//createAndWrite2();
	}
	static void createandWrite()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		String array[][]={{"Dog","cat"},{"Apple","Banana"},{"BASU","kichadi"}};
		try
		{
			
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Testdata");
			for(int i=0;i<array.length;i++)
			{
				row = sh.createRow(i);
				for(int j=0; j<array[i].length; j++)
				{
					cell = row.createCell(j);
					cell.setCellValue(array[i][j]);
				}	
			}
			
			fout=new FileOutputStream("E:\\file\\ExelFile.xlsx");
			wb.write(fout);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				 wb=null;
				 sh=null;
				 row=null;
				 cell=null;
				 fout.close();
				 fout.flush();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	static void createandWrite1()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Testdata");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Welcome");
			
			row=sh.createRow(1);
			cell=row.createCell(1);
			cell.setCellValue("to");
			
			row=sh.createRow(2);
			cell=row.createCell(2);
			cell.setCellValue("SG Testing");
			
			fout=new FileOutputStream("E:\\file\\ExelFile.xlsx");
			wb.write(fout);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				 
				 fout.close();
				 fout.flush();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	static void createAndWrite2()
	{
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		FileOutputStream fout = null;
		String strArr[][] = {{"Apple", "Boy", "CCCCC"}, {"Cat", "Dog", "DDDD"}, {"Eagle", "Fan", "FFFF"}};
		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("TestData");
			
			for(int i=0; i<strArr.length; i++)
			{
				row = sh.createRow(i);
				
				for(int j=0; j<strArr[i].length; j++)
				{
					cell = row.createCell(j);
					cell.setCellValue(strArr[i][j]);
				}
			}
			
			fout = new FileOutputStream("E:\\File\\Excel1.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fout.flush();
				fout.close();
				fout = null;
				cell = null;
				row = null;
				sh = null;
				wb.close();
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	 
	

}
