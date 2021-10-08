package utilities;

import java.util.Comparator;
import assignmentManagementApplication.Shape;



public class BubbleSort 
{
	/**
	 * @author Kolby Robertson
	 * the method called to the user to use the bubble sort technique.
	 * @param <T> any comparator class
	 * @param shape the array we are sorting
	 * @param comp the attribute to sort the array by 
	 */
	public static <T> void sort(Shape[] shape, Comparator<? super Shape> comp)
	{
		//loops through the array
			for(int i = 0; i < shape.length -1; i++)
			{
			//continues to loop through the array
				for(int j = 0; j < shape.length -1; j++)
				{
					//if comp is null it will use compareto to compare elements the array
					if(comp == null)
					{
						if((((Shape) shape[j])).compareTo(shape[j+1]) == -1)
						{
							//swaps the elements
							swapElements(shape, j, j+1);
						}
					}
					//if comp is not null it uses compare to compare elements in the array 
					else
					{
						if(comp.compare(shape[j], shape[j+1]) == -1)
						{
							//swap the elements
							swapElements(shape, j, j+1);
						}
					}
				}
			}		
	}
	/**
	 * @auther Kitty Wong
	 * @param <T>
	 * @param shape
	 * @param i
	 * @param j
	 * 
	 * swapElemlents swaps the elements in the given array 
	 */
	private static <T> void swapElements( T[] shape, int i, int j )
	{
		T temp = shape[i];
		shape[i] = shape[j];
		shape[j] = temp;
	}

}
