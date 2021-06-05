package helloworld;
import java.util.Scanner;

public class InsertionSort {
	private void insertionSorting (int[] items) {
		for (int i=1; i<items.length; i++) {
				int key = items[i];
				int j = i-1;
				
				while (j>=0 && items[j] > key) {
					items[j+1] = items[j];
					j = j-1;
				}
				items[j+1] = key;
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
	    System.out.println("Enter number of integers you want to input:");
	    int n = myObj.nextInt();

	    // Numerical input
	    int[] arr = new int[n];
	    int i = 0;
	    System.out.println("Enter integers:");
	    while (i < n) {
	    	int number = myObj.nextInt();
	    	arr[i] = number;
	    	i++;
	    }

		InsertionSort ob = new InsertionSort();
		ob.insertionSorting(arr);

		// Output input by user in order ascendingly
	    System.out.println("Your sorted numbers:");
		printArray(arr);
	}
}
