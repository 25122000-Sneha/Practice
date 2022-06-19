package Strings.alpha;
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        reader.close();

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Non-alphabet");
        }
    }
}
