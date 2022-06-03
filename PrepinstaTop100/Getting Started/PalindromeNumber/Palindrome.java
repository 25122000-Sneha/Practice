package PalindromeNumber;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int num = n;
        reader.close();

        int reversed =0;

        while(n!=0){
            int digit = n % 10;
            reversed = reversed*10 + digit;
            n = n/10;
        }

        if(reversed == num){
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
}
