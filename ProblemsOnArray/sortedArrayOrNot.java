// Given a array of size n. Check whether the array elements are sorted in ascending order or not.

package ProblemsOnArray;
import java.util.Scanner;

public class sortedArrayOrNot {
    public static boolean isSorted(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)){
            System.out.println("The given is sorted already");
        }
        else{
            System.out.println("The given is not sorted");
        }
        sc.close();
    }
}
