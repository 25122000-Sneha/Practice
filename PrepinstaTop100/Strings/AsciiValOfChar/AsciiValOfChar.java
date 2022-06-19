package Strings.AsciiValOfChar;
import java.util.*;
public class AsciiValOfChar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);

        //Typecasting from char to int
        int i = c;
        System.out.println("ASCII val of "+c+" is "+i);
        reader.close();
    }
}
