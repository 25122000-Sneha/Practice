package Strings.SumOfNumbersInString;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();
        int sum = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i))){
                String s= String.valueOf(str.charAt(i));     //char to String
                sum += Integer.parseInt(s);                 //string to int
            }
        }
        System.out.println(sum);
    }
}
