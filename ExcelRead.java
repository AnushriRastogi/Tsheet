package Action;


import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static HSSFSheet ExcelWSheet;
	 
	public static HSSFWorkbook ExcelWBook;

	public static HSSFCell Cell;

	public static HSSFRow Row;
	
	public static void setExcelFile(String Path,String SheetName) throws Exception {
		 
			try {

   			// Open the Excel file

			
			} catch (Exception e){
				throw (e);
			}
			}
			
			public static String getCellData(int RowNum, int ColNum) throws Exception{
				 
       			try{ 
       				FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\January - Copy.xls");
       				System.out.println(ExcelFile);       	
       				ExcelWBook = new HSSFWorkbook(ExcelFile);
       				ExcelWSheet = ExcelWBook.getSheet("Sheet1");
       				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum); 
          			String CellData = Cell.toString();
          			
          			System.out.println(CellData);
          			return CellData;
           			}catch (Exception e){ 
						return""; 
          			}
			}
}
