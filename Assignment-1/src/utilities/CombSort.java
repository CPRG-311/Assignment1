package utilities;

import java.util.Comparator;
import assignmentManagementApplication.Shape;

public class CombSort 
{
	
	private static int getNextGap(int gap)
	{
		gap = (gap*10)/13;
		if (gap < 1)
		{
			return 1;
		}
		return gap;
	}
	public static <T> void sort(Shape[] shapes, Comparator<? super Shape> comp)
	{
		int n = shapes.length;
		int gap = n;
		boolean swapped = true;
		
		while (gap !=1 || swapped == true)
		{
			gap = getNextGap(gap);
			swapped = false;
			
			for(int i = 0; i<n-gap; i++)
			{
				if(comp == null)
				{
					if(((Shape)shapes[i]).compareTo((Shape)shapes[i+gap]) == 1)
					{
						swapElements(shapes, i,i+gap);
						swapped = true;
					}
				}
				else
				{
					if(comp.compare(shapes[i], shapes[i+gap]) == 1)
					{
						swapElements(shapes, i,i+gap);
						swapped = true;
					}
				}
			}
		}
	}
	private static <T> void swapElements( Shape[] shape, int i, int j )
	{
		Shape temp = shape[i];
		shape[i] = shape[j];
		shape[j] = temp;
	}

	
}