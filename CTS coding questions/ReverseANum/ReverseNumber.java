package ReverseANum;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int num = n;
        int remainder = 0;
        while(n!=0)
        {
            int lastDigit = n%10;
            remainder = remainder*10 + lastDigit;
            n = n/10;
        }
        System.out.println("The reverse of "+num+" is "+remainder);

        //Palindrome number check
        if(num == remainder){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
}
