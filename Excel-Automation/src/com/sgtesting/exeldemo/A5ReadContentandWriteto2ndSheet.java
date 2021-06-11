
package com.sgtesting.exeldemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A5ReadContentandWriteto2ndSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadExistingWriteNew();

	}
	static void ReadExistingWriteNew()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;
		try
		{
			fin= new FileInputStream ("D:\\ExcelAutomation\\SampleNames.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			if(sh1==null)
			{
				sh1=wb.createSheet("Sheet4");
			}
			for(int i=0;i<rc;i++)
			{
				row=sh.getRow(i);
				row1=sh1.getRow(i);
				if(row1==null)
				{
					row1=sh1.createRow(i);
				}
				int cc=row.getPhysicalNumberOfCells();
				for(int k=0;k<cc;k++)
				{
					cell=row.getCell(k);
					cell1=row1.getCell(k);
					if (cell1==null)
					{
						cell1= row1.createCell(k);
					}
					String data=cell.getStringCellValue();
					cell1.setCellValue(data);
				}
				fout=new FileOutputStream("D:\\ExcelAutomation\\SampleNames.xlsx");
				wb.write(fout);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{

				fin.close();
				fout.close();
				wb.close();
				sh=null;
				sh1=null;
				row=null;
				row1=null;
				cell=null;
				cell1=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
