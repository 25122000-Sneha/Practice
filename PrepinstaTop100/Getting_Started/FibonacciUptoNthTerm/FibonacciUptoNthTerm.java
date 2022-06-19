package Getting_Started.FibonacciUptoNthTerm;
import java.util.*;
public class FibonacciUptoNthTerm {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count = 0;
        int a=0, b=1;
        System.out.println("Fibonacci series upto "+n+"th term:");
        System.out.print(a+" ");
        System.out.print(b+" ");
        count = 2;
        int sum = 0;
        while(count != n){
            sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
            count++;
        }
        reader.close();

    }
}
