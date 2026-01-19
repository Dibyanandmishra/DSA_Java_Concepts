// Given an array of n integers, find the second most frequent element in it.
// If there are multiple elements that appear second most frequent times, find the smallest of them.

package ProblemsOnArray;
import java.util.HashMap;
import java.util.Scanner;

public class secondHighestOccurring {

    public static void secondHighest(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0, secondMaxFreq = 0;
        int maxElem = Integer.MAX_VALUE;
        int secondMaxElem = Integer.MAX_VALUE;

        // Find first & second highest frequency
        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            // New highest frequency
            if (currentFreq > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxElem = maxElem;

                maxFreq = currentFreq;
                maxElem = key;
            }
            // Tie for highest frequency
            else if (currentFreq == maxFreq) {
                maxElem = Math.min(maxElem, key);
            }
            // New second highest frequency
            else if (currentFreq > secondMaxFreq) {
                secondMaxFreq = currentFreq;
                secondMaxElem = key;
            }
            // Tie for second highest frequency
            else if (currentFreq == secondMaxFreq) {
                secondMaxElem = Math.min(secondMaxElem, key);
            }
        }

        if (secondMaxFreq == 0) {
            System.out.println("No second most frequent element");
        } else {
            System.out.println("Second highest occurring element: " + secondMaxElem);
        }
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

        secondHighest(arr);
        sc.close();
    }
}

