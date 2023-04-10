package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pages.ActiTimeIConst;

public class Excel implements ActiTimeIConst {

	public static String getData( String path,String sheet,int row, int col)
	{	
		String text="";
		try
		{
			//reading the data from the excel file
			Workbook workBook = WorkbookFactory.create(new FileInputStream(path));
			text = workBook.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
			System.out.println(text);
		}
		catch(Exception e)
		{
			
		}
		return text;
	}
}
