// You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false. 
// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

package DSAWithFrnds;
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int num = input;
        int sum = 0;
        int count = 0;
        int remainder;

        while(input != 0){
            count++;
            input = input/10;
        }
        input = num;
        
        for(int i=1; i<=count; i++){
            remainder = input % 10;
            sum = sum + (int)Math.pow(remainder, count);
            input = input/10;
        }
        
        if(sum == num){
            System.out.print("The number "+ num +" is an amstrong Number");
        }
        else{
            System.out.print("The number "+ num +" is not an amstrong Number");
        }
        sc.close();
    }
}
