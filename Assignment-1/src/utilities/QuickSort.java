package utilities;

public class QuickSort {
	static void swap(int[] Shape, int i, int j) {
		int check = Shape[i];
		Shape[i] = Shape[j];
		Shape[j] = check;
	}
	static int part(int[] Shape, int min, int max) {
		int piv = Shape[max];
		int i = (min - 1);
		
		for (int j = min; j <= max - 1; j++) {
			if (Shape[j] < piv) {
				i++;
				swap(Shape, i, j);
			}
		}
		swap(Shape, i + 1, max);
		return (i + 1);
		
	}
	static void quickSort(int[] Shape, int min, int max) {
		if(min < max) {
			int pi = part(Shape, min, max);
			quickSort(Shape, min, pi - 1);
			quickSort(Shape, pi + 1, max);
		}
	}
}
