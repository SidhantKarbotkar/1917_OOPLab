package ex03;

import java.util.Scanner;

public class mainApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size_of_arr = s.nextInt();
		int arr[] = new int[size_of_arr];
		System.out.println("Enter elements in the Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+" ==> ");
			arr[i] = s.nextInt(); 
		}
		s.close();
		
		System.out.println("Array");
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++)System.out.print(arr[i] + " ");
		System.out.print(" ]");
		System.out.println();
			
		int arr1[] = new int[size_of_arr],arr2[] = new int[size_of_arr],arr3[] = new int[size_of_arr];
		System.arraycopy(arr, 0, arr1, 0,arr.length);
		System.arraycopy(arr, 0, arr2, 0,arr.length);
		System.arraycopy(arr, 0, arr3, 0,arr.length);
			
			
		//bubble sort
		BubbleSort bsort = new BubbleSort();
		bsort.bubbleSort(arr1);
		//selection sort
		SelectionSort ssort = new SelectionSort();
		ssort.selectionSort(arr2);
		//Insertion sort
		InsertionSort isort = new InsertionSort();
		isort.insertionSort(arr3);
	}
}
