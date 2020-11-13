package ex02;
import java.util.Scanner;

public class SelectionSort {
	static void SelectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++) {  
            int index = i;
            for (int j = i+1; j<arr.length; j++) if (arr[j] < arr[index]) index = j;
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            for (int k = 0; k<arr.length;k++) System.out.print(arr[k]+ "\t");
            System.out.println();
        }  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size_of_arr = s.nextInt();
		int arr[] = new int[size_of_arr];
		
		System.out.println("Please enter elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			arr[i] = s.nextInt(); 
		}
		System.out.println("The elements in the array are=>");
		System.out.print('[');
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+ " ");
		System.out.print("]\n");
		
		SelectionSort(arr);
		
		System.out.println("The Sorted elements in the array are=>");
		System.out.print('[');
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.print("]\n");
	}
}
