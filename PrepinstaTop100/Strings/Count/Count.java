package Strings.Count;
import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int symbols = 0;
        int whiteSpaces = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }
            else if(ch>='a' && ch<='z')
            {
                consonants ++;
            }
            else if(ch>=0 && ch<=9)
            {
                digits++;
            }
            else if(ch==' ')
            {
                whiteSpaces ++;
            }
            else
            {
                symbols++;
            }
        }
        System.out.println("No. of vowels = "+vowels);
        reader.close();
    }
}
