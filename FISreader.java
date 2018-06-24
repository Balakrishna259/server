package com.java.excel;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FISreader {
	// FilterInputStream fis = new FilterInputStream();
	// FilterOutputStream fos = new FilterOutputStream();

	public static void main(String args[]) {
		byte[] s = { 65, 65, 34, 54, 43, 77, 33, 22, 24, 4, 43, 23, 23, 23, 1, 22, 65, 43, 23, 57, 68 };
//		OutputStream os = null;
//		InputStream is = null;
//		FilterInputStream fiss = null;
//		FilterOutputStream fos = null;
//		InputStream f = null;
		try (FilterOutputStream fos1 =	new FilterOutputStream(new FileOutputStream("C:\\Documents and Settings\\admin\\Desktop\\imp data\\fis.txt"));FilterInputStream br = new BufferedInputStream(
				new FileInputStream("C:\\Documents and Settings\\admin\\Desktop\\imp data\\fis.txt"));
				
				) {
			fos1.write(s);
			Integer b = null;
			while ((b = br.read()) != -1) {

				System.out.println(b);

			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		/*try {os = new FileOutputStream("C:\\Documents and Settings\\admin\\Desktop\\imp data\\fis.txt");
			fos = new FilterOutputStream(os);
			f= new FileInputStream("C:\\Documents and Settings\\admin\\Desktop\\imp data\\fis.txt");
			fiss = new BufferedInputStream(f); 
			fos.write(s);
			Integer b = null;
			while ((b = fiss.read()) != -1) {

				System.out.println(b);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
