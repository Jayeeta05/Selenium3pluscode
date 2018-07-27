package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FileProg {
	@Test
	public void test()
	{
		File file = new File("C:\\Users\\a07208trng_b4b.04.24\\eclipse-workspace\\SeleniumTest\\test-output\\Book1.xlsx");
		 try {
			 InputStream is = new FileInputStream(file);
			XSSFWorkbook xssf = new XSSFWorkbook(is);
			  XSSFSheet sheet1 = xssf.getSheet("Sheet1");
			  System.out.println("First Row Number "+sheet1.getFirstRowNum());
			  System.out.println("Last Row Number "+sheet1.getLastRowNum());
			  for (int i = 0 ;i<sheet1.getLastRowNum();i++)
			  {
				  System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue()+"\t\t\t"
					+sheet1.getRow(i).getCell(i).getStringCellValue()+"\t\t\t"+sheet1.getRow(i).getPhysicalNumberOfCells());	  
			  }
			  xssf.close();
			 }
		 catch (FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }
		catch (IOException e)
		 {
			e.printStackTrace();
		 }
	}
        
}
