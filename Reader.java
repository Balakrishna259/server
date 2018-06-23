package com.java.excel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("C:\\Documents and Settings\\admin\\Desktop\\imp data\\jefferson_stats.txt");
		BufferedReader br = new BufferedReader(fr);
		
		try {
			System.out.println(br.readLine());
			System.out.println(" Read Executed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reader r = new Reader();
		//r.writeStats(2,2,2,2,2);
		System.out.println("This is executed");
	}
	
	BufferedWriter writer;

	public void writeStats(int word, int numSent, int shortest, int longest, int average)
	{
	    try
	    {
	        File file = new File("C:\\Documents and Settings\\admin\\Desktop\\imp data\\jefferson_stats.txt");
	        file.createNewFile();

	        writer = new BufferedWriter(new FileWriter(file));

	        writer.write("Number of words: " + word );
	        writer.newLine();
	        writer.write("Number of sentences: " + numSent );
	        writer.newLine();
	        writer.write("Shortest sentence: " + shortest + " words");
	        writer.newLine();
	        writer.write("Longest sentence: " + longest + " words");
	        writer.newLine();
	        writer.write("Average sentence: " + average + " words");    
	    }
	    catch(FileNotFoundException e)
	    {
	        System.out.println("File Not Found");
	        System.exit( 1 );
	    }
	    catch(IOException e)
	    {
	        System.out.println("something messed up");
	        System.exit( 1 );
	    }
	}
	
		// TODO Auto-generated method stub

	}


