package Strings.ToggleCase;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String newStr = "";
        reader.close();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                newStr += Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                newStr += Character.toUpperCase(ch);

            }
        }

        System.out.println("The new string is "+newStr);
    }
}
