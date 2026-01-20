// Find all the palindrome numbers in a given range 

package ProblemsOnNumbers;
import java.util.Scanner;

public class palindromeInRange {

    public static void palindromeRange(int n1, int n2) {

        for (int i = n1; i <= n2; i++) {
            int temp = i;
            int revNum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                revNum = revNum * 10 + rem;
                temp = temp / 10;
            }

            if (revNum == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("The palindrome numbers in the range are: ");
        palindromeRange(n1, n2);
        sc.close();
    }
}
