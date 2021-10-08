package utilities;

import java.util.Comparator;

import assignmentManagementApplication.Shape;

public class InsertionSort {
	
	/**
	 * @author Ashley Drinkill, Ethan Wright
	 * 
	 * This method sorts through the array provided by transversing the list and sending the
	 * smallest value to the end of the array and making the scope smaller by one each time
	 * @param array takes in the array from the appdriver
	 * @param len takes in the length of the array
	 * @param c takes the sort type for how to sort the array, if null the default compareTo() is used
	 */
	public static void sort(Shape[] array, int len, Comparator<? super Shape> c)
	{
		for(int i = 1; i < len; ++i) 
		{
			Shape current = array[i];
			int previousIndex = i - 1;
			
			// runs if not comparing by default
			if (c != null) {
				while(previousIndex >= 0 && (c.compare(array[previousIndex],current) == -1))
				{
					array[previousIndex + 1] = array[previousIndex];
					previousIndex = previousIndex - 1;
				}
				array[previousIndex + 1] = current;
			}
			// runs if comparing by default
			else {
				while(previousIndex >= 0 && (array[previousIndex].compareTo(current) == -1))
				{
					array[previousIndex + 1] = array[previousIndex];
					previousIndex = previousIndex - 1;
				}
				array[previousIndex + 1] = current;
			}			
		}
	}
}

