package ex03;

import java.util.Scanner;

public class mainApp {
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
		s.close();
		
		int arr1[] = new int[size_of_arr],arr2[] = new int[size_of_arr],arr3[] = new int[size_of_arr];
		System.arraycopy(arr, 0, arr1, 0,arr.length);
		System.arraycopy(arr, 0, arr2, 0,arr.length);
		System.arraycopy(arr, 0, arr3, 0,arr.length);
			
			
		//bubble sort
		BubbleSort bsort = new BubbleSort();
		System.out.println("\nBubbleSort\nUnsorted Array==>");
		bsort.print(arr1);
		bsort.sort(arr1);
		System.out.println("The elements you entered in sorted oder using bubble sort");
		bsort.print(arr1);
		
		//selection sort
		SelectionSort ssort = new SelectionSort();
		System.out.println("\nSelectionSort\nUnsorted Array==>");
		ssort.print(arr2);
		ssort.sort(arr2);
		System.out.println("The elements you entered in sorted oder using Selection sort");
		ssort.print(arr2);
		
		//Insertion sort
		InsertionSort isort = new InsertionSort();
		System.out.println("\nInsertionSort\nUnsorted Array==>");
		isort.print(arr3);
		isort.sort(arr3);
		System.out.println("The elements you entered in sorted oder using Insertion sort");
		isort.print(arr3);
	}
}
