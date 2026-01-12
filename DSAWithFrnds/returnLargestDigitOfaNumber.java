// You are given an integer n. Return the largest digit present in the number. 

package DSAWithFrnds;

import java.util.Scanner;

public class returnLargestDigitOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxNum = 0;
        int num1;
        while(num != 0){
            num1 = num % 10;
            if(maxNum < num1) maxNum = num1;
            num = num/10;
        }
        System.out.print( " The largest digit present is: "+ maxNum);
        sc.close();
    }
}
