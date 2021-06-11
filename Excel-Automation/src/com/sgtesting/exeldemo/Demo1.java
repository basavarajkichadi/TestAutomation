package com.sgtesting.exeldemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readContent();
	}
	static void readContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh1=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Java\\Assignment1.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh1.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.printf("%-12s",data);
				}
				System.out.println();
			}


		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}





