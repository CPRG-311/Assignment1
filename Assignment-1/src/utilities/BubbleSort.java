package utilities;

import java.util.Comparator;

import assignmentManagementApplication.Shape;

public class BubbleSort 
{
	public static <T> void sort(Shape[] shape, Comparator<? super Shape> comp)	{
		for(int i = 0; i < shape.length - 1; i++)
		{
			for(int j=0; j < shape.length - 1; j++) {
				if (comp != null) {
					if(comp.compare(shape[j], shape[j+1]) == -1)
					{
						swapElements(shape, j, j+1);
					}
				}
				else {
					if(shape[j].compareTo(shape[j+1]) == -1)
					{
						swapElements(shape, j, j+1);
					}
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
