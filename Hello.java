package stepdefinition;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;


public class Hello {
	static 	WebDriver driver;

	public static void main (String args[]) throws Exception
	{   

		FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir")+ "\\TD\\Dec.xls");
		
		//		int i = 0, j =0  ;
		//		String a = ExcelRead.getCellData(i,j).toString();
		//		DateFormat formatter = new SimpleDateFormat("dd-mmm-yyyy");
		//	Date Date = (cucumber.api.java.it.Date) formatter.parse(a);
		//		System.out.println(Date);
		//		SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
		//		
		//		String finalString = newFormat.format(Date);
		//		finalString = finalString.replaceAll("-", "");
		//		System.out.println(finalString);
		//		driver.findElement(By.id("time_entry_spent_on")).sendKeys(finalString);
	}
}
