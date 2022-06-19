package Strings.CapitalizeFirstAndLast;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();

        String[] strArr = str.split(" ");
        StringBuilder s = new StringBuilder();

        for(String word : strArr){
            String newWord = "";
            

            String firstChar = word.substring(0, 1);
            String restOfWord = word.substring(1, word.length() - 1);
            String lastChar = String.valueOf(word.charAt(word.length() - 1));

            newWord += firstChar.toUpperCase() + restOfWord + lastChar.toUpperCase();

            s.append(newWord + " ");
            
        }
        System.out.println(s);

    }
}
