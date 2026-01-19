// Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum no. of times. If there are multiple elements that appear a maximum number of times, find the smallest of them. 

package ProblemsOnArray;
import java.util.HashMap;
import java.util.Scanner;

public class highestOccurringElement {
    public static void highestOccurring(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        // Find highest occurring element
        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                ans = key;
            }
            else if (currentFreq == maxFreq) {
                ans = Math.min(ans, key);
            }
        }

        System.out.println("Highest occurring element: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        highestOccurring(arr);
        sc.close();
    }
}
