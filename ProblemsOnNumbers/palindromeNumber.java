// Problem Statement: Given an integer N, return true if it is a palindrome else return false.
// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

package ProblemsOnNumbers;
import java.util.Scanner;

public class palindromeNumber {
    public static boolean isPalindrome(int n) {
        int revNum = 0;
        int dup = n;

        while (n > 0) {
            int rem = n % 10;
            revNum = revNum * 10 + rem;
            n = n / 10;
        }
        return dup == revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n+" is Palindrome Number");
        } else {
            System.out.println(n+" is Not a Palindrome Number");
        }

        sc.close();
    }
}


// Algorithm
// Initialise an integer revNum to 0. This variable will store the reverse of the number.
// Make a duplicate of the original number and store it in an integer dup for later comparison.
// Run a while loop with the condition n>0 to reverse the number and at each iteration
// Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.
// Update the revNum by multiplying it by 10 and adding the last digit ld.
// Update n by integer division with 10 effectively removing the last digit.
// After the loop, check if the original number dup is equal to the reversed number revNum.
// If they are equal, return true indicating the number is a palindrome.
// If they are not equal, return false indicating that the number is not a palindrome.