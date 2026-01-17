// You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order. 

package ProblemsOnNumbers;
import java.util.*;

public class DivisorsOfNumber {

    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);

                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + ": " + findDivisors(n));
        sc.close();
    }
}
