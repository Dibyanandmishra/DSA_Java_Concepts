// Given an array of integers nums, sort the array in non-decreasing order using the intertion sort algorithm and return the sorted array. 

package sorting;
import java.util.Scanner;

public class intertionSort {
    public static int[] intertion_sort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Insert key at correct position
            nums[j + 1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        intertion_sort(arr);

        System.out.print("Sorted Array is: ");
        for(int value: arr){
            System.out.print(value + " ");
        }
        sc.close();
    }
}
