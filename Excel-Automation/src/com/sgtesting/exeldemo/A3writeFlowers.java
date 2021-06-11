package com.sgtesting.exeldemo;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A3writeFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelFlowersTenthRow();
	}
	static void ExcelFlowersTenthRow()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("FLowernames1");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Flowername-List1");
			row=sh.createRow(9);
			for(int k=0;k<=20;k++)
			{
				cell=row.createCell(k);
				cell.setCellValue("Flower"+(k+1));
			}
			
			fout=new FileOutputStream("D:\\ExcelAutomation\\Flowers.xlsx");
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
				wb.close();
				sh=null;
				row=null;
				cell=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	}

}


