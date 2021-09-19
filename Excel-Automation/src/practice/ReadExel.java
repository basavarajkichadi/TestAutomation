package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readfiles();
		 copyFiletoanother();

	}
	static void readfiles()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileInputStream fin=null;
		int rownum=0;
		int colnum=0;
		String strdata=null;
		try
		{
			fin=new FileInputStream("E:\\file\\ExelFile.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Testdata");
			if(sh==null)
			{
				System.out.println("Sheet Does not exists");
				return;
			}
			rownum=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rownum;r++)
			{
				row=sh.getRow(r);
				colnum=row.getPhysicalNumberOfCells();
				for(int i=0;i<colnum;i++)
				{
					cell=row.getCell(i);
					strdata=cell.getStringCellValue();
					System.out.print(strdata+"     ");
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
				fin.close();
				fin=null;

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	static void copyFiletoanother()
	{
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row row1=null;
		Row row2=null;
		Cell cell1=null;
		Cell cell2=null;
		FileInputStream fin=null;
		FileOutputStream fout=null;
		int rownum=0;
		int colnum=0;
		String strdata=null;
		try
		{
			fin=new FileInputStream("E:\\file\\ExelFile.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Testdata");
			if(wb.getSheet("Copysheet")==null)
			{
				sh2=wb.createSheet("Copysheet");
			}
			else
			{
				sh2=wb.getSheet("Copysheet");
			}
			rownum=sh1.getPhysicalNumberOfRows();
			for(int i=0;i<rownum;i++)
			{
				row1=sh1.getRow(i);
				if(sh2.getRow(i)==null)
				{
					row2=sh2.createRow(i);
				}else
				{
					row2=sh2.getRow(i);
				}
				colnum=row1.getPhysicalNumberOfCells();
				for(int c=0;c<colnum;c++)
				{
					cell1=row1.getCell(c);
					if(row2.getCell(c)==null)
					{
						cell2=row2.createCell(c);
					}else
					{
						cell2=row2.getCell(c);
					}
					strdata = cell1.getStringCellValue();
					cell2.setCellValue(strdata);
				}
				fout = new FileOutputStream("E:\\File\\ExelFile.xlsx");
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
			

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


}
