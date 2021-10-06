package assignmentManagementApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.util.Comparator;
import java.util.StringTokenizer;

import utilities.*;

public class AppDriver {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException,
		InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			
			String[] commandInput = args;
			String filename = "";
			String compareType = "";
			String sortType = "";
			
			BaseAreaCompare compareByA = null; VolumeCompare compareByV = null;
			for (String command: commandInput) {
				if (command.startsWith("-f") || command.startsWith("-F")) {
					filename = command.substring(2);
				}
				else if (command.startsWith("-t") || command.startsWith("-T")) {
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
					default: // add compareType exception
					}
				}
				else if (command.startsWith("-s") || command.startsWith("-S")) {
					String letter = command.substring(2);
					switch (letter) {
					case "q": sortType = "QuickSort"; break;
					case "b": sortType = "BubbleSort"; break;
					case "s": sortType = "SelectionSort"; break;
					case "i": sortType = "InsertionSort"; break;
					case "m": sortType = "MergeSort"; break;
					case "z": sortType = "CombSort"; break;
					default: // add sortType exception
					}
				}
			}
			Shape[] array = null;
			try {
				array = loadArray(filename);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			
			if (array != null) {
				if (compareType == "VolumeCompare" && compareByV != null) {
					sortArray(array, sortType, compareByV);
				}
				else if(compareType == "BaseAreaCompare" && compareByA != null) {
					sortArray(array, sortType, compareByA);
				}
				else {
					sortArray(array, sortType, null);
				}
			}
			
			
			
	}

	private static <T> void sortArray(Shape[] array, String sortType, Comparator<? super Shape> compareBy) {
		
		switch (sortType) {
		case "SelectionSort": 
			SelectionSort.sort(array, compareBy);
			break;
		case "MergeSort":
			MergeSort.sort(array, 0, array.length - 1, compareBy);
			break;
		case "InsertionSort":
			//add params
			//InsertionSort.sort();
			break;
		case "BubbleSort":
			BubbleSort.sort(array, compareBy);
			break;
		case "CombSort":
			CombSort.sort(array, compareBy);
			break;
		}
		
	}

	private static Shape[] loadArray(String filename) {
		try {
			BufferedReader file = new BufferedReader(new FileReader(filename));
			String input = file.readLine();
			
			
			int counter = 0;
			StringTokenizer line = new StringTokenizer(input," ");
			
			int size = Integer.parseInt(line.nextToken());
			Shape[] shapes = new Shape[size];
			
			
			
			for(int i = 0; i < size;i++) {
			
				String shapeName = line.nextToken().toString();
				Object o = null;
				//trying to use reflection to make it more efficient
				
				String className = "assignmentManagementApplication."+shapeName;
				Class cls = Class.forName(className);
				
				if(className.compareTo("assignmentManagementApplication." + shapeName) == 0)	{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					
					Constructor ct = cls.getConstructor(paramTypes);
					
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

