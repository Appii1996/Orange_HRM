package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchDataFromFile 
{
	
public static String fetchDataFromFile(int i, int j) throws EncryptedDocumentException, IOException
{
	String data="";
//	src\test\resources\Testing_xml\NEW.xlsx
	//String path = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"Testing_xml";
	String path = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"Testing_xml"+File.separator+"NEW.xlsx";
	FileInputStream file = new FileInputStream(path);
	Sheet s=WorkbookFactory.create(file).getSheet("Sheet1");

	Cell c=s.getRow(i).getCell(j);
	CellType type=c.getCellType(); // either create method 
//	if(c.getCellType()==CellType.STRING) // or directly call 
//	{
//		
//	}
	if (type==CellType.STRING)
	{
		data=c.getStringCellValue();
	}
	else if(type==CellType.NUMERIC) 
	{
		double number = c.getNumericCellValue(); // we have to convert into data 
//		data = String.valueOf(number); //METHOD 1
		data= Double.toString(number); // METHOD 2
	}
	else if (type==CellType.BLANK)
	{
		 data ="";

	}
	return data;           // we will have to return method 
}


	
	

	
	
}
