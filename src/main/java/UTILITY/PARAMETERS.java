package UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PARAMETERS {
	
	public static String getExcel(String sheetname, int a, int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Documents\\Pathak Eclips\\TropicNinja\\src\\test\\resources\\DATAS.xlsx");
		
	 String cellvalue =WorkbookFactory.create(file).getSheet(sheetname).getRow(a).getCell(b).getStringCellValue();
	 
	 return cellvalue;
	}

}
