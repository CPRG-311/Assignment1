package assignmentManagementApplication;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class AppDriver {
	
	public static void main(String[] args) {
		try {
			BufferedReader file = new BufferedReader(new FileReader("Assignment_1/res/polyfor1.txt"));
			String input = file.readLine();
			StringTokenizer line = new StringTokenizer(input," ");
			
			int counter = 0;
			int size = Integer.parseInt(line.nextToken());
			
			Shape[] shapes = new Shape[size];
			
			for(int i = 0; i < size; i++) {
				String shapeName = line.nextToken().toString();
				Double number1 = Double.parseDouble(line.nextToken());
				Double number2 = Double.parseDouble(line.nextToken());
				
				Shape newShape;
				switch (shapeName) {
				case "Cone":
					newShape = (Shape)new Cone(number1, number2);
					break;
				case "Cylinder":
					newShape = (Shape)new Cylinder(number1, number2);
					break;
				case "Pyramid":
					newShape = (Shape)new Pyramid(number1, number2);
					break;
				case "OctagonalPrism":
					newShape = (Shape)new OctagonalPrism(number1, number2);
					break;
				case "PentagonalPrism":
					newShape = (Shape)new PentagonalPrism(number1, number2);
					break;
				case "SquarePrism":
					newShape = (Shape)new SquarePrism(number1, number2);
					break;
				case "TriangularPrism":
					newShape = (Shape)new TriangularPrism(number1, number2);
					break;
				default:
					newShape = null;
					throw new InvalidShapeError();
				}
				
				if (newShape != null) {
					shapes[counter] = newShape;
					counter++;
				}
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidShapeError e) {
			e.printMessage();
		}
		
		
		
	}

}
