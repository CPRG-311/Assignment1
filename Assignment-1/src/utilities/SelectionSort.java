package utilities;

import java.util.Comparator;

import assignmentManagementApplication.*;

public class SelectionSort {
	/**
	 * @author Ashley Drinkill
	 * This sorts the array using selection sort, which takes the largest Shape and send it to the
	 * beginning of the list, and slowly making the subarray smaller with each run of the for loop
	 * @param <T> any Comparator class
	 * @param array an array of Shape objects
	 * @param c the attribute to sort the array by
	 */
	public static <T> void sort(Shape[] array, Comparator<? super Shape> c) {
		int len = array.length;
		
		for (int i = 0; i < len-1; i++) {
			Shape currentMinShape = array[i];
			int currentMinIndex = i;
			// loops for the 'subarray' starting at the value next to the start of unsorted elements
			for (int j = i+1; j < len; j++) {
				Shape currentShape = array[j];
				int result = -2;
				if (c != null) {
					result = c.compare(currentShape,currentMinShape);
				}
				else {
					result = currentShape.compareTo(currentMinShape);
				}
				if (result == 1) {
					currentMinIndex = j;
					currentMinShape = array[j];
				}
			}
			// if the smallest value found was not the initial smallest value
			if(currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMinShape;
			}
		}
	}
}


