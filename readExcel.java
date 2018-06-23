package com.java.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(
					new File("C:\\Documents and Settings\\admin\\Desktop\\imp data\\howtodoinjava_demo.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//TreeMap<Integer,String> m = new TreeMap<Integer,String>();
			//Person per = new Person();
			// Iterate through each rows one by one
			Set<Person> set = new TreeSet(new Yyuio());
			
			for(int i=1; i<20; i++) {
				

				// Get first/desired sheet from the workbook
				XSSFSheet sheet = workbook.getSheetAt(0);
				Person per = new Person();
				XSSFRow row1 = sheet.getRow(i);
				double s = row1.getCell(0).getNumericCellValue();
				String p = row1.getCell(1).getStringCellValue();
				String q = row1.getCell(2).getStringCellValue();
				
				per.setId(s);
				per.setName(p);
				per.setLastName(q);
				set.add(per);
				//System.out.println(per);
				
				
			}
			
			
			
			System.out.println(set);
			
			
//			while (rowIterator.hasNext()) {
//				Row row = rowIterator.next();
//				// For each row, iterate through all the columns
//				Iterator<Cell> cellIterator = row.cellIterator();
//
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//
//					// Check the cell type and format accordingly
//					switch (cell.getCellType()) {
//					case Cell.CELL_TYPE_NUMERIC:
//						System.out.print(cell.getNumericCellValue() + "\t");
//						//p.setId((Integer)cell.getNumericCellValue());
//						
//						break;
//					case Cell.CELL_TYPE_STRING:
//						System.out.print(cell.getStringCellValue() + "\t");
//						//p.setName(cell.getStringCellValue() );
//						//System.out.println("Used set" + p);
//						break;
//						
//					}
//				
//					
//
//				}
//
//				System.out.println();				
//
//			}
		
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
