package utilities;

import java.util.Comparator;

public class Comb_Sort 
{
	
	static int getNextGap(int gap)
	{
		gap = (gap*10)/13;
		if (gap < 1)
		{
			return 1;
		}
		return gap;
	}
	public static <T> void CombSort(T[] shape, Comparator<? super T> comp)
	{
		int n = shape.length;
		int gap = n;
		boolean swapped = true;
		
		while (gap !=1 || swapped == true)
		{
			gap = getNextGap(gap);
			swapped = false;
			
			for(int i = 0; i<n-gap; i++)
			{
				if(comp.compare(shape[i], shape[i+gap]) == -1)
				{
					swapElements(shape, i,i+gap);
					swapped = true;
				}
			}
		}
	}
	private static <T> void swapElements( T[] shape, int i, int j )
	{
		T temp = shape[i];
		shape[i] = shape[j];
		shape[j] = temp;
	}

	
}