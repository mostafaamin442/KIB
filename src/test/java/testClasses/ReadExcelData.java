package testClasses;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	
	 ///* this class for load and access the data for excel and json files 
	 static FileInputStream fis = null;
	  /////load excel sheet////
	  public FileInputStream getFileInputStream(String FilePath) throws FileNotFoundException
	  { 
		 // String FilePath = System.getProperty("user.dir")+"/src/test/java/dataDriven/DataSource.xlsx";
		  File srcFile = new File(FilePath);
		  fis = new FileInputStream(srcFile);
		
		  return fis;
	  }
	  /////read the data from the excel sheet //////
	  public Object[][] getExcelData(String FilePath) throws IOException
	  {
		  fis =getFileInputStream(FilePath);
		  
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			int TotalNumberOfRows = (sheet.getLastRowNum()+1);
			int TotalNumberOfCols = 2;
			String[][] arrExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];
			for (int i=0;i<TotalNumberOfRows;i++)
			{ 
				for (int j=0;j<TotalNumberOfCols;j++)
				{
					XSSFRow row = sheet.getRow(i);
					arrExcelData[i][j] = row.getCell(j).toString();
					
				}
				
			}
			wb.close();
			return arrExcelData;
		}

}
