package ex03;

public class SelectionSort {
	void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++) {  
            int index = i;
            for (int j = i+1; j<arr.length; j++) if (arr[j] < arr[index]) index = j;
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("The elements you entered in sorted oder using Selection Sort");
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.print(" ]");
		System.out.println();
	}
}

