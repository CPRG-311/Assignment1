package utilities;

import java.util.Comparator;

import assignmentManagementApplication.Shape;

public class InsertionSort {
	
	/**
	 * @author 826847
	 * 
	 * This method sorts through the array provided by inserting 
	 * @param arr takes in the array from the appdriver
	 * @param n takes in the number from appdriver letting the algorithm know how many iterations it has to do
	 */
	/*
	public static void sort(Shape[] array, int len, Comparator<? super Shape> c) {
		if (len <= 1) {
			return;
		}
		sort(array, len - 1, c);
		Shape lastShape = array[len-1];
		int counter = len - 2;
		
		while (counter >= 0) {
			Shape currentShape = array[counter];
			if (c != null) {
				if (c.compare(currentShape, lastShape) < 0) {
					swap(array, counter, counter + 1);
					counter--;
				}
			}
			else {
				if (currentShape.compareTo(lastShape) < 0) {
					swap(array, counter, counter + 1);
					counter--;
				}
			}
			int current = arr[i];
			int previousElement = i - 1;
			
			System.out.println("Looped");
			for (Shape s: array) {
				System.out.println(s.calculateVolume());
			while(previousElement >= 0 && arr[previousElement] > current)
			{
				arr[previousElement + 1] = previousElement;
				previousElement = previousElement - 1;
				
			}
			arr[previousElement + 1] = current;
			
		}
		array[counter+1] = lastShape;
		
	}

	private static void swap(Shape[] array, int counter, int next) {
		Shape temp = array[counter];
		array[counter] = array[next];
		array[next] = temp;
	}
}
	
	
	
	*/
	
	
	
	public static void sort(Shape[] array, int len, Comparator<? super Shape> c)
	{
		for(int i = 1; i < len; ++i) 
		{
			Shape current = array[i];
			int previousIndex = i - 1;
			Shape previous = array[previousIndex];
			
			if (c != null) {
				while(previousIndex >= 0 && (c.compare(array[previousIndex],current) == -1))
				{
					array[previousIndex + 1] = array[previousIndex];
					previousIndex = previousIndex - 1;
				}
				array[previousIndex + 1] = current;
			}
			else {
				while(previousIndex >= 0 && (array[previousIndex].compareTo(current) == -1))
				{
					array[previousIndex + 1] = array[previousIndex];
					previousIndex = previousIndex - 1;
				}
				array[previousIndex + 1] = current;
			}
			System.out.println("Looped");
			for (Shape s: array) {
				System.out.println(s.calculateVolume());
			}
			
		}
	}
}

