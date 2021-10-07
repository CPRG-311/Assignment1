package utilities;

import java.util.Comparator;

public class BubbleSort 
{
	//something is not working, it never ends, in a continuous loop
	public static <T> void sort(T[] shape, Comparator<? super T> comp)	{
		for(int i = 0; i < shape.length - 1; i++)
		{
			if(comp.compare(shape[i], shape[i+1]) == -1)
			{
				swapElements(shape, i, i+1);
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
