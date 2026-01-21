// Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array. 

package sorting;
import java.util.Scanner;

public class selectionSort {
    public static int[] selection_sort(int[] arr){
        int n = arr.length;
        
        for(int i = 0; i<n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        selection_sort(arr);

        System.out.print("Sorted Array is: ");
        for(int value: arr){
            System.out.print(value + " ");
        }
        sc.close();
    }
}
