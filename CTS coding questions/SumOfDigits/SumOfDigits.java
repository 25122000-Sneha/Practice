/*Write a program to find out some of the digits of the given number.*/
package SumOfDigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int num = n;
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum += lastDigit;
            n = n/10;
        }
        System.out.println("The sum of digits of "+num+" is "+sum);
    }
}
