package Getting_Started.PositiveOrNegative;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        if(num > 0){
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        reader.close();
    }
}
