package ex03;

public class BubbleSort {
	void bubbleSort(int[] arr) {
		int n = arr.length, temp = 0;
		for(int i=0; i < n; i++) {
			for(int j=1; j < (n-i); j++) {
					if(arr[j-1] > arr[j]) {
						temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
			}
		}
		System.out.println("The elements you entered in sorted oder using Bubble Sort");
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.print(" ]");
		System.out.println();
	}
}