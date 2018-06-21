package com.java.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(
					new File("C:\\Documents and Settings\\admin\\Desktop\\imp data\\howtodoinjava_demo.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);
			List l = new ArrayList();
			Set s = new HashSet();
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					// Check the cell type and format accordingly
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						l.add(cell);
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						s.add(cell);
						break;
					}
					// System.out.println(l.add(cell));
					// System.out.println("hgjewi "+l.add(row));

				}

				System.out.println("");

			}
			System.out.println("These are the list of id's");
			
			for (Object obj : l) {
           // System.out.println(l);    
				System.out.println(obj);

			}
			System.out.println("These are the list of names");
			
			
				
				System.out.println(s);

		

			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
