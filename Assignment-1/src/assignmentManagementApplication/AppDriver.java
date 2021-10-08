package assignmentManagementApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import exceptions.*;
import utilities.*;

public class AppDriver {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException,
		InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, sortTypeException, compareTypeException {
			
			String[] commandInput = args;
			String filename = "";
			String compareType = "";
			String sortType = "";
			
			BaseAreaCompare compareByA = null; VolumeCompare compareByV = null;
			try {
				for (String command: commandInput) {
					if (command.startsWith("–f") || command.startsWith("–F")) {
						filename = command.substring(2);
					}
					else if (command.startsWith("–t") || command.startsWith("–T")) {
						String letter = command.substring(2);
						switch (letter.toLowerCase()) {
						case "a":
							compareType = "BaseAreaCompare";
							compareByA = new BaseAreaCompare();
							break;
						case "v":
							compareType = "VolumeCompare";
							compareByV = new VolumeCompare();
							break;
						case "h": compareType = null; break;
						default: throw new compareTypeException("Invalid Compare Type, please enter a new command.");
						}
					}
					else if (command.startsWith("–s") || command.startsWith("–S")) {
						String letter = command.substring(2);
						
						switch (letter) {
						case "q": sortType = "QuickSort"; break;
						case "b": sortType = "BubbleSort"; break;
						case "s": sortType = "SelectionSort"; break;
						case "i": sortType = "InsertionSort"; break;
						case "m": sortType = "MergeSort"; break;
						case "z": sortType = "CombSort"; break;
						default: throw new sortTypeException("Invalid Sort Type, please enter a new command.");
						}
					}
				}
				if (sortType.equals("")) {
					throw new sortTypeException("Sort type not found. Please enter command using correct format.");
				}
				if (compareType.equals("")) {
					throw new compareTypeException("Compare type not found. Please enter command using correct format.");
				}
			} catch (sortTypeException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			} catch (compareTypeException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			if (sortType.equals("")) {
				throw new sortTypeException("Sort type not found. Please enter command using correct format.");
			}
			
			
			Shape[] array = null;
			try {
				array = loadArray(filename);
			} catch (NullPointerException e) {
				System.out.println("Cannot find the file specified. Please enter a new command.");
				System.exit(0);
			}
			
			long timeTaken = 0;
			if (array != null) {
				if (compareType == "VolumeCompare" && compareByV != null) {
					timeTaken = sortArray(array, sortType, compareByV);
				}
				else if(compareType == "BaseAreaCompare" && compareByA != null) {
					timeTaken = sortArray(array, sortType, compareByA);
				}
				else {
					timeTaken = sortArray(array, sortType, null);
				}
			}
			
			for (int i = 0; i < array.length; i++) {
				if (i==0 || i==array.length - 1 || i%1000==0) {
					System.out.println(array[i].toString());
				}
			}
			System.out.println("The " + sortType + " took " + timeTaken + " ms.");
	}

	private static <T> long sortArray(Shape[] array, String sortType, Comparator<? super Shape> compareBy) {
		long start, stop;
		
		start = System.currentTimeMillis();
		switch (sortType) {
		case "SelectionSort": 
			SelectionSort.sort(array, compareBy);
			break;
		case "MergeSort":
			MergeSort.sort(array, 0, array.length - 1, compareBy);
			break;
		case "InsertionSort":
			InsertionSort.sort(array, array.length, compareBy);
			break;
		case "BubbleSort":
			BubbleSort.sort(array, compareBy);
			break;
		case "CombSort":
			CombSort.sort(array, compareBy);
			break;
		case "QuickSort": 
			QuickSort.sort(array, compareBy);
		}
		stop = System.currentTimeMillis();
		
		return stop - start;
		
	}

	private static Shape[] loadArray(String filename) {
		try {
			BufferedReader file = new BufferedReader(new FileReader("res/" + filename));
			String input = file.readLine();
			
			int counter = 0;
			StringTokenizer line = new StringTokenizer(input," ");
			
			int size = Integer.parseInt(line.nextToken());
			Shape[] shapes = new Shape[size];
			
			
			for(int i = 0; i < size;i++) {
			
				String shapeName = line.nextToken().toString();
				Object o = null;
				
				//used reflection to make it more efficient
				String className = "assignmentManagementApplication."+shapeName;
				Class cls = Class.forName(className);
				
				if(className.compareTo("assignmentManagementApplication." + shapeName) == 0)	{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					
					Constructor<? super Shape> ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(Double.parseDouble(line.nextToken()));
					argList[1] = new Double(Double.parseDouble(line.nextToken()));
			
					o = ct.newInstance(argList);
					shapes[counter] = (Shape)o;
					counter++;
				}
			}
			return shapes;
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
		catch(SecurityException e) {
			e.printStackTrace();
		}
		catch(InstantiationException e) {
			e.printStackTrace();
		}
		catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}

