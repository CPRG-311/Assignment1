package utilities;

import assignmentManagementApplication.*;

public class SelectionSort {
	public static void sortHeight(Shape[] array) {
		//start with unsorted array
		//each outer iteration is one sort
		//each inner iteration is min of unsorted
		//find the min of unsorted using for loop
		//switch position of with with pos of the outer loop
		//repeat
		System.out.println(array);
		
		int len = array.length;
		
		for (int i = 0; i < len-1; i++) {
			Shape currentMinShape = array[i];
			double currentMinShapeHeight = currentMinShape.getHeight();
			int currentMinIndex = i;
			
			for (int j = i+1; j < len; j++) {
				Shape currentShape = array[j];
				double currentShapeHeight = currentShape.getHeight();
				if (currentShapeHeight < currentMinShapeHeight) {
					currentMinIndex = j;
					currentMinShape = array[j];
					currentMinShapeHeight = currentMinShape.getHeight();
				}
			}
			
			if(currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMinShape;
			}
		}
		System.out.println(array);
	}
}

