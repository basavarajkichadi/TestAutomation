package com.sgtesting.exeldemo;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A2writeContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeContent();
	}
	static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook w=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try
		{
			w=new XSSFWorkbook();
			sh=w.createSheet("fruit");
			List<String> l=new ArrayList<String>();
			l.add("fruit1");
			l.add("fruit2");
			l.add("fruit3");
			l.add("fruit4");
			l.add("fruit5");
			l.add("fruit6");
			l.add("fruit7");
			l.add("fruit8");
			l.add("fruit9");
			l.add("fruit10");
			l.add("fruit11");
			l.add("fruit12");
			l.add("fruit13");
			l.add("fruit14");
			l.add("fruit15");
			l.add("fruit16");
			l.add("fruit17");
			l.add("fruit18");
			l.add("fruit19");
			l.add("fruit20");

			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(l.get(i));
			}

			fout=new FileOutputStream("E:/fruit.xlsx");
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


