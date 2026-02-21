// Find the medain of the given array.

package ProblemsOnArray;
import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n % 2 == 0) {
            double median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
            System.out.println("Median of this array is: " + median);
        } else {
            int median = arr[n/2];
            System.out.println("Median of this array is: " + median);
        }

        sc.close();
    }
}
