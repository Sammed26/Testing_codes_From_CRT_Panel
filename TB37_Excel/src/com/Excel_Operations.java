package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Operations {

	public static void main(String[] args) throws IOException
	{
		// opening the excel file
		FileInputStream exceldata = new FileInputStream("Resources/TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(exceldata);
		
		XSSFSheet mysheet = workbook.getSheet("Sheet1");
		
		String username = mysheet.getRow(1).getCell(0).getStringCellValue();
		String password = mysheet.getRow(1).getCell(1).getStringCellValue();
		
		for(int i = 0; i<3; i++)
		{
			System.out.println(mysheet.getRow(i).getCell(0) + "  " + mysheet.getRow(i).getCell(1));
		}
		
		System.out.println("username = " + username);
		System.out.println("password = " + password);	
		
	}
	
}
