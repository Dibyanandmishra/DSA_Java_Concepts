// Average of all elements in an array.

package ProblemsOnArray;
import java.util.Scanner;

public class AvgArrEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;
        for(int ele:arr){
            sum = sum + ele;
        }

        double avg = (double)sum/arr.length;
        System.out.print("The average of all the elements is: "+avg);

        sc.close();
    }
}