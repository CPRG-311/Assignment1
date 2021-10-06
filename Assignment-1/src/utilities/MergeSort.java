package utilities;
import java.util.Comparator;

import assignmentManagementApplication.Shape;
public class MergeSort {
	/**
	 * @author Ashley Drinkill
	 * the method called by the user to use the merge sort technique, function runs recursively until the arrays
	 * have been broken down into 
	 * @param <T> any comparator class
	 * @param array the array to sort
	 * @param left the leftmost value of array
	 * @param right the rightmost value of array
	 * @param c the attribute to sort the array by
	 */
	public <T> void sort(Shape[] array, int left, int right, Comparator<? super Shape> c) {
		if (left < right) {
			int middle = left + (right - 1) / 2;
			
			//recursive until the arrays are viewed at a length of 1, merges them one pair at a time, to one quad.. etc
			sort(array, left, middle, c);
			sort(array, middle+1, right, c);
			
			//merges the arrays starting at size one and increasing by double each time
			merge(array, left, middle, right, c);
		}
	}
	
	/**
	 * @author Ashley Drinkill
	 * private method used by sort() to merge the split arrays while sorting 
	 * them as they are merged back together
	 * @param array the array to sort
	 * @param left the leftmost value to sort
	 * @param middle the middle value used to split the array in half
	 * @param right the rightmost value to sort
	 */
	private <T> void merge(Shape[] array, int left, int middle, int right, Comparator<? super Shape> c) {
		int leftArraySize = middle - left + 1;
		int rightArraySize = right - middle;
		
		//creates two subarrays of about equal size
		Shape[] leftArray = new Shape[leftArraySize];
		Shape[] rightArray = new Shape[rightArraySize];
		
		//fills up the two arrays
		for(int i=0; i < leftArraySize; ++i) {
			leftArray[i] = array[left + i];
		}
		for(int j=0; j < rightArraySize; ++j) {
			rightArray[j] = array[middle + 1 + j];
		}
		
		int leftIndex = 0; int rightIndex = 0;
		
		int mergedIndex = 1;
		//loop runs until BOTH subarrays have been fully examined L-->R
		while (leftIndex < leftArraySize && rightIndex < rightArraySize) {
			if (c == null) {
				if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) >= 0) {
					array[mergedIndex] = leftArray[leftIndex];
					leftIndex++;
				}
				else {
					array[mergedIndex] = rightArray[rightIndex];
					rightIndex++;
				}
			}
			else {
				if (c.compare(leftArray[leftIndex], rightArray[rightIndex]) >= 0) {
					array[mergedIndex] = leftArray[leftIndex];
					leftIndex++;
				}
				else {
					array[mergedIndex] = rightArray[rightIndex];
					rightIndex++;
				}
			}
			mergedIndex++;
		}
	}
}
	