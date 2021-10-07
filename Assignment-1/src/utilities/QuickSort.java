package utilities;

import java.util.Comparator;

import assignmentManagementApplication.Shape;

public class QuickSort {
	public static <T> void quickSort(T[] shape, Comparator<? super T> comp){
		recursiveQuickSort(shape, 0, shape.length-1, comp);
	}

	private static <T> void recursiveQuickSort(T[] shape, int min, int max, Comparator<? super T> comp) {
		int start = partition(shape, min, max, comp);
		if (min < start - 1) {
			recursiveQuickSort(shape, start, min-1, comp);
		}
		if (max < start) {
			recursiveQuickSort(shape, start, max, comp);
		}
		
	}

	private static <T> int partition(T[] shape, int min, int max, Comparator<? super T> comp) {
		T pivot = (T) shape[min];
		while (min <= max) {
			while(comp.compare(shape[min], pivot) < 0) {
				min++;
			}
			while(comp.compare(shape[max], pivot) > 0 ) {
				max++;
			}
			if(min <= max) {
				swapElements(shape, min, max);
				min++;
				max--;
			}
		}
		return min;
	}


private static <T> void swapElements( T[] shape, int i, int j )
{
	T temp = shape[i];
	shape[i] = shape[j];
	shape[j] = temp;
}
}