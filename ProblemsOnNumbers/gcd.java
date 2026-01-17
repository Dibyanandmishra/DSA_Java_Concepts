// You are given two integers n1 and n2. You need to find the GCD of the two given numbers. 

package ProblemsOnNumbers;
import java.util.Scanner;

public class gcd {
    // BRUTE FORCE
    // public static int findGCD(int n1, int n2){
    //     int small;
    //     int large;
    //     int gcd =1;
    //     if( n1<= n2){
    //         small = n1;
    //         large = n2;
    //     }else{
    //         small = n2;
    //         large = n1;
    //     }
    //     for(int i=2; i<=small; i++){
    //         if(small%i == 0 && large%i == 0){
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }

    // GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.print("GCD of "+n1 +" & "+n2+" is: "+ findGCD(n1, n2));
        sc.close();
    }
}
