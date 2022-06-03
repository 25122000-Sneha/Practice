package AutomorphicNumber;
import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        int squaredNum = (int)Math.pow(num, 2);
        int lastDigit = squaredNum % 10;
        if(lastDigit == num){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
    }
}
