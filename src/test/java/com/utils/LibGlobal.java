package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}
	public static void getHemalatha(String url) {
		driver.get(url);
	}


	public static String getData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\god\\eclipse-workspace\\Online9AM3rdMarchCucumber\\input\\Data.xlsx");
		FileInputStream fi = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		System.out.println(cellType);
		String value = null;
		// String-->1,Number or Date -->0
		if (cellType == 1) {
			value = c.getStringCellValue();
			System.out.println(value);
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				System.out.println(dateCellValue);
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-YYYY");
				value = sim.format(dateCellValue);
				System.out.println(value);
			} else {
				double numericCellValue = c.getNumericCellValue();
				System.out.println(numericCellValue);
				long l = (long) numericCellValue;
				value = String.valueOf(l);
				System.out.println(value);
			}
		}
		return value;

	}

}
