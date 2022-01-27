package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static WebDriver lunchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static void urlLunch(String url) {
		driver.get(url);
	}
	
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void click1(WebElement e) {
		e.click();
	}
	
	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}
	
//	public static String readExcel(String fileName, String sheet, int row, int cell) throws IOException {
//		File f = new File("E:\\Testing Course\\Selenium\\JunitTest\\src\\test\\resources\\Excel\\NameList.xlsx");
//		FileInputStream st = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(st);
//		Sheet s = w.getSheet("Sheet1");
//		Row r =s.getRow(row);
//		Cell c = r.getCell(cell);
//		//System.out.println(cell);
//		
//		int type = c.getCellType();
//		//System.out.println(type);
//		
//		String value = null;
//		if(type == 1) {
//			String stringCellValue = c.getStringCellValue();
//			//System.out.println(stringCellValue);
//		}else {
//			if(DateUtil.isCellDateFormatted(c)) {
//				Date date = c.getDateCellValue();
//				SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//				String formate = sdf.format(date);
//				//System.out.println(formate);
//			}else {
//				//long numericCellValue = (long) c.getNumericCellValue();
//				double number = c.getNumericCellValue();
//				long lnumber = (long)number;
//				String value1 = String.valueOf(lnumber);
//				//System.out.println(value1);
//			}
//		}
//		return value;
//	}

}
