package PowerOfNum;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = reader.nextInt();
        System.out.println("Enter power: ");
        int power = reader.nextInt();
        int result = (int) Math.pow(num,power);
        System.out.println(num+" to the power of "+power+" is "+result);
        reader.close();
    }
}
