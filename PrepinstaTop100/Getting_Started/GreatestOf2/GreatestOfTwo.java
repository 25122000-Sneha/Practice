package Getting_Started.GreatestOf2;

import java.util.Scanner;
public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int greater = a > b ? a : b;
        System.out.println(greater);
        reader.close();
    }
}
