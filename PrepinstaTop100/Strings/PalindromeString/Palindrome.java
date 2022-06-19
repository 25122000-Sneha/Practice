package Strings.PalindromeString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();

        String reversedStr = "";

        for(int i=str.length() - 1; i>=0; i--)
        {
            reversedStr += str.charAt(i);
        }
        if(reversedStr.equals(str))
        {
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }

    }
}
