/* Armstrong number is any number following the given rule –

abcd… = an + bn + cn + dn + …
Where n is the order(length/digits in number)*/ 

package Getting_Started.ArmstrongNumber;

import java.util.Scanner;

public class Armstrong {

    public static int noOfDigits(int n){
        int digits = 0;
        while(n!=0){
            digits ++;
            n = n/10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();

        int len = noOfDigits(num);
        int n = num;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit, len);
            n = n/10;
        }
        if(sum == num){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }

    }
}