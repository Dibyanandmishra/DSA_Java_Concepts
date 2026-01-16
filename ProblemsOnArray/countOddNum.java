// Given an array of n elements. The task is to return the count of the number of odd numbers in the array. 

package ProblemsOnArray;
import java.util.Scanner;

public class countOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0; 
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }

        System.out.print("The number of odd elements is: "+ count);
        sc.close();
    }
}
