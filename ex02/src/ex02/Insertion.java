package ex02;
import java.util.Scanner;

public class Insertion {
	static void InsertionSort(int[] arr) {
		  int n = arr.length;
	        for (int j = 1; j < n; j++){
	        	int key = arr[j],i = j-1;
	            while ( (i > -1) && ( arr[i] > key ) ) {
	                arr[i+1] = arr[i];
	                i--;
	            } 
	            arr[i+1] = key;
	            for(int k=0;k<arr.length;k++) System.out.print(arr[k] + "\t");
	            System.out.println();
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size_of_arr = s.nextInt();
		int arr[] = new int[size_of_arr];
			System.out.println("Enter elements in the Array");
			for (int i = 0; i < arr.length; i++) {
				System.out.println((i+1)+" ==> ");
				arr[i] = s.nextInt(); 
			}
			System.out.println("Array");
			System.out.print("[ ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print(" ]");
			System.out.println();
			InsertionSort(arr);
			
			System.out.println("The elements you entered in sorted oder");
			System.out.print("[ ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print(" ]");
	}
}
