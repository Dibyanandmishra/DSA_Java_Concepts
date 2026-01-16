// Given an array of n elements. The task is to reverse the given array. The reversal of array should be inplace.

package ProblemsOnArray;
import java.util.Scanner;

public class reverseArray {
    public static void reverseTheArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        reverseTheArray(arr);
        sc.close();
    }
}
