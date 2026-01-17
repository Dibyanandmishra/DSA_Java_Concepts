// You are given two integers n1 and n2. You need to find the LCM of the two given numbers. 

package ProblemsOnNumbers;
import java.util.Scanner;

public class lcm {
    // GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    // LCM × GCD = n1 × n2
    public static int findLCM(int n1, int n2) {
        int gcd = findGCD(n1, n2);
        return (n1 * n2) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.print("LCM of "+n1 +" & "+n2+" is: "+ findLCM(n1, n2));
        sc.close();
    }
}
