// Given an array of integers nums, sort the array in non-decreasing order using the merge sort algorithm and return the sorted array. 

package sorting;
import java.util.Scanner;

public class MergeSort {

    public static int[] merge_sort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        for(int i = 0; i < mid; i++){
            leftArr[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            rightArr[i - mid] = arr[i];
        }

        leftArr = merge_sort(leftArr);
        rightArr = merge_sort(rightArr);

        return merge(leftArr, rightArr);
    }

    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while(i < left.length){
            result[k++] = left[i++];
        }

        while(j < right.length){
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        arr = merge_sort(arr);

        System.out.print("Sorted Array is: ");
        for(int value : arr){
            System.out.print(value + " ");
        }
        sc.close();
    }
}
