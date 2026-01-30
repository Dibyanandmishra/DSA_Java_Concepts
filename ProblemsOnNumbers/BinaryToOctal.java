// Write a program to convert Binary number in Octal number.

package ProblemsOnNumbers;

import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary Number: ");
        int binary = sc.nextInt();

        int octal = 0;
        int place = 1;

        while (binary>0) {
            int temp = binary % 1000;
            int decimal = 0;
            int power = 0;
    
            while(temp>0){
                int rem = temp % 10;
                decimal = decimal + rem * (int)Math.pow(2,power);
                power ++;
                temp = temp/10;
            }

            octal = octal + (decimal * place);
            place = place*10;
            binary = binary/1000;
        }


        System.out.println("The octal number is: "+octal);
        sc.close();
    }
}
