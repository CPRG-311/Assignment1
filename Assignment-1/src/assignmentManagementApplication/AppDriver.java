package assignmentManagementApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;

public class AppDriver {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
			BufferedReader file = new BufferedReader(new FileReader("Assignment-1/res/polyfor1.txt"));
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
				
				if(className.compareTo("assignmentManagementApplication." + shapeName) == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(Double.parseDouble(line.nextToken()));
					argList[1] = new Double(Double.parseDouble(line.nextToken()));
			
					o = ct.newInstance(argList);
					
				}
				
				System.out.println(o);
			file.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //catch (InvalidShapeError e) {
			//e.printMessage();
		//}
		
		
		
	}

}
