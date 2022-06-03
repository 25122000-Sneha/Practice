package StrongNumber;
import java.util.Scanner;

public class StrongNumber {
    static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }




    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        int digit;
        int n = num;
        int sum = 0;
        while(n!=0){
            digit = n%10;
            sum += factorial(digit);
            n = n/10;
        }
        if(sum == num){
            System.out.println("Yes, it's a strong number");
        }
        else{
            System.out.println("No, it's not a strong number");
        }
    }
}
