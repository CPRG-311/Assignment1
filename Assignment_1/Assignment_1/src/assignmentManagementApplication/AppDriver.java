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
			
			// Were not creating shape objects, the Shape class is simply the box to store
			// all of the specific shapes
			// you have to read in the shape type and create that specific shape,
			// eg. if it reads cone: Shape shape = (Shape)new Cone(num1, num2);
			Shape shape = new Shape(shapeName);
			shape.setShapeName(shapeName);
			
			Shape cone = (Shape)new Shape(number1, number2);
			cone.setNumber1(number1);
			cone.setNumber2(number2);
			newArry[counter] = cone;
			
			Shape cylinder = (Shape)new Shape(number1, number2);
			cylinder.setNumber1(number1);
			cylinder.setNumber2(number2);
			newArry[counter] = cylinder;
			
			Shape octagonalPrism = (Shape)new Shape(number1, number2);
			octagonalPrism.setNumber1(number1);
			octagonalPrism.setNumber2(number2);
			newArry[counter] = octagonalPrism;
			
			Shape pentagonalPrism = (Shape)new Shape(number1, number2);
			pentagonalPrism.setNumber1(number1);
			pentagonalPrism.setNumber2(number2);
			newArry[counter] = pentagonalPrism;
			
			Shape prism = (Shape)new Shape(number1, number2);
			prism.setNumber1(number1);
			prism.setNumber2(number2);
			newArry[counter] = prism;
			
			Shape pyramid = (Shape)new Shape(number1, number2);
			pyramid.setNumber1(number1);
			pyramid.setNumber2(number2);
			newArry[counter] = pyramid;
			
			Shape squarePrism = (Shape)new Shape(number1, number2);
			squarePrism.setNumber1(number1);
			squarePrism.setNumber2(number2);
			newArry[counter] = squarePrism;
			
			Shape triangularPrism = (Shape)new Shape(number1, number2);
			triangularPrism.setNumber1(number1);
			triangularPrism.setNumber2(number2);
			newArry[counter] = triangularPrism;
			
			
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
