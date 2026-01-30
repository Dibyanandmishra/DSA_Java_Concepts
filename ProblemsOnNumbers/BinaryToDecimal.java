// Write a program to convert Binary number in Decimal number.

package ProblemsOnNumbers;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary Number: ");
        int binary = sc.nextInt();

        int temp = binary;
        int decimal = 0;
        int power = 0;

        while(temp>0){
            int rem = temp % 10;
            decimal = decimal + rem * (int)Math.pow(2,power);
            power ++;
            temp = temp/10;
        }

        System.out.println("The decimal number of "+ binary +" is: "+decimal);
        sc.close();
    }
}
