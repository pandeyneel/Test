package guru99tests;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Propertyutility 
{
	
	public static String readexcel(String path,int rowno, int colno)
	{
		
		String value="";
		try {
			FileInputStream fis= new FileInputStream(path);
			HSSFWorkbook hs= new HSSFWorkbook(fis);
			HSSFSheet sheet=hs.getSheetAt(0);
			value=sheet.getRow(rowno).getCell((short) colno).getStringCellValue();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return value;
		
	}

}
