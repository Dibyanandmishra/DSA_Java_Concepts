// Problem Statement: Given an array of size n, the task is to find sum of all the elements in the array.

package ProblemsOnArray;
import java.util.Scanner;

public class sumOfElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int e : arr){
            sum = sum + e;
        }

        System.out.print("The sum of all the elements of array is: " + sum);
        sc.close();
    }
}

