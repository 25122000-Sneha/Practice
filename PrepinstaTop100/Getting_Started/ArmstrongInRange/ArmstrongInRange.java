package ArmstrongInRange;

import java.util.Scanner;

public class ArmstrongInRange {

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
        int low = reader.nextInt();
        int high = reader.nextInt();
        reader.close();
        System.out.println("Set of armstrong numbers between"+low+" and "+high+" are:");
        for(int n=low; n<=high; n++){
            int len = ArmstrongInRange.noOfDigits(n);
            int num = n;
            int sum = 0;
            while(num!=0){
                int digit = num%10;
                sum += Math.pow(digit, len);
                num = num/10;
            }
            if(sum == n){
                System.out.println(n);
            }
        }
    }
}
