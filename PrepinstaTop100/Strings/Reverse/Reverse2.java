package Strings.Reverse;

import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();
        
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        System.out.println("Reversed String : "+s);
    }
}
