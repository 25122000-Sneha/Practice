package Getting_Started.SumOfDigits;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int sum = 0;
        int num = n;
        while(n!=0){
            int digit = n%10;
            sum += digit;
            n = n/10;
        }
        System.out.println("Sum of digits of "+num+" is "+sum);
    }
}
