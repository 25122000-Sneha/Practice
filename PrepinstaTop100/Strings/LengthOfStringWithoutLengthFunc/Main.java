package Strings.LengthOfStringWithoutLengthFunc;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();

        int len = 0;
        for(char c : str.toCharArray())
        {
            len++;
        }
        System.out.println("Length of the String is "+len);
        reader.close();
    }
}
