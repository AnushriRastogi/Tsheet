package Action;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class TimeSheet {
	static WebDriver driver = null;
	
public void iAmOnLoginPage() throws IOException
{
	File directory = new File(".");
	String chromDrvrPath;
	chromDrvrPath = directory.getCanonicalPath() + File.separator + "ChromedDriver" + File.separator + "chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",chromDrvrPath);
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");  
	options.addArguments("--disable-extensions");
	options.addArguments("disable-infobars");
    driver = new ChromeDriver(options);
    driver.navigate().to("http://redmine.intelegencia.com");
}

	public static void iEnterUserName(String arg1) throws IOException 
	{
	 driver.findElement(By.cssSelector("#username")).sendKeys(arg1);
	}
	
	public static void iEnterPassword(String arg2) throws IOException 
	{
	 driver.findElement(By.cssSelector("#password")).sendKeys(arg2);
	}
	
	public static void iClickLogin() throws IOException 
	{
	 driver.findElement(By.xpath("//input[@value='Login »']")).click();
	}
	
	public static void iVerifyHomeText() throws IOException 
	{
	 driver.findElement(By.xpath("//h2[text()='Home']"));
	}
	
	public static void iNavtoProject(String arg3) throws IOException 
	{
	 WebElement ele = driver.findElement(By.cssSelector("#project_quick_jump_box"));
	 ele.click();
	 Select oSelect = new Select(ele);
	 oSelect.selectByVisibleText("2U");
	 
	 
	}
	
	public static void iClickAOptionOnProjectPage(String arg4) throws IOException, InterruptedException 
	{
	 driver.findElement(By.xpath("//a[text()='"+arg4+"']")).click();
		
	}
	
	public static void iSelectActivity(String arg5) throws IOException, InterruptedException 
	{
	 Select select = new Select(driver.findElement(By.id("time_entry_activity_id"))); 
		select.selectByVisibleText(arg5);

	}
	
	public static void enterData(int rowStart, int rowEnd, int columnStart, int columnEnd) throws Exception
	{
		for(int i=rowStart;i<=rowEnd;i++)
		{
			for(int j=columnStart;j<=columnEnd;j++)
			{
				if(j==0)
				{
					String a = ExcelRead.getCellData(i,j).toString();
					DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
					java.util.Date date = formatter.parse(a);
					SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
					String finalString = newFormat.format(date);
					
					//finalString = finalString.replaceAll("-", "");
					System.out.println(finalString);
					driver.findElement(By.id("time_entry_spent_on")).sendKeys(finalString);
					
					
				}
				if(j==1)
				{
					String a = ExcelRead.getCellData(i,j).toString();
					driver.findElement(By.id("time_entry_hours")).sendKeys(a);
				}
				if(j==2)
				{
					String a = ExcelRead.getCellData(i,j).toString();
					if(a.contains("\n"))
					{
						a = a.replaceAll("\n", " ");
					}
					driver.findElement(By.id("time_entry_comments")).sendKeys(a);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@value='Create and continue']")).click();
				}
			}
		}
	}

}
