package at.test.list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListTest {
	static int rows;
	//static int col;

	public static void main(String[] args) {
		GenerateByteBinary byteObj=new GenerateByteBinary();

		//String line="";
		File file = new File("res/file.txt");
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		ArrayList<String> feedData = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				ArrayList<String> line = new ArrayList<String>();
				final String nextLine = sc.nextLine();
				final String[] items = nextLine.split(" ");
				 for (int i = 0; i < items.length; i++) {
			            line.add(items[i]);
			        }
				 data.add(line);
				 
				// byteObj.generateByte(line);
				rows++;
				 Arrays.fill(items, null);
			}
			//col = data.get(2).size();
			//System.out.println("col is " + col);
			
	       for (int i = 0; i < rows; i++) {
	    	   String value1="";
	            for (int j = 0; j < data.get(i).size(); j++) {

	            	// System.out.print(data.get(i).get(j) + " ");
	            	 
	                 value1+=data.get(i).get(j) + " ";
	            }
	            
	            
	            value1+="\n";
	           String displayValue= byteObj.generateByte(value1);
	            
	            System.out.print(displayValue);

	        }
	    //    System.out.println("rows is " + rows);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
