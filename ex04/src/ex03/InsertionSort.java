package ex03;

public class InsertionSort {
	void sort(int[] arr) {
	  int n = arr.length;
	       for (int j = 1; j < n; j++){
	       	int key = arr[j],i = j-1;
	           while ( (i > -1) && ( arr[i] > key ) ) {
	               arr[i+1] = arr[i];
	               i--;
	           } 
	           arr[i+1] = key;
	       }
	}
	void print(int[] arr){
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
		}
		System.out.print(" ]");
		System.out.println();
	}
}
