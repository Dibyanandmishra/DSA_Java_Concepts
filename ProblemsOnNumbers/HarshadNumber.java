// check if a number is Harshad Number
// A Harshad number is a number that is divisible by the sum of its digits.

package ProblemsOnNumbers;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        if(num%sum == 0) System.out.print(num+" is a Harshad Number");
        else System.out.print(num+" is not a Harshad Number");

        sc.close();
    }
}
