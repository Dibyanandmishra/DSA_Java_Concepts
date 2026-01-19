// You are given an integer n. You need to find out the number of prime numbers in the range[1,n](inclusive).
// Return the number of prime numbers in the range.

package ProblemsOnNumbers;
import java.util.Scanner;

public class countPrime {
    public static int countPrimes(int n){
        // 1 and 0 are not prime
        if(n<2) return 0;
        
        boolean[] isPrime = new boolean[n+1];

        // Assume all are prime
        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }

        // Mark non-prime numbers
        for(int i=2; i*i <=n; i++){
            for(int j=i*i; j<=n; j +=i){
                isPrime[j] = false;
            }
        }

        // Count primes
        int count = 0;
        System.out.print("The prime numbers are: ");
        for(int i=2; i<=n; i++){
            if (isPrime[i]) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of primes = " + countPrimes(n));
        sc.close();
    }
}

//  ALGO: Sieve of Eratosthenes
// If n < 2, return 0 (because no prime numbers exist).
// Create a boolean array isPrime[0…n].
// Initialize all values of the array from index 2 to n as true.
// Mark isPrime[0] and isPrime[1] as false.
// For i from 2 to √n:
//     * If isPrime[i] is true:
//         * For j from i × i to n, incrementing by i:
//             * Mark isPrime[j] as false.
// Initialize a variable count = 0.
// For i from 2 to n:
//     * If isPrime[i] is true, increment count.
// Return count.