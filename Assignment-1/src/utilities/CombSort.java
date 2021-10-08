package utilities;

import java.util.Comparator;
import assignmentManagementApplication.Shape;

public class CombSort 
{
	/**
	 * @author Kolby Robertson
	 * @param gap
	 * @return
	 * returns the next smaller gap
	 */
	static int getNextGap(int gap)
	{
		gap = (gap*10)/13;
		if (gap < 1)
		{
			return 1;
		}
		return gap;
	}
	/**
	 * @author Kolby Robertson
	 * @param <T>
	 * @param shape
	 * @param comp
	 * the method called by the user to use the comb sort technique
	 */
	public static <T> void sort(Shape[] shape, Comparator<? super Shape> comp)
	{
		int n = shape.length;
		int gap = n;
		boolean swapped = true;
		
		while (gap !=1 || swapped == true)
		{
			gap = getNextGap(gap);
			swapped = false;
			// loops through the gap in the array
			for(int i = 0; i<n-gap; i++)
			{
				// if comp is null it uses compareTo to compare the elements in the array
				if(comp == null)
				{
					if(((Shape) shape[i]).compareTo(shape[i+gap]) == 1)
					{
						//swaps the elements 
						swapElements(shape, i,i+gap);
						swapped = true;
					}
				}
				else
				{
					// if comp is not null it uses compare to compare the elements in the array
					if(comp.compare(shape[i], shape[i+gap]) == 1)
					{
						swapElements(shape, i,i+gap);
						swapped = true;
					}
				}
			}
		}
	}
	/**
	 * @author Kitty Wong
	 * @param <T>
	 * @param shape
	 * @param i
	 * @param j
	 * swaps the given elements in the given array
	 */
	private static <T> void swapElements( T[] shape, int i, int j )
	{
		T temp = shape[i];
		shape[i] = shape[j];
		shape[j] = temp;
	}

	
}
