package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int sum = 0;
        reader.close();
        for(int i=1; i<num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}
