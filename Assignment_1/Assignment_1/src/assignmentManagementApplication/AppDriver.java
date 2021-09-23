package assignmentManagementApplication;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class AppDriver {
	
	public static void main(String[] args) 
	{
		try {
			BufferedReader file = new BufferedReader(new FileReader("Assignment_1/res/polyfor1.txt"));
			String input = file.readLine();
			StringTokenizer line = new StringTokenizer(input," ");
			
		int counter = 0;
			int size = Integer.parseInt(line.nextToken());
			
		
			Shape[] shapes = new Shape[size + 1];
			while(line != null)
			{
				
				
			
			String shapeName = line.nextToken();
			String number1 = line.nextToken();
			String number2 = line.nextToken();
			
			Shape shape = new Shape(shapeName,number1,number2);
			shapes[counter] = shape;
			
			counter++;
				
		
			}
			
			
				
			
			
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
