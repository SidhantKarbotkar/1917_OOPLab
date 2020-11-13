package ex03;

public class BubbleSort {
	void sort(int[] array) {
        int n = array.length, temp = 0;
        for(int i=0; i < n; i++) {
                 for(int j=1; j < (n-i); j++) {
                          if(array[j-1] > array[j]) {
                                 temp = array[j-1];
                                 array[j-1] = array[j];
                                 array[j] = temp;
                         }
                 } 
         }
	}
	public void print(int[] arr){
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
		}
		System.out.print(" ]");
		System.out.println();
	}
}
