// Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

package ProblemsOnArray;
import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = -1;

        for(int i=1; i<n; i++){
            if(largest<arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
        }

        if(secondLargest == -1){
            System.out.print("SecondLargest element does not exist. ");
        }
        else{
            System.out.println("The second largest element in the array is: "+ secondLargest);
        }

        sc.close();
    }
}
