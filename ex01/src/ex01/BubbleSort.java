package ex01;

public class BubbleSort {
	static void bubbleSort(int[] array) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] ={3,60,35,2,45,320,5};
        
        System.out.println("Array");
        System.out.print("=> [");
        for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
        }
        System.out.print("]");
        System.out.println();
        
        bubbleSort(array);
         
        System.out.println("Array After Bubble Sort");
        System.out.print("=> [");
        for(int i=0; i < array.length; i++){
                System.out.print(array[i] + " ");  
        }
        System.out.print("]");
	}
}
