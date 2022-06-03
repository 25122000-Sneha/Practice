package HarshadNumber;
import java.util.*;
public class HarshadNumber {
    static int sum(int n){
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum += lastDigit;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        if(num % sum(num) == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}
