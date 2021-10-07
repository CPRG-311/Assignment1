package utilities;

public class InsertionSort {
	
	/**
	 * @author 826847
	 * 
	 * This method sorts through the array provided by inserting 
	 * @param arr takes in the array from the appdriver
	 * @param n takes in the number from appdriver letting the algorithm know how many iterations it has to do
	 */
	
	static void insertionSort(int arr[], int n)
	{
		if (n <= 1)
		{
			return;
		}
		
		insertionSort(arr, n-1);
		
		for(int i = 0; i < n; i++) 
		{
		
			int current = arr[i];
			int previousElement = i - 1;
			
			while(previousElement >= 0 && arr[previousElement] > current)
			{
				arr[previousElement + 1] = previousElement;
				previousElement = previousElement - 1;
				
			}
			arr[previousElement + 1] = current;
			
		}
	}
}

