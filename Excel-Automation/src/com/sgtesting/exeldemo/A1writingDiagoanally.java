package com.sgtesting.exeldemo;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1writingDiagoanally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeDiagonaly();
	}
	static void writeDiagonaly()
	{
		FileOutputStream fout=null;
		Workbook w=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try
		{
			w=new XSSFWorkbook();
			sh=w.createSheet("months");
			ArrayList<String> l=new ArrayList<String>();
			l.add("month1");
			l.add("month2");
			l.add("month3");
			l.add("month4");
			l.add("month5");
			l.add("month6");
			l.add("month7");
			l.add("month8");
			l.add("month9");
			l.add("month10");
			l.add("month11");
			l.add("month12");

			for(int i=0;i<12;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				cell.setCellValue(l.get(i));
			}

			fout=new FileOutputStream("E:\\Example\\month.xlsx");
			w.write(fout);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.flush();
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}





