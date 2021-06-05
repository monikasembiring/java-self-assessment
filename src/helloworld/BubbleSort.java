package helloworld;
import java.util.Scanner;

public class BubbleSort {
	private void bubbleSort (int[] items) {
		int end = items.length - 1;
		for (int i=0; i<items.length-1; i++) {
			for (int j=0; j < end; j++) {
				if (items[j+1] < items[j]) {
					int key = items[j+1];
					items[j+1] = items[j];
					items[j] = key;
				}
			}
			end--;
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
	    System.out.println("Enter number of integers you want to input (positive number):");
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

		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(arr);

		// Output input by user in order ascendingly
	    System.out.println("Your sorted numbers:");
		printArray(arr);
	}
}
