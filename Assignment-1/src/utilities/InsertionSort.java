package utilities;

import java.util.Comparator;

import assignmentManagementApplication.Shape;

public class InsertionSort {
	/*
	static void insertionSort(int arr[], int n)
	{
		if (n <= 1)
		{
			return;
		}
		
		insertionSort(arr, n-1);
		int last = arr[n-1];
		int j = n-2;
		
		while (j >= 0 && arr[j] > last)
		{
			arr[j+1] =arr[j];
			j--;
		}
		arr[j+1]= last;
	}
	*/
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
			
			System.out.println("Looped");
			for (Shape s: array) {
				System.out.println(s.calculateVolume());
			}
		}
		array[counter+1] = lastShape;
		
	}

	private static void swap(Shape[] array, int counter, int next) {
		Shape temp = array[counter];
		array[counter] = array[next];
		array[next] = temp;
	}
}
