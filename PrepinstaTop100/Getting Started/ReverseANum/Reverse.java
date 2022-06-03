package ReverseANum;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        
        int reversed =0;

        while(n!=0){
            int digit = n % 10;
            reversed = reversed*10 + digit;
            n = n/10;
        }

        System.out.println("Reversed is : "+reversed);
    }
}
