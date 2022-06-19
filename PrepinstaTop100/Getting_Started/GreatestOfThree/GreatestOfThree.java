package Getting_Started.GreatestOfThree;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(greatest);
        reader.close();
    }
}
