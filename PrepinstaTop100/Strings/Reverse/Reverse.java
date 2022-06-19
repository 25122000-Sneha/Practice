package Strings.Reverse;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();

        String reversedStr = "";

        for(int i=str.length() - 1; i>=0; i--)
        {
            reversedStr += str.charAt(i);
        }
        
        System.out.println("Reversed String : "+reversedStr);
    }
}
