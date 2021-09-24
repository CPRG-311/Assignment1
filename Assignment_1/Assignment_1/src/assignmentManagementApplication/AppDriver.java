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
			
			
			Shape newArry[] = new Shape[size + 1];
			
			
			
			for(int i = 0; i < size; i++) {
				
			
			String shapeName = line.nextToken().toString();
			Double number1 = Double.parseDouble(line.nextToken());
			Double number2 = Double.parseDouble(line.nextToken());
			
			Shape shape = new Shape(shapeName,number1,number2);
			shape.setShapeName(shapeName);
			shape.setNumber1(number1);
			shape.setNumber2(number2);
			newArry[counter] = shape;
			
			
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
