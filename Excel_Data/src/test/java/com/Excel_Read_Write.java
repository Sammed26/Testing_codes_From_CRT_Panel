package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write {

	public static void main(String args[]) throws IOException
	{
		FileInputStream exceldata = new FileInputStream("src/test/resources/TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(exceldata);
		
		XSSFSheet mySheet = workbook.getSheet("Sheet1");
		
		// create one new row
		int newrow = mySheet.getLastRowNum() + 1;
		System.out.println(newrow);
		mySheet.createRow(newrow);
		
		// added data in that row
		mySheet.getRow(newrow).createCell(0).setCellValue("data added from eclipse@gmail.com");
		mySheet.getRow(newrow).createCell(1).setCellValue("eclipse@123");
		
		// save data
		FileOutputStream fos = new FileOutputStream("src/test/resources/TestData.xlsx");
		
		workbook.write(fos);
		
		
		// close all
		fos.close();
		workbook.close();
		exceldata.close();
		
	}
	
}
