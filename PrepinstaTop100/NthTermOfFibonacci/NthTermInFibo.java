package NthTermOfFibonacci;
import java.util.*;
public class NthTermInFibo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int a=0, b=1;
        int count = 2;
        int sum = 0;
        while(count!=n){
            sum = a+b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(n+"th term of Fibonacci Series is "+sum);
    }
}
