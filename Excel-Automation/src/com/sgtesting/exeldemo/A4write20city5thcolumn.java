package com.sgtesting.exeldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A4write20city5thcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelCityFifthColumn();
	}
	static void ExcelCityFifthColumn()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Citynames");
			row=sh.createRow(0);
			cell=row.createCell(4);
			cell.setCellValue("Cityname-List1");
			for(int i=1;i<=20;i++)
			{
				row=sh.createRow(i);
				for(int k=1;k<=4;k++)
				{
					cell=row.createCell(k);
					if(k==4)
					{
						cell.setCellValue("City"+i);
					}
					else
					{
						cell.setCellValue(" ");	
					}

				}
			}


			fout=new FileOutputStream("D:\\ExcelAutomation\\Cities.xlsx");
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
